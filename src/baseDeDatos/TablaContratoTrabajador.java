package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.ContratoTrabajador;
import modelo.Persona;

public class TablaContratoTrabajador {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaContratoTrabajador(Connection conexion) {
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
	
	public StringBuilder getArquitecto(int clave) {
		String sql = "select ap_per, am_per, nom_per from contratotra c join persona p "
				+ "on c.cve_per = p.cve_per "
				+ "where c.cve_per = '"+ clave +"'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				StringBuilder arquitecto = new StringBuilder(rs.getString("nom_per") + " "+ rs.getString("ap_per") + " "+ rs.getString("am_per"));
				return arquitecto;
			}
			else
				return null;
		} catch (SQLException e) {
			System.out.println(e.toString());
			return null;
		}
	}
	
	public List<ContratoTrabajador> getDetallesTrabajadorPuesto(int clave, String actividad) {
		String sql = "select t.cve_traact, ap_per, am_per, nom_per, puesto_tra from trabajadoractividad t join actrealizar act " + 
				"	on t.num_actrea = act.num_actrea join actividad a " + 
				"	on act.cve_act = a.cve_act join contrato c " + 
				"	on act.cve_cont = c.cve_cont join contratotra tra " + 
				"	on t.cve_tra = tra.cve_tra join persona p " + 
				"	on tra.cve_per = p.cve_per " + 
				"	where nombre_act = '"+ actividad + "' " + 
				"	and c.cve_cont = '" + clave + "'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<ContratoTrabajador> empleados = new ArrayList<ContratoTrabajador>();
			while(rs.next()) {
				ContratoTrabajador empleado = new ContratoTrabajador();
				empleado.setPuestoTrabajador(rs.getString("puesto_tra"));
				empleados.add(empleado);
			}
			return empleados;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
	
	public List<ContratoTrabajador> getFiltro() {
		String filtro = "Arquitecto";
		String sql = "select ap_per, am_per, nom_per, c.cve_cont from contratotra c join persona p"
				+ " on c.cve_per = p.cve_per where puesto_tra like '%" + filtro +"%";
		
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<ContratoTrabajador> empleados = new ArrayList<>();
			while(rs.next()) {
				ContratoTrabajador empleado = new ContratoTrabajador();
				
				empleado.setClaveTrabajador(rs.getInt("cve_cont"));
				
				empleados.add(empleado);
			}
			return empleados;
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
}