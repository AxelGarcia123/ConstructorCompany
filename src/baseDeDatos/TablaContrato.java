package baseDeDatos;

import java.sql.Connection;
import java.sql.Date;
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
	
	public String guardar(Contrato contrato) throws SQLException {
		conexion.setAutoCommit(false);
		
		String sql = "insert into contrato values(null, curdate(), '" + contrato.getFechaInicioContrato() + "','" + 
				contrato.getFechaFinContrato() + "','" + contrato.getTipoContrato() + "','"+ contrato.getMetrosCuadradosContrato() +"')";
		try {
			statement.executeUpdate(sql);
			return "Producto registrado";
		} catch (SQLException e) {
			System.out.println(e.toString());
			return sql.toString();
		}
	}
	
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
	
	public List<Contrato> getFecha(){
		String sql = "select * from contrato";
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
	
	public Contrato getDetailsProject(String nombre, String paterno, String materno, Date fecha, int clave) {
		String sql = "call sp_projectDetails('"+ nombre + "', '"+ paterno +"', '"+ materno + "', '"+ fecha + "', '"+ clave + "')";
		try {
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				Contrato contrato = new Contrato();
				contrato.setClaveContrato(rs.getInt("cve_cont"));
				contrato.setFechaInicioContrato(rs.getDate("fechain_cont"));
				contrato.setFechaFinContrato(rs.getDate("fechafin_cont"));
				contrato.setTipoContrato(rs.getString("tipo_cont"));
				contrato.setMetrosCuadradosContrato(rs.getInt("metroscuadrados_cont"));
				contrato.setHonorariosArquitectoContrato(rs.getInt("honorariosArquitecto_cont"));
				contrato.setCostoObraContrato(rs.getInt("costoobra_cont"));
				contrato.setClaveCliente(rs.getInt("cve_cli"));
				contrato.setClaveTrabajador(rs.getInt("cve_tra"));
				return contrato;
			}
			else 
				return null;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}