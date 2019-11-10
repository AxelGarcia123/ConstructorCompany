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
	
	public List<Contrato> getResurtidos(){
		String sql = "select * from contrato";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Contrato> contratos = new ArrayList<>();
			while (rs.next()) {
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
				
				contratos.add(contrato);
			}
			return contratos;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}