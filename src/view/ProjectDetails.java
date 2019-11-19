package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import modelo.Contrato;
import modelo.StatusContrato;

import java.awt.GridLayout;
import java.awt.font.TextAttribute;
import java.util.Map;

public class ProjectDetails extends JPanel {
	private JLabel textFechaInicio;
	private JLabel textFechaFinalizar;
	private JLabel textTipoObra;
	private JLabel textMetrosCuadrados;
	private JLabel textHonorarios;
	private JLabel textCostoObra;
	private JLabel textStatusProyecto;
	private JLabel textActividades;
	private JLabel textTrabajadores;
	private JLabel textAutorizacion;
	private JLabel textClausulas;
	private JLabel textCliente;
	private JLabel textArquitecto;

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
		
		textCliente = new JLabel("Cliente:");
		textCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		panel_3.add(textCliente);
		
		textArquitecto = new JLabel("Arquitecto:");
		textArquitecto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		panel_3.add(textArquitecto);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(11, 2, 0, 0));
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio");
		lblFechaDeInicio.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		lblFechaDeInicio.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblFechaDeInicio);
		
		textFechaInicio = new JLabel("");
		textFechaInicio.setHorizontalAlignment(SwingConstants.CENTER);
		textFechaInicio.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(textFechaInicio);
		
		JLabel lblFechaDeFinalizacin = new JLabel("Fecha de finalización");
		lblFechaDeFinalizacin.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		lblFechaDeFinalizacin.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblFechaDeFinalizacin);
		
		textFechaFinalizar = new JLabel("");
		textFechaFinalizar.setHorizontalAlignment(SwingConstants.CENTER);
		textFechaFinalizar.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(textFechaFinalizar);
		
		JLabel lblTipoDeObra = new JLabel("Tipo de obra");
		lblTipoDeObra.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeObra.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblTipoDeObra);
		
		textTipoObra = new JLabel("");
		textTipoObra.setHorizontalAlignment(SwingConstants.CENTER);
		textTipoObra.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(textTipoObra);
		
		JLabel lblMetrosCuadrados = new JLabel("Metros cuadrados");
		lblMetrosCuadrados.setHorizontalAlignment(SwingConstants.CENTER);
		lblMetrosCuadrados.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblMetrosCuadrados);
		
		textMetrosCuadrados = new JLabel("");
		textMetrosCuadrados.setHorizontalAlignment(SwingConstants.CENTER);
		textMetrosCuadrados.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(textMetrosCuadrados);
		
		JLabel lblHonorariosDelArquitecto = new JLabel("Honorarios del arquitecto");
		lblHonorariosDelArquitecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblHonorariosDelArquitecto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblHonorariosDelArquitecto);
		
		textHonorarios = new JLabel("");
		textHonorarios.setHorizontalAlignment(SwingConstants.CENTER);
		textHonorarios.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(textHonorarios);
		
		JLabel lblCostoDeLa = new JLabel("Costo de la obra");
		lblCostoDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostoDeLa.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblCostoDeLa);
		
		textCostoObra = new JLabel("");
		textCostoObra.setHorizontalAlignment(SwingConstants.CENTER);
		textCostoObra.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(textCostoObra);
		
		JLabel lblEstatusDelProyecto = new JLabel("Estatus del proyecto");
		lblEstatusDelProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstatusDelProyecto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblEstatusDelProyecto);
		
		textStatusProyecto = new JLabel("");
		textStatusProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		textStatusProyecto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(textStatusProyecto);
		
		JLabel lblActividades = new JLabel("Actividades");
		lblActividades.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblActividades);
		
		textActividades = new JLabel("Ver actividades");
		textActividades.setHorizontalAlignment(SwingConstants.CENTER);
		textActividades.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		Font fontUp = textActividades.getFont();
		Map attributesUp = fontUp.getAttributes();
		attributesUp.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		textActividades.setFont(fontUp.deriveFont(attributesUp));
		panel_4.add(textActividades);
		
		JLabel lblTrabajadoresEnEl = new JLabel("Trabajadores en el proyecto");
		lblTrabajadoresEnEl.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrabajadoresEnEl.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblTrabajadoresEnEl);
		
		textTrabajadores = new JLabel("Ver trabajadores");
		textTrabajadores.setHorizontalAlignment(SwingConstants.CENTER);
		textTrabajadores.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		Font font = textTrabajadores.getFont();
		Map attributes = font.getAttributes();
		attributesUp.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		textTrabajadores.setFont(font.deriveFont(attributesUp));
		panel_4.add(textTrabajadores);
		
		JLabel lblAutorizacin = new JLabel("Autorización");
		lblAutorizacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutorizacin.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblAutorizacin);
		
		textAutorizacion = new JLabel("Ver autorización");
		textAutorizacion.setHorizontalAlignment(SwingConstants.CENTER);
		textAutorizacion.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		Font fontAuto = textAutorizacion.getFont();
		Map attributesAuto = fontAuto.getAttributes();
		attributesUp.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		textAutorizacion.setFont(fontAuto.deriveFont(attributesUp));
		panel_4.add(textAutorizacion);
		
		JLabel lblClausulas = new JLabel("Clausulas");
		lblClausulas.setHorizontalAlignment(SwingConstants.CENTER);
		lblClausulas.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(lblClausulas);
		
		textClausulas = new JLabel("Ver clausulas");
		textClausulas.setHorizontalAlignment(SwingConstants.CENTER);
		textClausulas.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		panel_4.add(textClausulas);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.SOUTH);
	}
	
	public void showDetailsProyect(Contrato contrato, String status, String cliente, String arquitecto) {
		textCliente.setText(textCliente.getText() + " "+ cliente);
		textArquitecto.setText(textArquitecto.getText() + " " + arquitecto);
		textFechaInicio.setText(String.valueOf(contrato.getFechaInicioContrato()));
		textFechaFinalizar.setText(String.valueOf(contrato.getFechaFinContrato()));
		textTipoObra.setText(contrato.getTipoContrato());
		textMetrosCuadrados.setText(String.valueOf(contrato.getMetrosCuadradosContrato()));
		textHonorarios.setText(String.valueOf(contrato.getHonorariosArquitectoContrato()));
		textCostoObra.setText(String.valueOf(contrato.getCostoObraContrato()));
		textStatusProyecto.setText(status);
	}
}