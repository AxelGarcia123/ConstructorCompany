package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
	
	public void registrarMaterial(Material material) {
		String sql = "insert into material values(null, '"+ material.getNombreMaterial() + "', '"+ material.getMarcaMaterial() + "', '" +
				material.getTipoMaterial() + "', '"+ material.getMinimoMaterial() + "', '"+ material.getMaximoMaterial() + "', '"+
				material.getUnidadMedidaMaterial() + "', '"+ material.getContenidoMaterial() + "')";
		try {
			statement.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Material registrado");
		} catch (Exception e) {
			System.out.println(e.toString() + ". Al registrar el material");
		}
	}
	
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
	
	public List<Material> getMarcaMateriales() {
		String sql = "select marca_mat from material group by marca_mat";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Material> materiales = new ArrayList<Material>();
			while(rs.next()) {
				Material material = new Material();
				material.setMarcaMaterial(rs.getString("marca_mat"));
				
				materiales.add(material);
			}
			return materiales;
		} catch (Exception e) {
			System.out.println(e.toString() + ". En tipo de materiales");
			return null;
		}
	}
	
	public List<Material> getUnidadMedida() {
		String sql = "select umedida_mat from material group by umedida_mat";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Material> materiales = new ArrayList<Material>();
			while(rs.next()) {
				Material material = new Material();
				material.setUnidadMedidaMaterial(rs.getString("umedida_mat"));
				
				materiales.add(material);
			}
			return materiales;
		} catch (Exception e) {
			System.out.println(e.toString() + ". En tipo de materiales");
			return null;
		}
	}
	
	public List<Material> getNombreParaResurtir() {
		String sql = "select nom_mat, cve_mat from material"; 
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
}