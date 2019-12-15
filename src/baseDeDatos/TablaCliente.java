package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.Contrato;
import modelo.ContratoTrabajador;
import modelo.DiaHora;
import modelo.Persona;

public class TablaCliente {
	private Connection conexion;
	private java.sql.Statement statement;

	public TablaCliente(Connection conexion) {
		super();
		this.conexion = conexion;

		try {
			statement = conexion.createStatement();
		} catch (Exception e) {
			e.toString();
		} 
	}

	public void guardarNuevoCliente(Persona person, int colonia) throws SQLException {
		conexion.setAutoCommit(false);
		String sql = "call sp_nuevoregistro(0,'"+ person.getApellidoPaternoPer() +"', '" + person.getApellidoMaternoPer() + "', '"
				+ person.getNombrePer() + "', '"+ person.getCallePer() + "', '"+ person.getNumeroPer() +"', '" + person.getOrientacionPer()
				+ "', '"+ person.getEntreCallesPer() + "', '"+ person.getGeneroPer() + "', ' "+ person.getEstadoCivilPer() + "', '" 
				+ person.getMailPer() + "', '"+ person.getTelefono() + "', '"+ person.getFechaNacimientoPer() + "', '"
				+ colonia + "', '"+ person.getFechaNacimientoPer() + "', '"+ person.getFechaNacimientoPer() + "', '"
				+ person.getCallePer() + "', '"+ person.getNumeroPer() + "', '"+ person.getCallePer()+ "')";
		try {
			statement.executeUpdate(sql);
			conexion.commit();
			JOptionPane.showMessageDialog(null, "Empleado registrado");
		} catch (SQLException e) {
			conexion.rollback();
			System.out.println(e.toString());
		}
	}

	public List<Persona> getCliente(){
		String sql = "call sp_contratosclientes()";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Persona> people = new ArrayList<>();
			while (rs.next()) {
				Persona person = new Persona();
				person.setApellidoMaternoPer(rs.getString("am_per"));
				person.setApellidoPaternoPer(rs.getString("ap_per"));
				person.setNombrePer(rs.getString("nom_per"));
				person.setClavePer(rs.getInt("cve_cli"));
				people.add(person);
			}
			return people;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}

	public List<Persona> getClientesPer(){
		String sql = "select ap_per, am_per, nom_per, p.cve_per, c.cve_cli from cliente c join persona p " + 
				"on c.cve_per = p.cve_per group by p.cve_per;";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Persona> people = new ArrayList<>();
			while (rs.next()) {
				Persona person = new Persona();
				person.setApellidoMaternoPer(rs.getString("am_per"));
				person.setApellidoPaternoPer(rs.getString("ap_per"));
				person.setNombrePer(rs.getString("nom_per"));
				person.setClavePer(rs.getInt("cve_cli"));
				people.add(person);
			}
			return people;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
	
	public List<Cliente> getClientesCli(){
		String sql = "select ap_per, am_per, nom_per, p.cve_per, c.cve_cli, fecha_cli from cliente c join persona p " + 
				"on c.cve_per = p.cve_per group by p.cve_per;";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Cliente> clientes = new ArrayList<Cliente>();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setClaveCliente(rs.getInt("cve_cli"));
				cliente.setFechaCliente(rs.getDate("fecha_cli"));
				
				clientes.add(cliente);
			}
			return clientes;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}

	public List<Cliente> getCodigoCliente() {
		String sql = "select cve_cli from cliente";
		try {
			ResultSet rs = statement.executeQuery(sql);
			List<Cliente> clientes = new ArrayList<Cliente>();
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setClaveCliente(rs.getInt("cve_cli"));
				clientes.add(cliente);
			}
			return clientes;
		} catch (Exception e) {
			return null;
		}
	}
}