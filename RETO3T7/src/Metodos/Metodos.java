package Metodos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Objetos.Filmak;

public class Metodos {
	public Filmak[] BDKargatu(Filmak[] filmak) {
		
	try {
		Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes","root","");
				
		Statement comando=(Statement) conexion.createStatement();
		String sql = "SELECT * FROM basededatos";
		ResultSet registro = comando.executeQuery(sql);
		while (registro.next()) {
		System.out.println(registro.getDate("Fecha")+registro.getString("Hora")+registro.getString("De")+registro.getString("Para")
		+registro.getString("Asunto")+registro.getString("Contenido"));
		}
		registro.close();
		conexion.close();
		comando.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	return filmak;
	}

}
