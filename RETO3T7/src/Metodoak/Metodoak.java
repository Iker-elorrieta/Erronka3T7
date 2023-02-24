package Metodoak;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Objetos.Aretoa;
import Objetos.Filma;
import Objetos.Ordutegia;
import Objetos.Zinema;

public class Metodoak {
	Aretoa[] aretoa;
	Ordutegia[] ordutegia;
	Filma[] filmaa;
	Calendar Fecha=null;
	String aukeratutakozinema="";
	int CodCinegorde = 0;
	
	
	public Zinema[] ZinemaHasieratu() {
		Zinema[] HasieratuZ= new Zinema[0];
		Aretoa[] HasieratuA= new Aretoa[0];
		Ordutegia[] HasieratuO= new Ordutegia[0];
		int CodAretoa = 1;
		
		Connection conexion;					
		try {
			conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost:3306/db_zinema", "root","");
			Statement comando = (Statement) conexion.createStatement();	
			ResultSet request = comando.executeQuery("SELECT * FROM zinema;");

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
					ResultSet request1 = comando1.executeQuery("Select CodAretoa, AretoIzena from aretoa join zinema ON aretoa.Codzinema=zinema.Codzinema WHERE aretoa.Codzinema="+Codzinema+";");		
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
							ResultSet request2 = comando3.executeQuery("SELECT CodAretoa, CodOrdutegia, fecha, filma.CodFilma, Nomfilma, generoa, iraupena, filma.prezioa FROM ordutegia join filma using(CodFilma) join aretoa using (CodAretoa) where CodAretoa="+CodAretoa+" order by fecha,hora");		
							ordutegia= new Ordutegia[0];
							
							//Zinema bakoitzena dauden aretoen Saioak gordetzen ditu
							while(request2.next()) {
								Ordutegia ordutegi = new Ordutegia();
								ordutegi.setCodOrdutegiak(Integer.parseInt(request2.getString(1)));
								
								//Ordua 
								String fecha = request2.getString(3);
								String[] fechaArraya = fecha.split("-");
								Calendar cal = Calendar.getInstance();
								cal.set(Calendar.YEAR,Integer.parseInt(fechaArraya[0]));
								cal.set(Calendar.MONTH,Integer.parseInt(fechaArraya[1]));
								cal.set(Calendar.DAY_OF_MONTH,Integer.parseInt(fechaArraya[2]));
								ordutegi.setFecha(null);			
													
								//Filma
								Filma filma = new Filma(Integer.parseInt(request2.getString(4)),request2.getString(5),request2.getString(6),Integer.parseInt(request2.getString(7)), fecha);
								ordutegi.setFilma(filma);
								
								//ordutegiaren arraya
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
						
						areto.setOrdutegi(ordutegia);
						
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
				zinema.setAreto(aretoa);
				
				//zinemen arraya
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
	public Filma[] FilmakErakutsi(String zinema, Zinema[] zine) {
		zine = ZinemaHasieratu();
		Aretoa[] HasieratuA = new Aretoa[0];
		Ordutegia[] HasieratuO = new Ordutegia[0];
		Filma[] HasieratuF = new Filma[0];
		
		Connection conexion;
		for (int i = 0; i < zine.length; i++) {
			if (zine[i].getIzZinema().equals(zinema)) {
				aukeratutakozinema = zinema;
				try {
					conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost:3306/db_zinema", "root","");
					Statement comando = (Statement) conexion.createStatement();	
					CodCinegorde = zine[i].getCodzinema();
					String sql = "SELECT * FROM aretoa where aretoa.Codzinema = " + "'" + zine[i].getCodzinema() + "'";
					ResultSet resul = comando.executeQuery(sql);
					while (resul.next()) {
						Aretoa areto = new Aretoa();
						areto.setCodAretoa(resul.getInt(1));
						areto.setAretoIzena(resul.getString(2));
						Aretoa[] areto1 = new Aretoa[HasieratuA.length + 1];
						for (int j = 0; j < HasieratuA.length; j++) {
							areto1[j] = HasieratuA[j];
						}
						areto1[HasieratuA.length] = areto;
						HasieratuA = areto1;
						aretoa = HasieratuA;
					}
					for (int k = 0; k < HasieratuA.length; k++) {
						Statement comando1 = (Statement) conexion.createStatement();	
						String sql1 = "SELECT * FROM ordutegia where ordutegia.CodAretoa = " + "'"+ HasieratuA[k].getCodAretoa() + "'";
						ResultSet resul1 = comando1.executeQuery(sql1);
						while (resul1.next()) {
							Ordutegia ordutegi = new Ordutegia();
							ordutegi.setFecha(resul1.getDate(2));
							ordutegi.setOrdua(resul1.getTime(3));
							ordutegi.setCodOrdutegiak(resul1.getInt(1));
							Ordutegia[] ordutegi1 = new Ordutegia[HasieratuO.length + 1];
							for (int l = 0; l < HasieratuO.length; l++) {
								ordutegi1[l] = HasieratuO[l];
							}
							ordutegi1[HasieratuO.length] = ordutegi;
							HasieratuO = ordutegi1;
							ordutegia = HasieratuO;
						}

					}
					for (int j = 0; j < HasieratuO.length; j++) {
						Statement comando2 = (Statement) conexion.createStatement();
						String sql2 = "SELECT * FROM ordutegia,filma where ordutegia.CodFilma=filma.CodFilma and ordutegia.CodOrdutegia = "
								+ "'" + HasieratuO[j].getCodOrdutegiak() + "'";
						ResultSet resul2 = comando2.executeQuery(sql2);
						while (resul2.next()) {
							Filma filma = new Filma();
							filma.setIraupena(resul2.getString(4));
							filma.setGeneroa(resul2.getString(5));
							filma.setCodFilma(resul2.getInt(1));
							filma.setNomFilma(resul2.getString(2));
							filma.setPrezioa(resul2.getDouble(3));
							Filma[] filma1= new Filma[HasieratuF.length + 1];
							for (int m = 0; m < HasieratuF.length; m++) {
								filma1[m] = HasieratuF[m];
							}
							filma1[HasieratuF.length] = filma;
							HasieratuF = filma1;
							filmaa = HasieratuF;
						}
					}
				} catch (SQLException ex) {
					System.out.println("SQLException: "+ ex.getMessage());
					System.out.println("SQLState: "+ ex.getSQLState());
					System.out.println("ErrorCode: "+ ex.getErrorCode());
				}
			}
		}
		return HasieratuF;

	}	
}
