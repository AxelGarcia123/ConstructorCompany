package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Cita;
import modelo.StatusCita;

public class TablaCita {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaCita(Connection conexion) {
		super();
		this.conexion = conexion;

		try {
			statement = conexion.createStatement();
		} catch (Exception e) {
			e.toString();
		} 
	}

	public void agendarCita(Cita cita, StatusCita status, String colonia){
		int claveCol = 0;
		String sql = "select cve_col from colonia where nom_col = '"+ colonia + "'";
		try {
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next())
				claveCol = rs.getInt("cve_col");
			
			sql = "insert into cita values(null, curdate(), '"+ cita.getFechaCita() + "', '"+ cita.getHoraInicioCita() + "', '"+
					cita.getHoraFinCita() + "', '"+ cita.getCalleCita() + "', '"+ cita.getNumeroCita() + "', '"+ cita.getOrientacionCita()
					+ claveCol + "', '"+ cita.getClaveCliente() + "', '"+ cita.getClaveTrabajador() + "')";
			
			statement.executeUpdate(sql);

		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}
}