package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Codigo;

public class TablaCodigo {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaCodigo(Connection conexion) {
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
	
	public List<Codigo> getCodigosPostales() {
		String sql = "select cp_cod from codigo";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Codigo> codigos = new ArrayList<Codigo>();
			while(rs.next()) {
				Codigo codigo = new Codigo();
				codigo.setCodigoPostal(rs.getInt("cp_cod"));
				
				codigos.add(codigo);
			}
			return codigos;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}