package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Ciudad;

public class TablaCiudad {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaCiudad(Connection conexion) {
		super();
		this.conexion = conexion;

		try {
			statement = conexion.createStatement();
		} catch (Exception e) {
			e.toString();
		} 
	}
	
	public Ciudad getCiudad(int codigoPostal) {
		String sql = "select ci.cve_ciu, nom_ciu from codigo c join ciudad ci "
				+ "on c.cve_ciu = ci.cve_ciu"
				+ " where cp_cod = '"+ codigoPostal + "'";
		
		try {
			ResultSet rs = statement.executeQuery(sql);
			Ciudad ciudad = new Ciudad();
			if(rs.next()) {
				ciudad.setClaveCiudad(rs.getInt("cve_ciu"));
				ciudad.setNombreCiudad(rs.getString("nom_ciu"));
			}
			
			return ciudad;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
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
}