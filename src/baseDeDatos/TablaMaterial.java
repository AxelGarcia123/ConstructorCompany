package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Material;

public class TablaMaterial {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaMaterial(Connection conexion) {
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
	
	public List<Material> getNombreMateriales(String nombre) {
		String sql = "select nom_mat, cve_mat from material where tipo_mat = '"+ nombre +"'"; 
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Material> materiales = new ArrayList<Material>();
			while(rs.next()) {
				Material material = new Material();
				material.setNombreMaterial(rs.getString("nom_mat"));
				material.setClaveMaterial(rs.getInt("cve_mat"));
				
				materiales.add(material);
			}
			return materiales;
		} catch (Exception e) {
			System.out.println(e.toString() + ". En tipo de materiales");
			return null;
		}
	}
	
	public List<Material> getTiposMateriales() {
		String sql = "select tipo_mat from material group by tipo_mat";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Material> materiales = new ArrayList<Material>();
			while(rs.next()) {
				Material material = new Material();
				material.setTipoMaterial(rs.getString("tipo_mat"));
				
				materiales.add(material);
			}
			return materiales;
		} catch (Exception e) {
			System.out.println(e.toString() + ". En tipo de materiales");
			return null;
		}
	}
}