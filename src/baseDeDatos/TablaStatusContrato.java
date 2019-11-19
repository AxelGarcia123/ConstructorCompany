package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Persona;
import modelo.StatusContrato;

public class TablaStatusContrato {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaStatusContrato(Connection conexion) {
		super();
		this.conexion = conexion;

		try {
			statement = conexion.createStatement();
		} catch (Exception e) {
			e.toString();
		} 
	}
	
//	public String guardar(Empleado empleado) {
//		String sql = "insert into empleado values(null,'" + empleado.getPaterno() + "','" + empleado.getMaterno() + "','" + 
//				empleado.getNombre() + "','" + empleado.getCargo() + "')";
//		try {
//			statement.executeUpdate(sql);
//			return "Producto registrado";
//		} catch (SQLException e) {
//			System.out.println(e.toString());
//			return sql.toString();
//		}
//	}
	
	public String getStatus(int clave) {
		String sql = "select status_sta from statuscont where cve_cont = '"+ clave +"'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				return rs.getString("status_sta");
			}
			else
				return null;
		} catch (SQLException e) {
			System.out.println(e.toString());
			return null;
		}
	}
}