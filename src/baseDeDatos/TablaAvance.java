package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Avance;
import modelo.Contrato;

public class TablaAvance {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaAvance(Connection conexion) {
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
	
	public Avance getAvance(int claveTrabajador){
		String sql = "call sp_veravance('" + claveTrabajador + "')";
		try {
			ResultSet rs = statement.executeQuery(sql);
			Avance avance = new Avance();
			if(rs.next()) {
				avance.setCantidadAvance(rs.getInt("sum(cantidad_ava)"));
				avance.setFechaAvance(rs.getDate("fecha_ava"));
				return avance;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}