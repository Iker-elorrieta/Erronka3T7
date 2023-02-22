package Metodoak;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Objetos.Aretoa;
import Objetos.Bezeroa;
import Objetos.Filma;
import Objetos.Ordutegia;
import Objetos.Sarrera;
import Objetos.Zinema;

public class Metodoak {
	private int Codzinema;
	private int ZbkAretoak;
	private Aretoa[] areto;
	private String IzZinema;
	
	private String AretoIzena;
	private int CodAretoa;
	private Ordutegia[] ordutegi;
	
	private int CodFilma;
	private String iraupena;
	private String generoa;
	private int kostua;
	private String NomFilma;
	Calendar Fecha=null;
	
	private String DNI;
	private String izena;
	private String Abizena1;
	private String Abizena2;
	private String sexua;
	private String pasahitza;
	
	private int CodSarrera;
	private Bezeroa beze;
	private int prezioa;
	
	
	public Zinema[] ZinemaHasieratu() {
		Zinema[] HasieratuZ= new Zinema[0];
		Aretoa[] HasieratuA= new Aretoa[0];
		Ordutegia[] HasieratuO= new Ordutegia[0];
		int CodAretoa = 1;
		
		Connection conexion;					
		try {
			conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost:3306/db_zinema", "root","");
			Statement comando = (Statement) conexion.createStatement();	
			ResultSet request = comando.executeQuery("SELECT * FROM cine;");

			int Codzinema = 1;
			//Zinema bakoitzaren informazioa gorde
			while(request.next()) {
				Zinema zinema = new Zinema();
				
				zinema.setCodzinema(Integer.parseInt(request.getString(1)));
				zinema.setIzZinema(request.getString(2));
				zinema.setZbkAretoak(Integer.parseInt(request.getString(3)));
				
				Connection conexion1;
				try {	
					conexion1 = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost:3306/db_zinema", "root","");
					Statement comando1 = (Statement) conexion1.createStatement();	
					ResultSet request1 = comando1.executeQuery("Select CodSala, nomsala from salas a join cine z ON a.CodCine=z.CodCine WHERE a.CodCine="+Codzinema+";");		
					HasieratuA= new Aretoa[0];
					
					//Zinema bakoitzean dauden aretoen informazioa gorde
					while(request1.next()) {
						Aretoa areto = new Aretoa();
						
						areto.setCodAretoa(Integer.parseInt(request1.getString(1)));
						areto.setAretoIzena(request1.getString(2));
						
						//Zinema bakoitzena dauden aretoen Saioak kargatzen ditu
						Connection conexion2;
						try {	
							conexion2 = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost:3306/db_zinema", "root","");
							Statement comando3 = (Statement) conexion2.createStatement();	
							ResultSet request2 = comando3.executeQuery("SELECT CodSala, CodSesion, fecha, f.CodPeli, titulo, genero, duracion, f.precio FROM sesiones s join peliculas f using(CodPeli) join salas using (CodSala) where CodSala="+CodAretoa+" order by fecha,hora;");		
							ordutegi= new Ordutegia[0];
							
							//Zinema bakoitzena dauden aretoen Saioak gordetzen ditu
							while(request2.next()) {
								Ordutegia ordutegi = new Ordutegia();
								
								ordutegi.setCodOrdutegiak(Integer.parseInt(request2.getString(2)));
								
								//Ordua 
								String fecha = request2.getString(3);
								String[] fechaArraya = fecha.split("-");
								Calendar cal = Calendar.getInstance();
								cal.set(Calendar.YEAR,Integer.parseInt(fechaArraya[0]));
								cal.set(Calendar.MONTH,Integer.parseInt(fechaArraya[1]));
								cal.set(Calendar.DAY_OF_MONTH,Integer.parseInt(fechaArraya[2]));
								ordutegi.setFecha(cal);			
													
								//Filma
								Filma filma = new Filma(Integer.parseInt(request2.getString(4)),request2.getString(5),request2.getString(6),Integer.parseInt(request2.getString(7)), fecha);
								ordutegi.setFilma(filma);
								
								//berridatzi ordutegien arraya
								Ordutegia[] ordutegi1 = new Ordutegia[HasieratuO.length+1];
								for(int i =0;i<HasieratuO.length;i++){
									ordutegi1[i]=HasieratuO[i];
								}
								ordutegi1[HasieratuO.length] = ordutegi;
								HasieratuO = ordutegi1;								
								
							}
							conexion2.close();
						}catch(SQLException ex) {
							System.out.println("SQLException: "+ ex.getMessage());
							System.out.println("SQLState: "+ ex.getSQLState());
							System.out.println("ErrorCode: "+ ex.getErrorCode());
						}
						
						areto.setOrdutegi(ordutegi);
						
						//berridatzi aretoen arraya
						Aretoa[] areto1 = new Aretoa[HasieratuA.length+1];
						for(int i =0;i<HasieratuA.length;i++){
							areto1[i]=HasieratuA[i];
						}
						areto1[HasieratuA.length] = areto;
						HasieratuA = areto1;
						CodAretoa++;
					}
					conexion1.close();
				}catch(SQLException ex) {
						System.out.println("SQLException: "+ ex.getMessage());
						System.out.println("SQLState: "+ ex.getSQLState());
						System.out.println("ErrorCode: "+ ex.getErrorCode());
				}			
				zinema.setAreto(areto);
				
				//berridatzi zinemen arraya
				Zinema[] zinema1 = new Zinema[HasieratuZ.length+1];				
				for(int i=0;i<HasieratuZ.length;i++) {
					zinema1[i]=HasieratuZ[i];					
				}	
				zinema1[HasieratuZ.length] = zinema;				
				HasieratuZ=zinema1;
				Codzinema++;
			}			
			conexion.close();
		}catch(SQLException ex) {
			System.out.println("SQLException: "+ ex.getMessage());
			System.out.println("SQLState: "+ ex.getSQLState());
			System.out.println("ErrorCode: "+ ex.getErrorCode());
		}
		return HasieratuZ;
	}
	
	public String[][] FilmakErakutsi(Zinema[] zine, int aukera){
		String[][] arrayfilmak = new String[0][4];
		boolean filmaA=false;
		
		for(int i=0;i<zine[aukera-1].getAreto().length;i++) {
			for(int j=0;j<zine[aukera-1].getAreto()[i].getOrdutegi().length;j++) {
				String Izenburua= zine[aukera-1].getAreto()[i].getOrdutegi()[j].getFilma().getNomFilma();
				for(int k=0;k<arrayfilmak.length && !filmaA;k++) {
					if(arrayfilmak[k][0].equals(Izenburua)) {
						filmaA=true;
					}
				}
				if(!filmaA) {					
					//Ordutegien arraya berridatzi
					String[][] filmak1 = new String[arrayfilmak.length+1][4];
					for(int h =0;h<arrayfilmak.length;h++){
						for(int l=0;l<arrayfilmak[h].length;l++){
							filmak1[h][l]=arrayfilmak[h][l];
						}
					}
					filmak1[arrayfilmak.length][0]= Izenburua;
					filmak1[arrayfilmak.length][1]= zine[aukera-1].getAreto()[i].getOrdutegi()[j].getFilma().getGeneroa();
					filmak1[arrayfilmak.length][2]= String.valueOf(zine[aukera-1].getAreto()[i].getOrdutegi()[j].getFilma().getIraupena());
					filmak1[arrayfilmak.length][3]= String.valueOf(zine[aukera-1].getAreto()[i].getOrdutegi()[j].getFilma().getKostua());
					arrayfilmak = filmak1;					
					
				}
				
			}
		}
		
		return arrayfilmak;
	}
}