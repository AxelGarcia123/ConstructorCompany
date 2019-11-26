package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Autorizacion;
import modelo.Permiso;

public class TablaAutorizacion {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaAutorizacion(Connection conexion) {
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
	
	public Autorizacion getAutorizacionStatus(int clavePermiso){
		String sql = "select fecha_aut, status_aut from autorizacion where cve_permcont = '"+ clavePermiso +"'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				Autorizacion autorizacion = new Autorizacion();
				autorizacion.setStatusAutoriza(rs.getString("status_aut"));
				autorizacion.setFechaAutoriza(rs.getDate("fecha_aut"));
				return autorizacion;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}