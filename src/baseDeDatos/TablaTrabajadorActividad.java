package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Actividad;
import modelo.TrabajadorActividad;

public class TablaTrabajadorActividad {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaTrabajadorActividad(Connection conexion) {
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
	
	public List<TrabajadorActividad> getDetailsTrabajadorAct(int clave) {
		String sql = "select a.cve_act, t.cve_traact, nombre_act, cant_traact, descripcion_act from trabajadoractividad t join actrealizar act" + 
				" on t.num_actrea = act.num_actrea join actividad a" + 
				" on act.cve_act = a.cve_act" + 
				" where act.cve_cont = '"+ clave + "'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<TrabajadorActividad> traacts = new ArrayList<TrabajadorActividad>();
			while(rs.next()) {
				TrabajadorActividad traact = new TrabajadorActividad();
				traact.setClaveTrabajadorAct(rs.getInt("cve_traact"));
				traact.setActivityNumber(rs.getInt("cve_traact"));
				traact.setCantidadTrabajadorAct(rs.getInt("cant_traact"));
				traacts.add(traact);
			}
			return traacts;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}