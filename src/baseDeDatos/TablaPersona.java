package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Persona;
import modelo.TrabajadorActividad;

public class TablaPersona {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaPersona(Connection conexion) {
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
	
	public List<Persona> getDetallesTrabajadorAct(int clave) {
		String sql = "select t.cve_traact, ap_per, am_per, nom_per, puesto_tra from trabajadoractividad t join actrealizar act " + 
				"	on t.num_actrea = act.num_actrea join actividad a " + 
				"	on act.cve_act = a.cve_act join contrato c " + 
				"	on act.cve_cont = c.cve_cont join contratotra tra " + 
				"	on t.cve_tra = tra.cve_tra join persona p " + 
				"	on tra.cve_per = p.cve_per " + 
				"	where c.cve_cont = '" + clave + "'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Persona> people = new ArrayList<Persona>();
			while(rs.next()) {
				Persona person = new Persona();
				person.setApellidoPaternoPer(rs.getString("ap_per"));
				person.setApellidoMaternoPer(rs.getString("am_per"));
				person.setNombrePer(rs.getString("nom_per"));
				people.add(person);
			}
			return people;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}