package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import modelo.Contrato;
import modelo.Persona;

import javax.swing.ImageIcon;
import java.awt.GridLayout;
import rojeru_san.componentes.RSDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;

public class NewContract extends JPanel implements ActionListener{
	private JTextField editMetrosCuadrados;
	private JTextField editHonorarios;
	private JTextField editCostoObra;
	private JComboBox<String> editCliente;
	private JComboBox<String> editArquitecto;
	private JComboBox<String> editTipoObra;
	private RSDateChooser fechaFin;
	private RSDateChooser fechaInicio;
	private JButton buttonSiguiente;
	private JButton buttonCancelar;

	public NewContract() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.NORTH);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		button.setContentAreaFilled(false);
		panel.add(button);
		
		JLabel lblNuevoContrato = new JLabel("                                                                             Nuevo Contrato                                                                                        ");
		lblNuevoContrato.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoContrato.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNuevoContrato);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 4, 0, 100));
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio:");
		lblFechaDeInicio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblFechaDeInicio.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblFechaDeInicio);
		
		fechaInicio = new RSDateChooser();
		fechaInicio.setFuente(new Font("Segoe UI Symbol", Font.BOLD, 17));
		panel_1.add(fechaInicio);
		
		JLabel lblHonorariosDelArquitecto = new JLabel("Honorarios del Arquitecto:");
		lblHonorariosDelArquitecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblHonorariosDelArquitecto.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblHonorariosDelArquitecto);
		
		editHonorarios = new JTextField();
		editHonorarios.addActionListener(this);
		editHonorarios.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		editHonorarios.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(editHonorarios);
		editHonorarios.setColumns(10);
		
		JLabel lblFechaDeFinalizacin = new JLabel("Fecha de finalización:");
		lblFechaDeFinalizacin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblFechaDeFinalizacin.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblFechaDeFinalizacin);
		
		fechaFin = new RSDateChooser();
		fechaFin.setFuente(new Font("Segoe UI Symbol", Font.BOLD, 17));
		panel_1.add(fechaFin);
		
		JLabel lblCostoDeLa = new JLabel("Costo de la obra:");
		lblCostoDeLa.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblCostoDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblCostoDeLa);
		
		editCostoObra = new JTextField();
		editCostoObra.addActionListener(this);
		editCostoObra.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		editCostoObra.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(editCostoObra);
		editCostoObra.setColumns(10);
		
		JLabel lblTipoDeContrato = new JLabel("Tipo de contrato:");
		lblTipoDeContrato.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblTipoDeContrato.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblTipoDeContrato);
		
		editTipoObra = new JComboBox<String>();
		editTipoObra.addActionListener(this);
		editTipoObra.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_1.add(editTipoObra);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblCliente);
		
		editCliente = new JComboBox<String>();
		editCliente.addActionListener(this);
		editCliente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_1.add(editCliente);
		
		JLabel lblMetrosCuadrados = new JLabel("Metros cuadrados:");
		lblMetrosCuadrados.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblMetrosCuadrados.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblMetrosCuadrados);
		
		editMetrosCuadrados = new JTextField();
		editMetrosCuadrados.addActionListener(this);
		editMetrosCuadrados.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		editMetrosCuadrados.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(editMetrosCuadrados);
		editMetrosCuadrados.setColumns(10);
		
		JLabel lblArquitecto = new JLabel("Arquitecto:");
		lblArquitecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblArquitecto.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblArquitecto);
		
		editArquitecto = new JComboBox<String>();
		editArquitecto.addActionListener(this);
		editArquitecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_1.add(editArquitecto);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.SOUTH);
		
		buttonSiguiente = new JButton("Siguiente");
		buttonSiguiente.setForeground(Color.WHITE);
		buttonSiguiente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonSiguiente.setBackground(new Color(45, 0, 255));
		buttonSiguiente.setBounds(10, 266, 269, 29);
		buttonSiguiente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(buttonSiguiente);
		
		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setForeground(Color.WHITE);
		buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonCancelar.setBackground(new Color(45, 0, 255));
		buttonCancelar.setBounds(10, 266, 269, 29);
		buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(buttonCancelar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == editTipoObra) {
			editMetrosCuadrados.requestFocus();
		}
		
		if(e.getSource() == editMetrosCuadrados) {
			if(editMetrosCuadrados.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "¡El campo no puede quedar vacio!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editHonorarios.requestFocus();
		}
		
		if(e.getSource() == editHonorarios) {
			if(editHonorarios.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "¡El campo no puede quedar vacio!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editCostoObra.requestFocus();
		}
		
		if(e.getSource() == editCostoObra) {
			if(editCostoObra.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "¡El campo no puede quedar vacio!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editCliente.requestFocus();
		}
		
		if(e.getSource() == editCliente) 
			editArquitecto.requestFocus();
	}
	
	public Contrato getNuevoContrato(int claveCliente, int claveArqui) {
		Contrato contract = new Contrato();
		
		String formatoFecha = "yyyyMMdd";
		Date fecha = fechaInicio.getDatoFecha();
		
		SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
		String prueba1 = String.valueOf(formateador.format(fecha));
		
		Date fechaCad = fechaFin.getDatoFecha();
		String prueba2 = String.valueOf(formateador.format(fechaCad));
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date parsed = null;
        Date parsed2 = null;
		try {
			parsed = format.parse(prueba1);
			parsed2 = format.parse(prueba2);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        java.sql.Date sql = new java.sql.Date(parsed.getTime());
        java.sql.Date sql1 = new java.sql.Date(parsed2.getTime());
		
		contract.setFechaInicioContrato(sql);
		contract.setFechaFinContrato(sql1);
		contract.setTipoContrato(editTipoObra.getSelectedItem().toString());
		contract.setMetrosCuadradosContrato(Integer.parseInt(editMetrosCuadrados.getText()));
		contract.setHonorariosArquitectoContrato(Integer.parseInt(editHonorarios.getText()));
		contract.setClaveCliente(claveCliente);
		contract.setClaveTrabajador(claveArqui);
		
		return contract;
	}
	
	public void llenarTipoContrato(List<Contrato> contratos) {
		for (Contrato contrato : contratos) {
			editTipoObra.addItem(contrato.getTipoContrato());
		}
		editTipoObra.addItem("Otro");
	}
	
	public void llenarCliente(List<Persona> clientes) {
		for (Persona persona : clientes) {
			StringBuilder names = new StringBuilder(persona.getApellidoPaternoPer() + " " + persona.getApellidoMaternoPer() + " "+ persona.getNombrePer());
			editCliente.addItem(names.toString());
		}
	}
	
	public void llenarArquitecto(List<Persona> arquitectos) {
		for (Persona arquitecto : arquitectos) {
			StringBuilder names = new StringBuilder(arquitecto.getApellidoPaternoPer() + " " + arquitecto.getApellidoMaternoPer() + " "+ arquitecto.getNombrePer());
			editArquitecto.addItem(names.toString());
		}
	}
	
	public JComboBox<String> getCampoArquitecto() {
		return editArquitecto;
	}
	
	public JComboBox<String> getCampoCliente() {
		return editCliente;
	}
	
	public JButton getButtonSiguiente() {
		return buttonSiguiente;
	}
	
	public JButton getButtonCancelar() {
		return buttonCancelar;
	}
}