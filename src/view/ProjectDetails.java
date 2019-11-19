package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class ProjectDetails extends JPanel {

	public ProjectDetails() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.NORTH);
		
		JLabel lblDetallesDelProyecto = new JLabel("Detalles del proyecto");
		lblDetallesDelProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblDetallesDelProyecto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblDetallesDelProyecto);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblCliente_1 = new JLabel("Cliente:");
		lblCliente_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		panel_3.add(lblCliente_1);
		
		JLabel lblCliente = new JLabel("Arquitecto:");
		lblCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		panel_3.add(lblCliente);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(11, 2, 0, 0));
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio");
		lblFechaDeInicio.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		lblFechaDeInicio.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblFechaDeInicio);
		
		JLabel lblFechaDeFinalizacin = new JLabel("Fecha de finalización");
		lblFechaDeFinalizacin.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		lblFechaDeFinalizacin.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblFechaDeFinalizacin);
		
		JLabel lblTipoDeObra = new JLabel("Tipo de obra");
		lblTipoDeObra.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeObra.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblTipoDeObra);
		
		JLabel lblMetrosCuadrados = new JLabel("Metros cuadrados");
		lblMetrosCuadrados.setHorizontalAlignment(SwingConstants.CENTER);
		lblMetrosCuadrados.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblMetrosCuadrados);
		
		JLabel lblHonorariosDelArquitecto = new JLabel("Honorarios del arquitecto");
		lblHonorariosDelArquitecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblHonorariosDelArquitecto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblHonorariosDelArquitecto);
		
		JLabel lblCostoDeLa = new JLabel("Costo de la obra");
		lblCostoDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostoDeLa.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblCostoDeLa);
		
		JLabel lblEstatusDelProyecto = new JLabel("Estatus del proyecto");
		lblEstatusDelProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstatusDelProyecto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblEstatusDelProyecto);
		
		JLabel lblActividades = new JLabel("Actividades");
		lblActividades.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblActividades);
		
		JLabel lblTrabajadoresEnEl = new JLabel("Trabajadores en el proyecto");
		lblTrabajadoresEnEl.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrabajadoresEnEl.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblTrabajadoresEnEl);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.SOUTH);
		
	}
}