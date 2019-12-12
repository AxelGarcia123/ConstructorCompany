package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.DiaHora;

public class TablaDiaHora {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaDiaHora(Connection conexion) {
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
	
	public List<DiaHora> getTipoDiaHora() {
		String sql = "select tipo_diahor from diahora group by tipo_diahor";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<DiaHora> tipos = new ArrayList<DiaHora>();
			while(rs.next()) {
				DiaHora tipo = new DiaHora();
				tipo.setTipoDiaHora(rs.getString("tipo_diahor"));
				tipos.add(tipo);
			}
			return tipos;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}