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

import modelo.ContratoTrabajador;
import modelo.PuedoHacer;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import rojeru_san.componentes.RSDateChooser;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class NewEmployee extends JPanel implements ActionListener{
	private JButton buttonGuardar;
	private JButton buttonCancelar;
	private JComboBox entradaLunes;
	private JComboBox entradaMartes;
	private JComboBox entradaMiercoles;
	private JComboBox entradaJueves;
	private JComboBox entradaViernes;
	private JComboBox entradaSabado;
	private JComboBox salidaLunes;
	private JComboBox salidaMartes;
	private JComboBox salidaMiércoles;
	private JComboBox salidaJueves;
	private JComboBox salidaViernes;
	private JComboBox salidaSabado;
	private JTextField editPaterno;
	private JTextField editMaterno;
	private JTextField editNombre;
	private JTextField editCalle;
	private JTextField editNumCalle;
	private JTextField editEntreCalles;
	private JTextField editEstadoCivil;
	private JTextField editEmail;
	private JTextField editTelefono;
	private JTextField editSueldo;
	private JTextField editNSS;
	private RSDateChooser fechaFin;
	private RSDateChooser fechaInicio;
	private JLabel textColonia;
	private JLabel textCiudad;
	private JComboBox<String> editPuestos;
	private JComboBox<String> editOrientacion;
	private JComboBox<String> editGenero;
	private RSDateChooser fechaNacimiento;
	private JButton buttonCodigoPostal;

	public NewEmployee() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.NORTH);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		button.setContentAreaFilled(false);
		panel.add(button);
		
		JLabel lblNuevoEmpleado = new JLabel("                                                                     Nuevo empleado                                                                                ");
		lblNuevoEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoEmpleado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		panel.add(lblNuevoEmpleado);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.SOUTH);
		
		buttonGuardar = new JButton("Guardar");
		buttonGuardar.setForeground(Color.WHITE);
		buttonGuardar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonGuardar.setBackground(new Color(45, 0, 255));
		buttonGuardar.setBounds(10, 266, 269, 29);
		buttonGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.add(buttonGuardar);
		
		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setForeground(Color.WHITE);
		buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonCancelar.setBackground(new Color(45, 0, 255));
		buttonCancelar.setBounds(10, 266, 269, 29);
		buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.add(buttonCancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_2.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(3, 7, 0, 0));
		
		JLabel label = new JLabel("");
		panel_3.add(label);
		
		JLabel lblLunes = new JLabel("Lunes");
		lblLunes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblLunes.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblLunes);
		
		JLabel lblMartes = new JLabel("Martes");
		lblMartes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblMartes.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblMartes);
		
		JLabel lblMircoles = new JLabel("Miércoles");
		lblMircoles.setHorizontalAlignment(SwingConstants.CENTER);
		lblMircoles.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_3.add(lblMircoles);
		
		JLabel lblJueves = new JLabel("Jueves");
		lblJueves.setHorizontalAlignment(SwingConstants.CENTER);
		lblJueves.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_3.add(lblJueves);
		
		JLabel lblViernes = new JLabel("Viernes");
		lblViernes.setHorizontalAlignment(SwingConstants.CENTER);
		lblViernes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_3.add(lblViernes);
		
		JLabel lblSbado = new JLabel("Sábado");
		lblSbado.setHorizontalAlignment(SwingConstants.CENTER);
		lblSbado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_3.add(lblSbado);
		
		JLabel lblHoraDeEntrada = new JLabel("Hora de entrada:");
		lblHoraDeEntrada.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_3.add(lblHoraDeEntrada);
		
		entradaLunes = new JComboBox();
		panel_3.add(entradaLunes);
		
		entradaMartes = new JComboBox();
		panel_3.add(entradaMartes);
		
		entradaMiercoles = new JComboBox();
		panel_3.add(entradaMiercoles);
		
		entradaJueves = new JComboBox();
		panel_3.add(entradaJueves);
		
		entradaViernes = new JComboBox();
		panel_3.add(entradaViernes);
		
		entradaSabado = new JComboBox();
		panel_3.add(entradaSabado);
		
		JLabel lblHoraDeSalida = new JLabel("Hora de salida:");
		lblHoraDeSalida.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_3.add(lblHoraDeSalida);
		
		salidaLunes = new JComboBox();
		panel_3.add(salidaLunes);
		
		salidaMartes = new JComboBox();
		panel_3.add(salidaMartes);
		
		salidaMiércoles = new JComboBox();
		panel_3.add(salidaMiércoles);
		
		salidaJueves = new JComboBox();
		panel_3.add(salidaJueves);
		
		salidaViernes = new JComboBox();
		panel_3.add(salidaViernes);
		
		salidaSabado = new JComboBox();
		panel_3.add(salidaSabado);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_2.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_4.add(panel_5);
		panel_5.setLayout(new GridLayout(9, 4, 0, 0));
		
		JLabel label_1 = new JLabel("Apellido Paterno:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_1);
		
		editPaterno = new JTextField();
		editPaterno.addActionListener(this);
		editPaterno.setHorizontalAlignment(SwingConstants.CENTER);
		editPaterno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editPaterno.setColumns(10);
		panel_5.add(editPaterno);
		
		JLabel label_2 = new JLabel("Apellido Materno:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_2);
		
		editMaterno = new JTextField();
		editMaterno.addActionListener(this);
		editMaterno.setHorizontalAlignment(SwingConstants.CENTER);
		editMaterno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editMaterno.setColumns(10);
		panel_5.add(editMaterno);
		
		JLabel label_3 = new JLabel("Nombre:");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_3);
		
		editNombre = new JTextField();
		editNombre.addActionListener(this);
		editNombre.setHorizontalAlignment(SwingConstants.CENTER);
		editNombre.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editNombre.setColumns(10);
		panel_5.add(editNombre);
		
		JLabel label_4 = new JLabel("Calle:");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_4);
		
		editCalle = new JTextField();
		editCalle.addActionListener(this);
		editCalle.setHorizontalAlignment(SwingConstants.CENTER);
		editCalle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editCalle.setColumns(10);
		panel_5.add(editCalle);
		
		JLabel label_5 = new JLabel("Número de calle");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_5);
		
		editNumCalle = new JTextField();
		editNumCalle.addActionListener(this);
		editNumCalle.setHorizontalAlignment(SwingConstants.CENTER);
		editNumCalle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editNumCalle.setColumns(10);
		panel_5.add(editNumCalle);
		
		JLabel label_6 = new JLabel("Orientación:");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_6);
		
		editOrientacion = new JComboBox<String>();
		editOrientacion.setBackground(Color.WHITE);
		editOrientacion.setModel(new DefaultComboBoxModel<String>(new String[] {"Norte", "Sur", "Este", "Oeste"}));
		editOrientacion.addActionListener(this);
		editOrientacion.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(editOrientacion);
		
		JLabel label_7 = new JLabel("Entre calles:");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_7);
		
		editEntreCalles = new JTextField();
		editEntreCalles.addActionListener(this);
		editEntreCalles.setHorizontalAlignment(SwingConstants.CENTER);
		editEntreCalles.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editEntreCalles.setColumns(10);
		panel_5.add(editEntreCalles);
		
		JLabel label_8 = new JLabel("Género:");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_8);
		
		editGenero = new JComboBox<String>();
		editGenero.setBackground(Color.WHITE);
		editGenero.setModel(new DefaultComboBoxModel<String>(new String[] {"Masculino", "Femenino"}));
		editGenero.addActionListener(this);
		editGenero.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(editGenero);
		
		JLabel label_9 = new JLabel("Estado civil:");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_9);
		
		editEstadoCivil = new JTextField();
		editEstadoCivil.addActionListener(this);
		editEstadoCivil.setHorizontalAlignment(SwingConstants.CENTER);
		editEstadoCivil.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editEstadoCivil.setColumns(10);
		panel_5.add(editEstadoCivil);
		
		JLabel label_10 = new JLabel("Email:");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_10);
		
		editEmail = new JTextField();
		editEmail.addActionListener(this);
		editEmail.setHorizontalAlignment(SwingConstants.CENTER);
		editEmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editEmail.setColumns(10);
		panel_5.add(editEmail);
		
		JLabel label_11 = new JLabel("Teléfono:");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_11);
		
		editTelefono = new JTextField();
		editTelefono.addActionListener(this);
		editTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		editTelefono.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editTelefono.setColumns(10);
		panel_5.add(editTelefono);
		
		JLabel label_12 = new JLabel("Fecha de nacimiento:");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_12);
		
		fechaNacimiento = new RSDateChooser();
		fechaNacimiento.setFuente(new Font("Segoe UI Semibold", Font.BOLD, 17));
		panel_5.add(fechaNacimiento);
		
		JLabel label_13 = new JLabel("Código postal");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_13);
		
		buttonCodigoPostal = new JButton("Buscar código postal");
		buttonCodigoPostal.setForeground(Color.WHITE);
		buttonCodigoPostal.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonCodigoPostal.setBackground(new Color(45, 0, 255));
		buttonCodigoPostal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_5.add(buttonCodigoPostal);
		
		JLabel label_14 = new JLabel("Colonia");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_14);
		
		textColonia = new JLabel("");
		textColonia.setHorizontalAlignment(SwingConstants.CENTER);
		textColonia.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(textColonia);
		
		JLabel label_16 = new JLabel("Ciudad:");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(label_16);
		
		textCiudad = new JLabel("");
		textCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		textCiudad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_5.add(textCiudad);
		
		JLabel label_18 = new JLabel("");
		panel_5.add(label_18);
		
		JLabel label_19 = new JLabel("");
		panel_5.add(label_19);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.WHITE);
		panel_5.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		panel_5.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		panel_5.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		panel_5.add(separator_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_4.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 4, 0, 100));
		
		JLabel lblPrueba = new JLabel("Fecha de inicio:");
		lblPrueba.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrueba.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_6.add(lblPrueba);
		
		fechaInicio = new RSDateChooser();
		fechaInicio.setFuente(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_6.add(fechaInicio);
		
		JLabel lblFechaDeFinalizacin = new JLabel("Fecha de finalización");
		lblFechaDeFinalizacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaDeFinalizacin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_6.add(lblFechaDeFinalizacin);
		
		fechaFin = new RSDateChooser();
		fechaFin.setFuente(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_6.add(fechaFin);
		
		JLabel lblNewLabel = new JLabel("Puesto del trabajador:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_6.add(lblNewLabel);
		
		editPuestos = new JComboBox<String>();
		editPuestos.setBackground(Color.WHITE);
		editPuestos.addActionListener(this);
		editPuestos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_6.add(editPuestos);
		
		JLabel lblSueldo = new JLabel("Sueldo:");
		lblSueldo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSueldo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_6.add(lblSueldo);
		
		editSueldo = new JTextField();
		editSueldo.addActionListener(this);
		editSueldo.setHorizontalAlignment(SwingConstants.CENTER);
		editSueldo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_6.add(editSueldo);
		editSueldo.setColumns(10);
		
		JLabel lblNmeroDeSeguro = new JLabel("Número de seguro social");
		lblNmeroDeSeguro.setHorizontalAlignment(SwingConstants.CENTER);
		lblNmeroDeSeguro.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_6.add(lblNmeroDeSeguro);
		
		editNSS = new JTextField();
		editNSS.addActionListener(this);
		editNSS.setHorizontalAlignment(SwingConstants.CENTER);
		editNSS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panel_6.add(editNSS);
		editNSS.setColumns(10);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == editPaterno) {
			if(editPaterno.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo \"Apellido Panterno\" no puede quedar vacio.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editMaterno.requestFocus();
		}
		
		if(e.getSource() == editMaterno) {
			if(editMaterno.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo \"Materno Panterno\" no puede quedar vacio.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editNombre.requestFocus();
		}
		
		if(e.getSource() == editNombre) {
			if(editNombre.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo \"Nombre\" no puede quedar vacio.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editCalle.requestFocus();
		}
		
		if(e.getSource() == editCalle) {
			if(editCalle.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo \"Calle\" no puede quedar vacio.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editEntreCalles.requestFocus();
		}
		
		if(e.getSource() == editNumCalle) {
			if(editNumCalle.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo \"Número de calle\" no puede quedar vacio.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editOrientacion.requestFocus();
		}
		
		if(e.getSource() == editOrientacion) {
			editEntreCalles.requestFocus();
		}
		
		if(e.getSource() == editEntreCalles) {
			if(editEntreCalles.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo \"Entre calles\" no puede quedar vacio.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editGenero.requestFocus();
		}
		
		if(e.getSource() == editGenero) {
			editEstadoCivil.requestFocus();
		}
		
		if(e.getSource() == editEstadoCivil) {
			if(editEstadoCivil.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo \"Estado civil\" no puede quedar vacio.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editEmail.requestFocus();
		}
		
		if(e.getSource() == editEmail) {
			if(editEmail.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo \"Email\" no puede quedar vacio.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editTelefono.requestFocus();
		}
		
		if(e.getSource() == editTelefono) {
			if(editTelefono.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo \"Teléfono\" no puede quedar vacio.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				fechaNacimiento.requestFocus();
		}
		
		if(e.getSource() == fechaNacimiento) {
			buttonCodigoPostal.requestFocus();
		}
		
		if(e.getSource() == fechaInicio) {
			fechaFin.requestFocus();
		}
		
		if(e.getSource() == fechaFin) {
			editPuestos.requestFocus();
		}
		
		if(e.getSource() == editSueldo) {
			if(editSueldo.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo \"Sueldo\" no puede quedar vacio.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editNSS.requestFocus();
		}
		
		if(e.getSource() == editNSS) {
			if(editNSS.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo \"Número de seguro social\" no puede quedar vacio.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				entradaLunes.requestFocus();
		}
		
		if(e.getSource() == entradaLunes) {
			salidaLunes.requestFocus();
		}
		
		if(e.getSource() == salidaLunes) {
			entradaMartes.requestFocus();
		}
		
		if(e.getSource() == entradaMartes) {
			salidaMartes.requestFocus();
		}
		
		if(e.getSource() == salidaMartes) {
			entradaMiercoles.requestFocus();
		}
		
		if(e.getSource() == entradaMiercoles) {
			salidaJueves.requestFocus();
		}
		
		if(e.getSource() == salidaJueves) {
			entradaViernes.requestFocus();
		}
		
		if(e.getSource() == entradaViernes) {
			salidaViernes.requestFocus();
		}
		
		if(e.getSource() == salidaViernes) {
			entradaSabado.requestFocus();
		}
		
		if(e.getSource() == entradaSabado) {
			salidaSabado.requestFocus();
		}
		
		if(e.getSource() == salidaSabado) {
			buttonGuardar.requestFocus();
		}
	}
	
	public void llenarPuestos(List<ContratoTrabajador> empleados) {
		for (ContratoTrabajador empleado : empleados) 
			editPuestos.addItem(empleado.getPuestoTrabajador());
		editPuestos.addItem("Otro");
	}
	
	public JButton getButtonGuardar() {
		return buttonGuardar;
	}
	
	public JButton getButtonCodigoPostal() {
		return buttonCodigoPostal;
	}
	
	public JComboBox<String> getPuesto() {
		return editPuestos;
	}
}
