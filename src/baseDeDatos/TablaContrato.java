package baseDeDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Actividad;
import modelo.ActividadRealizar;
import modelo.Clausula;
import modelo.Contrato;
import modelo.ContratoClausula;
import modelo.Permiso;
import modelo.PermisoContrato;

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

	public void guardarNuevoContrato(List<ActividadRealizar> actividades, List<ContratoClausula> clausulas, 
			List<PermisoContrato> permisos, Contrato contrato, List<Actividad> nuevasActividades,
			List<Clausula> nuevasClausulas, List<Permiso> nuevosPermisos, List<PermisoContrato> nuevoPermCont,
			List<ActividadRealizar> nuevoActRea) throws SQLException {
		
		conexion.setAutoCommit(false);
		int claveCont = 0;
		int i = 0;
		int j = 0;

		String sql = "call sp_nuevocontrato('" + contrato.getFechaInicioContrato() + "','" + 
				contrato.getFechaFinContrato() + "','" + contrato.getTipoContrato() + "','"+ contrato.getMetrosCuadradosContrato() +"',' "+
				+ contrato.getHonorariosArquitectoContrato() + "', '"+ contrato.getCostoObraContrato() + "', '"+
				+ contrato.getClaveCliente() + "', '"+ contrato.getClaveTrabajador() + "')";
		try {
			statement.executeUpdate(sql);

			sql = "select max(cve_cont) from contrato";
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next())
				claveCont = rs.getInt("max(cve_cont)");

			for (ContratoClausula clausula : clausulas) {
				sql = "call sp_clausulas('" + claveCont + "', '"+ clausula.getClaveClausula() + "')";
				statement.executeUpdate(sql);
			}

			for (ActividadRealizar actividad : actividades) {
				sql = "call sp_actividades('"+ claveCont + "', '"+ actividad.getActivityKey() + "', '"+ actividad.getCantidad() + "')";
				statement.executeUpdate(sql);
			}

			for (PermisoContrato permisoContrato : permisos) {
				sql = "call sp_permisos('"+ claveCont + "', '"+ permisoContrato.getClavePermiso() + "', '"+ permisoContrato.getCostoPermContrato() +
						"', '"+ permisoContrato.getFechaInicioPermContrato() + "', '" + permisoContrato.getFechaFinPermContrato() + "')";
				statement.executeUpdate(sql);
			}
			
			if(!nuevasActividades.isEmpty()) {
				if(!nuevosPermisos.isEmpty()) {
					if(!nuevasClausulas.isEmpty()) {
						i = 0;
						j = 0;
						for (Permiso permiso : nuevosPermisos) {
							sql = "call sp_nuevopermiso('"+ claveCont + "', '"+ permiso.getTipoPermiso() + "', '"
									+ permiso.getDescripcionPermiso() + "', '"+ nuevoPermCont.get(i).getCostoPermContrato()
									+ "', '"+ nuevoPermCont.get(i).getFechaInicioPermContrato() + "', '"
									+ nuevoPermCont.get(i).getFechaFinPermContrato() + "')";
							
							statement.executeUpdate(sql);
							i++;
						}
						
						for (Actividad actividad : nuevasActividades) {
							sql = "call sp_nuevaactividad('"+ claveCont + "', '"+ actividad.getName() + "', '"+ actividad.getDescription() +
									"', '"+ actividad.getUnitOfMeasure() + "', '"+ nuevoActRea.get(j).getCantidad() + "')";
							statement.executeUpdate(sql);
							j++;
						}
						
						for (Clausula clausula : nuevasClausulas) {
							sql = "call sp_nuevaclausula('"+ claveCont + "', '"+ clausula.getDescripcionClausula() + "')";
							statement.executeUpdate(sql);
						}
					}
					else {
						i = 0;
						j = 0;
						for (Permiso permiso : nuevosPermisos) {
							sql = "call sp_nuevopermiso('"+ claveCont + "', '"+ permiso.getTipoPermiso() + "', '"
									+ permiso.getDescripcionPermiso() + "', '"+ nuevoPermCont.get(i).getCostoPermContrato()
									+ "', '"+ nuevoPermCont.get(i).getFechaInicioPermContrato() + "', '"
									+ nuevoPermCont.get(i).getFechaFinPermContrato() + "')";
							
							statement.executeUpdate(sql);
							i++;
						}
						
						for (Actividad actividad : nuevasActividades) {
							sql = "call sp_nuevaactividad('"+ claveCont + "', '"+ actividad.getName() + "', '"+ actividad.getDescription() +
									"', '"+ actividad.getUnitOfMeasure() + "', '"+ nuevoActRea.get(j).getCantidad() + "')";
							statement.executeUpdate(sql);
							j++;
						}
					}
				}
				else {
					i = 0;
					j = 0;
					for (Actividad actividad : nuevasActividades) {
						sql = "call sp_nuevaactividad('"+ claveCont + "', '"+ actividad.getName() + "', '"+ actividad.getDescription() +
								"', '"+ actividad.getUnitOfMeasure() + "', '"+ nuevoActRea.get(j).getCantidad() + "')";
						statement.executeUpdate(sql);
						j++;
					}
				}
			}

			conexion.commit();

		} catch (SQLException e) {
			conexion.rollback();
			System.out.println(e.toString() + ". Error al crear un contrato nuevo");
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