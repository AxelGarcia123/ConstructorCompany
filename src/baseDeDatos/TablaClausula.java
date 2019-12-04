package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Clausula;

public class TablaClausula {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaClausula(Connection conexion) {
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
	
	public List<Clausula> getClausulas(int claveCont) {
		String sql = "select c.cve_cla, descripcion from contratoclausula con join clausula c " + 
				"on con.cve_cla = c.cve_cla " + 
				"where con.cve_cont = '"+ claveCont +"'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Clausula> clausulas = new ArrayList<>();
			while(rs.next()) {
				Clausula clausula = new Clausula();
				clausula.setClaveClausula(rs.getInt("cve_cla"));
				clausula.setDescripcionClausula(rs.getString("descripcion"));
				clausulas.add(clausula);
			}
			return clausulas;
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<Clausula> getTodasClausulas() {
		String sql = "select * from clausula";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Clausula> clausulas = new ArrayList<>();
			while(rs.next()) {
				Clausula clausula = new Clausula();
				clausula.setClaveClausula(rs.getInt("cve_cla"));
				clausula.setDescripcionClausula(rs.getString("descripcion"));
				clausulas.add(clausula);
			}
			return clausulas;
		} catch (Exception e) {
			return null;
		}
	}
}