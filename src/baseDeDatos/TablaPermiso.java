package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Avance;
import modelo.Permiso;

public class TablaPermiso {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaPermiso(Connection conexion) {
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
	
	public List<Permiso> getPermiso(int claveContrato){
		String sql = "select pc.cve_permcont, p.cve_perm, tipo_perm, fecha_permcont, costo_permcont, fechain_permcont, " + 
				"fechafin_permcont, descripcion_perm from permisocontrato pc join permiso p " + 
				"on pc.cve_perm = p.cve_perm " + 
				"where pc.cve_cont = '"+ claveContrato +"'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Permiso> permisos = new ArrayList<>();
			while(rs.next()) {
				Permiso permiso = new Permiso();
				permiso.setClavePermiso(rs.getInt("cve_perm"));
				permiso.setTipoPermiso(rs.getString("tipo_perm"));
				permiso.setDescripcionPermiso(rs.getString("descripcion_perm"));
				permisos.add(permiso);
			}
			return permisos;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
	
	public List<Permiso> getTipoPermisos() {
		String sql = "select tipo_perm, cve_perm from permiso group by cve_perm";
		
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Permiso> permisos = new ArrayList<Permiso>();
			while(rs.next()) {
				Permiso permiso = new Permiso();
				permiso.setClavePermiso(rs.getInt("cve_perm"));
				permiso.setTipoPermiso(rs.getString("tipo_perm"));
				
				permisos.add(permiso);
			}
			return permisos;
		} catch (Exception e) {
			System.out.println(e.toString() + " es de la tabla permiso");
			return null;
		}
	}
}