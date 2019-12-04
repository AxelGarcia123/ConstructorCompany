package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
		String sql = "select fecha_ava, sum(cantidad_ava), fecha_traact, cant_traact from avance a join trabajadoractividad t " + 
				"on a.cve_traact = t.cve_traact " + 
				"where fecha_traact = (select max(fecha_traact) from trabajadoractividad where cve_traact = '" + claveTrabajador + "') " + 
				"and t.cve_traact = '" + claveTrabajador + "'" + 
				"and fecha_ava between (select max(fecha_traact) from trabajadoractividad where cve_traact = '" + claveTrabajador + "') and curdate()";
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