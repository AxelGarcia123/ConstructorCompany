package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Contrato;

public class TablaContrato {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaContrato(Connection conexion) {
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
	
	public List<Contrato> getContratos(){
		String sql = "select * from tipoproyecto";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Contrato> contratos = new ArrayList<>();
			while (rs.next()) {
				Contrato contrato = new Contrato();
				contrato.setTipoContrato(rs.getString("tipo_cont"));
				contratos.add(contrato);
			}
			return contratos;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
	
	public List<Contrato> getFecha(String tipoContrato){
		String sql = "call sp_contratosclientes('" + tipoContrato + "')";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Contrato> contratos = new ArrayList<>();
			while (rs.next()) {
				Contrato contrato = new Contrato();
				contrato.setFechaInicioContrato(rs.getDate("fechain_cont"));
				contratos.add(contrato);
			}
			return contratos;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}