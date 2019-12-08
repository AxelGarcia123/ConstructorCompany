package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Colonia;

public class TablaColonia {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaColonia(Connection conexion) {
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
	
	public List<Colonia> getColonias(int codigoPostal) {
		String sql = "select nom_col, cve_col from colonia where cp_cod = '"+ codigoPostal +"'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Colonia> colonias = new ArrayList<Colonia>();
			while(rs.next()) {
				Colonia colonia = new Colonia();
				colonia.setClaveColonia(rs.getInt("cve_col"));
				colonia.setNombreColonia(rs.getString("nom_col"));
				
				colonias.add(colonia);
			}
			return colonias;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
	
	public List<Integer> getNumeroColonias(int codigoPostal) {
		String sql = "call sp_numerocolonias('"+ codigoPostal +"')";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Integer> filas = new ArrayList<Integer>();
			while(rs.next()) {
				filas.add(rs.getInt("count(nom_col)"));
			}
			return filas;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}