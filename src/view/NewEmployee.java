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
import modelo.DiaHora;
import modelo.Persona;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import rojeru_san.componentes.RSDateChooser;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class NewEmployee extends JPanel implements ActionListener{
	private JButton buttonGuardar;
	private JButton buttonCancelar;
	private JComboBox<String> entradaLunes;
	private JComboBox<String> entradaMartes;
	private JComboBox<String> entradaMiercoles;
	private JComboBox<String> entradaJueves;
	private JComboBox<String> entradaViernes;
	private JComboBox<String> entradaSabado;
	private JComboBox<String> salidaLunes;
	private JComboBox<String> salidaMartes;
	private JComboBox<String> salidaMiercoles;
	private JComboBox<String> salidaJueves;
	private JComboBox<String> salidaViernes;
	private JComboBox<String> salidaSabado;
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
	private JComboBox<String> editTipoHorario;
	private JButton buttonRegresar;
	private JPanel panelDatosPersonales;
	private JPanel panelDatosEmpleado;
	private JPanel panelHorasTrabajo;
	private JPanel panelAlmacenador;
	private JPanel panelSur;
	private JPanel panelTitulo;

	public NewEmployee() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		panelTitulo = new JPanel();
		panelTitulo.setBackground(Color.WHITE);
		add(panelTitulo, BorderLayout.NORTH);

		buttonRegresar = new JButton("");
		buttonRegresar.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		buttonRegresar.setContentAreaFilled(false);
		buttonRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelTitulo.add(buttonRegresar);

		JLabel lblNuevoEmpleado = new JLabel("                                                                     Nuevo empleado                                                                                ");
		lblNuevoEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoEmpleado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		panelTitulo.add(lblNuevoEmpleado);

		panelSur = new JPanel();
		panelSur.setBackground(Color.WHITE);
		add(panelSur, BorderLayout.SOUTH);

		buttonGuardar = new JButton("Guardar");
		buttonGuardar.setForeground(Color.WHITE);
		buttonGuardar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonGuardar.setBackground(new Color(45, 0, 255));
		buttonGuardar.setBounds(10, 266, 269, 29);
		buttonGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(buttonGuardar);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setForeground(Color.WHITE);
		buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonCancelar.setBackground(new Color(45, 0, 255));
		buttonCancelar.setBounds(10, 266, 269, 29);
		buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(buttonCancelar);

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		panelHorasTrabajo = new JPanel();
		panelHorasTrabajo.setBackground(Color.WHITE);
		panel_2.add(panelHorasTrabajo, BorderLayout.SOUTH);
		panelHorasTrabajo.setLayout(new GridLayout(3, 7, 0, 0));

		JLabel label = new JLabel("");
		panelHorasTrabajo.add(label);

		JLabel lblLunes = new JLabel("Lunes");
		lblLunes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblLunes.setHorizontalAlignment(SwingConstants.CENTER);
		panelHorasTrabajo.add(lblLunes);

		JLabel lblMartes = new JLabel("Martes");
		lblMartes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblMartes.setHorizontalAlignment(SwingConstants.CENTER);
		panelHorasTrabajo.add(lblMartes);

		JLabel lblMircoles = new JLabel("Miércoles");
		lblMircoles.setHorizontalAlignment(SwingConstants.CENTER);
		lblMircoles.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panelHorasTrabajo.add(lblMircoles);

		JLabel lblJueves = new JLabel("Jueves");
		lblJueves.setHorizontalAlignment(SwingConstants.CENTER);
		lblJueves.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panelHorasTrabajo.add(lblJueves);

		JLabel lblViernes = new JLabel("Viernes");
		lblViernes.setHorizontalAlignment(SwingConstants.CENTER);
		lblViernes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panelHorasTrabajo.add(lblViernes);

		JLabel lblSbado = new JLabel("Sábado");
		lblSbado.setHorizontalAlignment(SwingConstants.CENTER);
		lblSbado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panelHorasTrabajo.add(lblSbado);

		JLabel lblHoraDeEntrada = new JLabel("Hora de entrada:");
		lblHoraDeEntrada.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panelHorasTrabajo.add(lblHoraDeEntrada);

		entradaLunes = new JComboBox<String>();
		entradaLunes.setBackground(Color.WHITE);
		entradaLunes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		entradaLunes.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(entradaLunes);

		entradaMartes = new JComboBox<String>();
		entradaMartes.setBackground(Color.WHITE);
		entradaMartes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		entradaMartes.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(entradaMartes);

		entradaMiercoles = new JComboBox<String>();
		entradaMiercoles.setBackground(Color.WHITE);
		entradaMiercoles.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		entradaMiercoles.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(entradaMiercoles);

		entradaJueves = new JComboBox<String>();
		entradaJueves.setBackground(Color.WHITE);
		entradaJueves.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		entradaJueves.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(entradaJueves);

		entradaViernes = new JComboBox<String>();
		entradaViernes.setBackground(Color.WHITE);
		entradaViernes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		entradaViernes.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(entradaViernes);

		entradaSabado = new JComboBox<String>();
		entradaSabado.setBackground(Color.WHITE);
		entradaSabado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		entradaSabado.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(entradaSabado);

		JLabel lblHoraDeSalida = new JLabel("Hora de salida:");
		lblHoraDeSalida.setBackground(Color.WHITE);
		lblHoraDeSalida.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panelHorasTrabajo.add(lblHoraDeSalida);

		salidaLunes = new JComboBox<String>();
		salidaLunes.setBackground(Color.WHITE);
		salidaLunes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		salidaLunes.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(salidaLunes);

		salidaMartes = new JComboBox<String>();
		salidaMartes.setBackground(Color.WHITE);
		salidaMartes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		salidaMartes.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(salidaMartes);

		salidaMiercoles = new JComboBox<String>();
		salidaMiercoles.setBackground(Color.WHITE);
		salidaMiercoles.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		salidaMiercoles.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(salidaMiercoles);

		salidaJueves = new JComboBox<String>();
		salidaJueves.setBackground(Color.WHITE);
		salidaJueves.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		salidaJueves.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(salidaJueves);

		salidaViernes = new JComboBox<String>();
		salidaViernes.setBackground(Color.WHITE);
		salidaViernes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		salidaViernes.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(salidaViernes);

		salidaSabado = new JComboBox<String>();
		salidaSabado.setBackground(Color.WHITE);
		salidaSabado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		salidaSabado.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelHorasTrabajo.add(salidaSabado);

		panelAlmacenador = new JPanel();
		panelAlmacenador.setBackground(Color.WHITE);
		panel_2.add(panelAlmacenador, BorderLayout.CENTER);
		panelAlmacenador.setLayout(new GridLayout(2, 1, 0, 0));

		panelDatosPersonales = new JPanel();
		panelDatosPersonales.setBackground(Color.WHITE);
		panelAlmacenador.add(panelDatosPersonales);
		panelDatosPersonales.setLayout(new GridLayout(9, 4, 0, 0));

		JLabel label_1 = new JLabel("Apellido Paterno:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_1);

		editPaterno = new JTextField();
		editPaterno.addActionListener(this);
		editPaterno.setHorizontalAlignment(SwingConstants.CENTER);
		editPaterno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editPaterno.setColumns(10);
		panelDatosPersonales.add(editPaterno);

		JLabel label_2 = new JLabel("Apellido Materno:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_2);

		editMaterno = new JTextField();
		editMaterno.addActionListener(this);
		editMaterno.setHorizontalAlignment(SwingConstants.CENTER);
		editMaterno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editMaterno.setColumns(10);
		panelDatosPersonales.add(editMaterno);

		JLabel label_3 = new JLabel("Nombre:");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_3);

		editNombre = new JTextField();
		editNombre.addActionListener(this);
		editNombre.setHorizontalAlignment(SwingConstants.CENTER);
		editNombre.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editNombre.setColumns(10);
		panelDatosPersonales.add(editNombre);

		JLabel label_4 = new JLabel("Calle:");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_4);

		editCalle = new JTextField();
		editCalle.addActionListener(this);
		editCalle.setHorizontalAlignment(SwingConstants.CENTER);
		editCalle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editCalle.setColumns(10);
		panelDatosPersonales.add(editCalle);

		JLabel label_5 = new JLabel("Número de calle");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_5);

		editNumCalle = new JTextField();
		editNumCalle.addActionListener(this);
		editNumCalle.setHorizontalAlignment(SwingConstants.CENTER);
		editNumCalle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editNumCalle.setColumns(10);
		panelDatosPersonales.add(editNumCalle);

		JLabel label_6 = new JLabel("Orientación:");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_6);

		editOrientacion = new JComboBox<String>();
		editOrientacion.setBackground(Color.WHITE);
		editOrientacion.setModel(new DefaultComboBoxModel<String>(new String[] {"Norte", "Sur", "Este", "Oeste"}));
		editOrientacion.addActionListener(this);
		editOrientacion.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(editOrientacion);

		JLabel label_7 = new JLabel("Entre calles:");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_7);

		editEntreCalles = new JTextField();
		editEntreCalles.addActionListener(this);
		editEntreCalles.setHorizontalAlignment(SwingConstants.CENTER);
		editEntreCalles.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editEntreCalles.setColumns(10);
		panelDatosPersonales.add(editEntreCalles);

		JLabel label_8 = new JLabel("Género:");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_8);

		editGenero = new JComboBox<String>();
		editGenero.setBackground(Color.WHITE);
		editGenero.setModel(new DefaultComboBoxModel<String>(new String[] {"Masculino", "Femenino"}));
		editGenero.addActionListener(this);
		editGenero.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(editGenero);

		JLabel label_9 = new JLabel("Estado civil:");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_9);

		editEstadoCivil = new JTextField();
		editEstadoCivil.addActionListener(this);
		editEstadoCivil.setHorizontalAlignment(SwingConstants.CENTER);
		editEstadoCivil.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editEstadoCivil.setColumns(10);
		panelDatosPersonales.add(editEstadoCivil);

		JLabel label_10 = new JLabel("Email:");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_10);

		editEmail = new JTextField();
		editEmail.addActionListener(this);
		editEmail.setHorizontalAlignment(SwingConstants.CENTER);
		editEmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editEmail.setColumns(10);
		panelDatosPersonales.add(editEmail);

		JLabel label_11 = new JLabel("Teléfono:");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_11);

		editTelefono = new JTextField();
		editTelefono.addActionListener(this);
		editTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		editTelefono.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editTelefono.setColumns(10);
		panelDatosPersonales.add(editTelefono);

		JLabel label_12 = new JLabel("Fecha de nacimiento:");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_12);

		fechaNacimiento = new RSDateChooser();
		fechaNacimiento.setFuente(new Font("Segoe UI Semibold", Font.BOLD, 17));
		panelDatosPersonales.add(fechaNacimiento);

		JLabel label_13 = new JLabel("Código postal");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_13);

		buttonCodigoPostal = new JButton("Buscar código postal");
		buttonCodigoPostal.setForeground(Color.WHITE);
		buttonCodigoPostal.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonCodigoPostal.setBackground(new Color(45, 0, 255));
		buttonCodigoPostal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelDatosPersonales.add(buttonCodigoPostal);

		JLabel label_14 = new JLabel("Colonia");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_14);

		textColonia = new JLabel("");
		textColonia.setHorizontalAlignment(SwingConstants.CENTER);
		textColonia.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(textColonia);

		JLabel label_16 = new JLabel("Ciudad:");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(label_16);

		textCiudad = new JLabel("");
		textCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		textCiudad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosPersonales.add(textCiudad);

		JLabel label_18 = new JLabel("");
		panelDatosPersonales.add(label_18);

		JLabel label_19 = new JLabel("");
		panelDatosPersonales.add(label_19);

		JSeparator separator = new JSeparator();
		separator.setBackground(Color.WHITE);
		panelDatosPersonales.add(separator);

		JSeparator separator_1 = new JSeparator();
		panelDatosPersonales.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		panelDatosPersonales.add(separator_2);

		JSeparator separator_3 = new JSeparator();
		panelDatosPersonales.add(separator_3);

		panelDatosEmpleado = new JPanel();
		panelDatosEmpleado.setBackground(Color.WHITE);
		panelAlmacenador.add(panelDatosEmpleado);
		panelDatosEmpleado.setLayout(new GridLayout(0, 4, 0, 100));

		JLabel lblPrueba = new JLabel("Fecha de inicio:");
		lblPrueba.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrueba.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosEmpleado.add(lblPrueba);

		fechaInicio = new RSDateChooser();
		fechaInicio.setFuente(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosEmpleado.add(fechaInicio);

		JLabel lblFechaDeFinalizacin = new JLabel("Fecha de finalización");
		lblFechaDeFinalizacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaDeFinalizacin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosEmpleado.add(lblFechaDeFinalizacin);

		fechaFin = new RSDateChooser();
		fechaFin.setFuente(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosEmpleado.add(fechaFin);

		JLabel lblNewLabel = new JLabel("Puesto del trabajador:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosEmpleado.add(lblNewLabel);

		editPuestos = new JComboBox<String>();
		editPuestos.setBackground(Color.WHITE);
		editPuestos.addActionListener(this);
		editPuestos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosEmpleado.add(editPuestos);

		JLabel lblSueldo = new JLabel("Sueldo:");
		lblSueldo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSueldo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosEmpleado.add(lblSueldo);

		editSueldo = new JTextField();
		editSueldo.addActionListener(this);
		editSueldo.setHorizontalAlignment(SwingConstants.CENTER);
		editSueldo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosEmpleado.add(editSueldo);
		editSueldo.setColumns(10);

		JLabel lblNmeroDeSeguro = new JLabel("Número de seguro social");
		lblNmeroDeSeguro.setHorizontalAlignment(SwingConstants.CENTER);
		lblNmeroDeSeguro.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosEmpleado.add(lblNmeroDeSeguro);

		editNSS = new JTextField();
		editNSS.addActionListener(this);
		editNSS.setHorizontalAlignment(SwingConstants.CENTER);
		editNSS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosEmpleado.add(editNSS);
		editNSS.setColumns(10);

		JLabel lblTipoDeHorario = new JLabel("Tipo de horario:");
		lblTipoDeHorario.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeHorario.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelDatosEmpleado.add(lblTipoDeHorario);

		editTipoHorario = new JComboBox<String>();
		editTipoHorario.addActionListener(this);
		editTipoHorario.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editTipoHorario.setBackground(Color.WHITE);
		panelDatosEmpleado.add(editTipoHorario);

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
				editNumCalle.requestFocus();
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
		
		if(e.getSource() == editPuestos) {
			if(editPuestos.getSelectedItem().toString() == "Otro") {
				String puesto = JOptionPane.showInputDialog(null, "Agrega el nuevo tipo de empleado:");
				editPuestos.addItem(puesto);
				editPuestos.setSelectedItem(puesto);
				editSueldo.requestFocus();
			}
			else
				editSueldo.requestFocus();
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
				editTipoHorario.requestFocus();
		}
		
		if(e.getSource() == editTipoHorario) {
			if(editTipoHorario.getSelectedItem().toString() == "Otro") {
				String tipoHorario = JOptionPane.showInputDialog(null, "Agrega el nuevo tipo de horario:");
				editTipoHorario.addItem(tipoHorario);
				editTipoHorario.setSelectedItem(tipoHorario);
				entradaLunes.requestFocus();
			}
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

	public Persona getNewPerson() {
		Persona person = new Persona();
		person.setApellidoPaternoPer(editPaterno.getText());
		person.setApellidoMaternoPer(editMaterno.getText());
		person.setNombrePer(editNombre.getText());
		person.setCallePer(editCalle.getText());
		person.setNumeroPer(Integer.parseInt(editNumCalle.getText()));
		person.setOrientacionPer(editOrientacion.getSelectedItem().toString());
		person.setEntreCallesPer(editEntreCalles.getText());
		person.setGeneroPer(editGenero.getSelectedItem().toString());
		person.setEstadoCivilPer(editEstadoCivil.getText());
		person.setMailPer(editEmail.getText());
		person.setTelefono(Integer.parseInt(editTelefono.getText()));
		person.setFechaNacimientoPer(getDateFormat(fechaNacimiento.getDatoFecha()));

		return person;
	}

	public ContratoTrabajador getNewEmployee() {
		ContratoTrabajador employee = new ContratoTrabajador();
		employee.setFechaInicioTrabajador(getDateFormat(fechaInicio.getDatoFecha()));
		employee.setFechaFinTrabajador(getDateFormat(fechaFin.getDatoFecha()));
		employee.setPuestoTrabajador(editPuestos.getSelectedItem().toString());
		employee.setSueldoTrabajador(Integer.parseInt(editSueldo.getText()));
		employee.setNumeroSSTrabajador(editNSS.getText());

		return employee;
	}
	
	public java.sql.Time getTiempo(String tiempo) {
		String[] horario = tiempo.split(":");
		return new java.sql.Time(Integer.parseInt(horario[0]), Integer.parseInt(horario[1]), 00);
	}

	public DiaHora getTime(int i) {
		DiaHora date = new DiaHora();

		switch(i) {
		case 1:
			date.setDiaDiaHora("Lunes");
			date.setHoraEntDiaHora(getTiempo(entradaLunes.getSelectedItem().toString()));
			date.setHoraSalidaDiaHora(getTiempo(salidaLunes.getSelectedItem().toString()));
			date.setTipoDiaHora(editTipoHorario.getSelectedItem().toString());
			break;
		case 2:
			date.setDiaDiaHora("Martes");
			date.setHoraEntDiaHora(getTiempo(entradaMartes.getSelectedItem().toString()));
			date.setHoraSalidaDiaHora(getTiempo(salidaMartes.getSelectedItem().toString()));
			date.setTipoDiaHora(editTipoHorario.getSelectedItem().toString());
			break;
		case 3:
			date.setDiaDiaHora("Miércoles");
			date.setHoraEntDiaHora(getTiempo(entradaMiercoles.getSelectedItem().toString()));
			date.setHoraSalidaDiaHora(getTiempo(salidaMiercoles.getSelectedItem().toString()));
			date.setTipoDiaHora(editTipoHorario.getSelectedItem().toString());
			break;
		case 4:
			date.setDiaDiaHora("Jueves");
			date.setHoraEntDiaHora(getTiempo(entradaJueves.getSelectedItem().toString()));
			date.setHoraSalidaDiaHora(getTiempo(salidaJueves.getSelectedItem().toString()));
			date.setTipoDiaHora(editTipoHorario.getSelectedItem().toString());
			break;
		case 5:
			date.setDiaDiaHora("Viernes");
			date.setHoraEntDiaHora(getTiempo(entradaViernes.getSelectedItem().toString()));
			date.setHoraSalidaDiaHora(getTiempo(salidaViernes.getSelectedItem().toString()));
			date.setTipoDiaHora(editTipoHorario.getSelectedItem().toString());
			break;
		case 6:
			date.setDiaDiaHora("Sábado");
			date.setHoraEntDiaHora(getTiempo(entradaSabado.getSelectedItem().toString()));
			date.setHoraSalidaDiaHora(getTiempo(salidaSabado.getSelectedItem().toString()));
			date.setTipoDiaHora(editTipoHorario.getSelectedItem().toString());
			break;
		default:

		}
		return date;
	}
	
	public boolean camposVacios() {
		Date date, date1, date2;
		date = fechaNacimiento.getDatoFecha();
		date1 = fechaInicio.getDatoFecha();
		date2 = fechaFin.getDatoFecha();
		String fechaNac = "", fechaIni = "", fechaFin = "";
		
		if(date != null && date1 != null && date2 != null) {
			fechaNac = "dato";
			fechaIni = "dato";
			fechaFin = "dato";
		}
		else {
			
		}
		
		return editPaterno.getText().isEmpty() || editMaterno.getText().isEmpty() || editNombre.getText().isEmpty() || editCalle.getText().isEmpty() ||
				editNumCalle.getText().isEmpty() || editEntreCalles.getText().isEmpty() || editEstadoCivil.getText().isEmpty() || editEmail.getText().isEmpty() ||
				editTelefono.getText().isEmpty() || fechaNac.isEmpty() || fechaIni.isEmpty() || fechaFin.isEmpty() || editSueldo.getText().isEmpty() || 
				editNSS.getText().isEmpty();
	}
	
	public void limpiarCampos() {
		fechaNacimiento.setDatoFecha(null);
		fechaInicio.setDatoFecha(null);
		fechaFin.setDatoFecha(null);
		editPaterno.setText(null);
		editMaterno.setText(null); 
		editNombre.setText(null);
		editCalle.setText(null);
		editNumCalle.setText(null); 
		editEntreCalles.setText(null);
		editEstadoCivil.setText(null);
		editEmail.setText(null);
		editTelefono.setText(null);
		editSueldo.setText(null);
		editNSS.setText(null);
	}

	public java.sql.Date getDateFormat(Date fechaNacimiento) {
		String formatoFecha = "yyyyMMdd";
		Date fecha = fechaNacimiento;

		SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
		String prueba1 = String.valueOf(formateador.format(fecha));

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date parsed = null;
		try {
			parsed = format.parse(prueba1);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		java.sql.Date sql = new java.sql.Date(parsed.getTime());

		return sql;
	}

	public void llenarPuestos(List<ContratoTrabajador> empleados) {
		for (ContratoTrabajador empleado : empleados) 
			editPuestos.addItem(empleado.getPuestoTrabajador());
		editPuestos.addItem("Otro");
	}

	public void llenarDiaHora(List<DiaHora> tipos) {
		for (DiaHora diaHora : tipos) 
			editTipoHorario.addItem(diaHora.getTipoDiaHora());
		editTipoHorario.addItem("Otro");
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

	public JComboBox<String> getDiaHora() {
		return editTipoHorario;
	}

	public JComboBox<String> getTipoPuesto() {
		return editPuestos;
	}

	public JComboBox<String> getTipoHorario() {
		return editTipoHorario;
	}

	public JLabel getTextColonia() {
		return textColonia;
	}

	public JLabel getTextCiudad() {
		return textCiudad;
	}
	
	public JButton getButtonRegresar() {
		return buttonRegresar;
	}
	
	public JButton getButtonCancelar() {
		return buttonCancelar;
	}
}
