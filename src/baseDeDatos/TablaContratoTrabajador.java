package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.ContratoTrabajador;
import modelo.Persona;

public class TablaContratoTrabajador {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaContratoTrabajador(Connection conexion) {
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
	
	public StringBuilder getArquitecto(int clave) {
		String sql = "select ap_per, am_per, nom_per from contratotra c join persona p "
				+ "on c.cve_per = p.cve_per "
				+ "where c.cve_per = '"+ clave +"'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				StringBuilder arquitecto = new StringBuilder(rs.getString("nom_per") + " "+ rs.getString("ap_per") + " "+ rs.getString("am_per"));
				return arquitecto;
			}
			else
				return null;
		} catch (SQLException e) {
			System.out.println(e.toString());
			return null;
		}
	}
}