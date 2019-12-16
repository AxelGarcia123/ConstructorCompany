package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Material;
import modelo.Resurtir;

public class TablaResurtir {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaResurtir(Connection conexion) {
		super();
		this.conexion = conexion;

		try {
			statement = conexion.createStatement();
		} catch (Exception e) {
			e.toString();
		} 
	}
//	num_res | fecha_res  | fechacad_res | cant_res | ppu_res | baja_res | cve_mat
	public void resurtirMaterial(Resurtir material) {
		String sql = "insert into resurtir values(null, '"+ material.getFechaResurtir() + "', '"+ material.getFechaCadResurtir() + "', '"+
				material.getNumResurtir() + "', '"+ material.getPrecioPorUnidadResurtir() + "', '"+ material.getBajaResurtir() + "', '"+
				material.getClaveMaterial() + "')";
		try {
			statement.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Material resurtido");
		} catch (SQLException e) {
			System.out.println(e.toString()+ ". Al resurtir el material");
		}
	}
	/*CON AUTOCOMMIT*/
	public void resurtirMaterialNuevo(Resurtir material, List<Material> materiales) throws SQLException {
		conexion.setAutoCommit(false);
		int claveMat = 0;
		String sql = "";
		
		try {
			for (Material materialNuevo : materiales) {
				sql = "insert into material values(null, '"+ materialNuevo.getNombreMaterial() + "', '"+ materialNuevo.getMarcaMaterial() + "', '" +
						materialNuevo.getTipoMaterial() + "', '"+ materialNuevo.getMinimoMaterial() + "', '"+ materialNuevo.getMaximoMaterial() + "', '"+
						materialNuevo.getUnidadMedidaMaterial() + "', '"+ materialNuevo.getContenidoMaterial() + "')";
				
				statement.executeUpdate(sql);
				
				sql = "select max(cve_mat) from material";
				
				ResultSet rs = statement.executeQuery(sql);
				if(rs.next())
					claveMat = rs.getInt("max(cve_mat)");
				
				sql = "insert into resurtir values(null, '"+ material.getFechaResurtir() + "', '"+ material.getFechaCadResurtir() + "', '"+
						material.getNumResurtir() + "', '"+ material.getPrecioPorUnidadResurtir() + "', '"+ material.getBajaResurtir() + "', '"+
						claveMat + "')";
				
				statement.executeUpdate(sql);
			}
			conexion.commit();
			JOptionPane.showMessageDialog(null, "Material resurtido");
			
		} catch (SQLException e) {
			conexion.rollback();
			System.out.println(e.toString()+ ". Al resurtir el material");
		}
	}
	
	public String getNombreMaterial(int claveM) {
		String sql = "select nom_mat from resurtir r join material m on r.cve_mat = m.cve_mat "
				+ "where r.cve_mat = '"+ claveM + "' group by r.cve_mat";
		
		try {
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next())
				return rs.getString("nom_mat");
			return null;
		} catch (Exception e) {
			System.out.println(e.toString() +". Al obtener el nombre del material");
			return null;
		}
	}
	
	public List<Resurtir> getDatosResurtidos() {
		String sql = "select * from resurtir";
		
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Resurtir> materiales = new ArrayList<Resurtir>();
			while(rs.next()) {
				Resurtir material = new Resurtir();
				material.setNumResurtir(rs.getInt("num_res"));
				material.setFechaResurtir(rs.getDate("fecha_res"));
				material.setFechaCadResurtir(rs.getDate("fechacad_res"));
				material.setNumResurtir(rs.getInt("cant_res"));
				material.setPrecioPorUnidadResurtir(rs.getInt("ppu_res"));
				material.setBajaResurtir(rs.getInt("baja_res"));
				material.setClaveMaterial(rs.getInt("cve_mat"));
				
				materiales.add(material);
			}
			
			return materiales;
		} catch (Exception e) {
			System.out.println(e.toString() +". Al obtener el nombre del material");
			return null;
		}
	}
}