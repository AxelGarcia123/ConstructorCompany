package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import modelo.Persona;

import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import rojeru_san.componentes.RSDateChooser;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class NuevoCliente extends JPanel implements ActionListener{
	private JPanel panelTitulo;
	private JPanel panelCentral;
	private JPanel panelSur;
	private JLabel label_1;
	private JTextField editPaterno;
	private JLabel label_2;
	private JTextField editMaterno;
	private JLabel label_3;
	private JTextField editNombre;
	private JLabel label_4;
	private JTextField editCalle;
	private JLabel label_5;
	private JTextField editNumCalle;
	private JLabel label_6;
	private JComboBox<String> editOrientacion;
	private JLabel label_7;
	private JTextField editEntreCalles;
	private JLabel label_8;
	private JComboBox<String> editGenero;
	private JLabel label_9;
	private JTextField editEstadoCivil;
	private JLabel label_10;
	private JTextField editEmail;
	private JLabel label_11;
	private JTextField editTelefono;
	private JLabel label_12;
	private RSDateChooser fechaNacimiento;
	private JLabel label_13;
	private JButton buttonCodigoPostal;
	private JLabel label_14;
	private JLabel textColonia;
	private JLabel label_16;
	private JLabel textCiudad;
	private JButton buttonGuardar;
	private JButton buttonCancelar;
	private JButton buttonRegresar;

	public NuevoCliente() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		panelTitulo = new JPanel();
		panelTitulo.setBackground(Color.WHITE);
		add(panelTitulo, BorderLayout.NORTH);
		
		buttonRegresar = new JButton("");
		buttonRegresar.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		buttonRegresar.setContentAreaFilled(false);
		panelTitulo.add(buttonRegresar);
		
		JLabel label = new JLabel("                                                                     Nuevo empleado                                                                                ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		panelTitulo.add(label);
		
		panelCentral = new JPanel();
		panelCentral.setBackground(Color.WHITE);
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(8, 4, 0, 40));
		
		label_1 = new JLabel("Apellido Paterno:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_1);
		
		editPaterno = new JTextField();
		editPaterno.addActionListener(this);
		editPaterno.setHorizontalAlignment(SwingConstants.CENTER);
		editPaterno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editPaterno.setColumns(10);
		panelCentral.add(editPaterno);
		
		label_2 = new JLabel("Apellido Materno:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_2);
		
		editMaterno = new JTextField();
		editMaterno.addActionListener(this);
		editMaterno.setHorizontalAlignment(SwingConstants.CENTER);
		editMaterno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editMaterno.setColumns(10);
		panelCentral.add(editMaterno);
		
		label_3 = new JLabel("Nombre:");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_3);
		
		editNombre = new JTextField();
		editNombre.addActionListener(this);
		editNombre.setHorizontalAlignment(SwingConstants.CENTER);
		editNombre.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editNombre.setColumns(10);
		panelCentral.add(editNombre);
		
		label_4 = new JLabel("Calle:");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_4);
		
		editCalle = new JTextField();
		editCalle.addActionListener(this);
		editCalle.setHorizontalAlignment(SwingConstants.CENTER);
		editCalle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editCalle.setColumns(10);
		panelCentral.add(editCalle);
		
		label_5 = new JLabel("Número de calle");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_5);
		
		editNumCalle = new JTextField();
		editNumCalle.addActionListener(this);
		editNumCalle.setHorizontalAlignment(SwingConstants.CENTER);
		editNumCalle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editNumCalle.setColumns(10);
		panelCentral.add(editNumCalle);
		
		label_6 = new JLabel("Orientación:");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_6);
		
		editOrientacion = new JComboBox<String>();
		editOrientacion.setModel(new DefaultComboBoxModel<String>(new String[] {"Norte", "Sur", "Este", "Oeste"}));
		editOrientacion.addActionListener(this);
		editOrientacion.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editOrientacion.setBackground(Color.WHITE);
		panelCentral.add(editOrientacion);
		
		label_7 = new JLabel("Entre calles:");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_7);
		
		editEntreCalles = new JTextField();
		editEntreCalles.addActionListener(this);
		editEntreCalles.setHorizontalAlignment(SwingConstants.CENTER);
		editEntreCalles.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editEntreCalles.setColumns(10);
		panelCentral.add(editEntreCalles);
		
		label_8 = new JLabel("Género:");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_8);
		
		editGenero = new JComboBox<String>();
		editGenero.setModel(new DefaultComboBoxModel<String>(new String[] {"Masculino", "Femenino"}));
		editGenero.addActionListener(this);
		editGenero.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editGenero.setBackground(Color.WHITE);
		panelCentral.add(editGenero);
		
		label_9 = new JLabel("Estado civil:");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_9);
		
		editEstadoCivil = new JTextField();
		editEstadoCivil.addActionListener(this);
		editEstadoCivil.setHorizontalAlignment(SwingConstants.CENTER);
		editEstadoCivil.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editEstadoCivil.setColumns(10);
		panelCentral.add(editEstadoCivil);
		
		label_10 = new JLabel("Email:");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_10);
		
		editEmail = new JTextField();
		editEmail.addActionListener(this);
		editEmail.setHorizontalAlignment(SwingConstants.CENTER);
		editEmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editEmail.setColumns(10);
		panelCentral.add(editEmail);
		
		label_11 = new JLabel("Teléfono:");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_11);
		
		editTelefono = new JTextField();
		editTelefono.addActionListener(this);
		editTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		editTelefono.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		editTelefono.setColumns(10);
		panelCentral.add(editTelefono);
		
		label_12 = new JLabel("Fecha de nacimiento:");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_12);
		
		fechaNacimiento = new RSDateChooser();
		fechaNacimiento.setFuente(new Font("Segoe UI Semibold", Font.BOLD, 17));
		panelCentral.add(fechaNacimiento);
		
		label_13 = new JLabel("Código postal");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_13);
		
		buttonCodigoPostal = new JButton("Buscar código postal");
		buttonCodigoPostal.setForeground(Color.WHITE);
		buttonCodigoPostal.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonCodigoPostal.setBackground(new Color(45, 0, 255));
		buttonCodigoPostal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelCentral.add(buttonCodigoPostal);
		
		label_14 = new JLabel("Colonia");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_14);
		
		textColonia = new JLabel("");
		textColonia.setHorizontalAlignment(SwingConstants.CENTER);
		textColonia.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(textColonia);
		
		label_16 = new JLabel("Ciudad:");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(label_16);
		
		textCiudad = new JLabel("");
		textCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		textCiudad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelCentral.add(textCiudad);
		
		panelSur = new JPanel();
		panelSur.setBackground(Color.WHITE);
		add(panelSur, BorderLayout.SOUTH);
		
		buttonGuardar = new JButton("Guardar");
		buttonGuardar.setForeground(Color.WHITE);
		buttonGuardar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonGuardar.setBackground(new Color(45, 0, 255));
		buttonGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(buttonGuardar);
		
		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setForeground(Color.WHITE);
		buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonCancelar.setBackground(new Color(45, 0, 255));
		buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(buttonCancelar);

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
	
	public boolean camposVacios() {
		Date date;
		date = fechaNacimiento.getDatoFecha();
		String fechaNac = "";
		
		if(date != null ) {
			fechaNac = "dato";
		}
		else {
			
		}
		
		return editPaterno.getText().isEmpty() || editMaterno.getText().isEmpty() || editNombre.getText().isEmpty() || editCalle.getText().isEmpty() ||
				editNumCalle.getText().isEmpty() || editEntreCalles.getText().isEmpty() || editEstadoCivil.getText().isEmpty() || editEmail.getText().isEmpty() ||
				editTelefono.getText().isEmpty() || fechaNac.isEmpty();
	}
	
	public void limpiarCampos() {
		fechaNacimiento.setDatoFecha(null);
		editPaterno.setText(null);
		editMaterno.setText(null); 
		editNombre.setText(null);
		editCalle.setText(null);
		editNumCalle.setText(null); 
		editEntreCalles.setText(null);
		editEstadoCivil.setText(null);
		editEmail.setText(null);
		editTelefono.setText(null);
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
	
	public JButton getButtonGuardar() {
		return buttonGuardar;
	}
	
	public JButton getButtonCancelar() {
		return buttonCancelar;
	}

	public JButton getButtonCodigoPostal() {
		return buttonCodigoPostal;
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
}
