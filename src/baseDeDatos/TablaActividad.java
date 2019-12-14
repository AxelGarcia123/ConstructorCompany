package baseDeDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Actividad;
import modelo.Contrato;

public class TablaActividad {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaActividad(Connection conexion) {
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
	
	public List<Actividad> getDetailsActivities(int clave) {
		String sql = "select a.cve_act, t.cve_traact, nombre_act, cant_traact, descripcion_act, umedida_act from trabajadoractividad t join actrealizar act" + 
				" on t.num_actrea = act.num_actrea join actividad a" + 
				" on act.cve_act = a.cve_act" + 
				" where act.cve_cont = '"+ clave + "'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Actividad> activities = new ArrayList<Actividad>();
			while(rs.next()) {
				Actividad activity = new Actividad();
				activity.setKey(rs.getInt("cve_act"));
				activity.setName(rs.getString("nombre_act"));
				activity.setDescription(rs.getString("descripcion_act"));
				activity.setUnitOfMeasure(rs.getString("umedida_act"));
				activities.add(activity);
			}
			return activities;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
	
	public List<String> getUnidadesDeMedida() {
		String sql = "select umedida_act from actividad group by umedida_act";
		
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<String> medidas = new ArrayList<String>();
			while(rs.next()) 
				medidas.add(rs.getString("umedida_act"));
			return medidas;
		} catch (Exception e) {
			System.out.println(e.toString() + ". Error al mostrar las medidas de actividades");
			return null;
			// TODO: handle exception
		}
	}
	
	public List<Actividad> getActividades() {
		String sql = "select * from actividad";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Actividad> activities = new ArrayList<Actividad>();
			while(rs.next()) {
				Actividad activity = new Actividad();
				activity.setKey(rs.getInt("cve_act"));
				activity.setName(rs.getString("nombre_act"));
				activity.setDescription(rs.getString("descripcion_act"));
				activity.setUnitOfMeasure(rs.getString("umedida_act"));
				activities.add(activity);
			}
			return activities;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}