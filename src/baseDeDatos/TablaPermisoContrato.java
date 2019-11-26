package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Permiso;
import modelo.PermisoContrato;

public class TablaPermisoContrato {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaPermisoContrato(Connection conexion) {
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
	
	public List<PermisoContrato> getPermisoContrato(int claveContrato){
		String sql = "select pc.cve_permcont, p.cve_perm, tipo_perm, fecha_permcont, costo_permcont, fechain_permcont, " + 
				"fechafin_permcont, descripcion_perm from permisocontrato pc join permiso p " + 
				"on pc.cve_perm = p.cve_perm " + 
				"where pc.cve_cont = '"+ claveContrato +"'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<PermisoContrato> permisosCont = new ArrayList<>();
			while(rs.next()) {
				PermisoContrato permisoCont = new PermisoContrato();
				permisoCont.setClavePermContrato(rs.getInt("cve_permcont"));
				permisoCont.setFechaPermContrato(rs.getDate("fecha_permcont"));
				permisoCont.setCostoPermContrato(rs.getInt("costo_permcont"));
				permisoCont.setFechaInicioPermContrato(rs.getDate("fechain_permcont"));
				permisoCont.setFechaFinPermContrato(rs.getDate("fechafin_permcont"));
				permisosCont.add(permisoCont);
			}
			return permisosCont;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}