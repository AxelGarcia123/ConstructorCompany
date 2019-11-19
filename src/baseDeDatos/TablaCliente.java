package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Contrato;
import modelo.Persona;

public class TablaCliente {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaCliente(Connection conexion) {
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
	
	public List<Persona> getCliente(String tipoContrato){
		String sql = "call sp_contratosclientes('" + tipoContrato + "')";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Persona> people = new ArrayList<>();
			while (rs.next()) {
				Persona person = new Persona();
				person.setApellidoMaternoPer(rs.getString("am_per"));
				person.setApellidoPaternoPer(rs.getString("ap_per"));
				person.setNombrePer(rs.getString("nom_per"));
				people.add(person);
			}
			return people;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}