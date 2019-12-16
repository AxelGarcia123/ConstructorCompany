package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import modelo.Cita;
import modelo.Persona;
import modelo.StatusCita;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import rojeru_san.componentes.RSDateChooser;
import javax.swing.JTextArea;

public class AgendarCita extends JPanel {
	private JButton buttonRegresar;
	private JButton buttonAgendarCita;
	private JButton buttonCancelar;
	private JPanel panelTitulo;
	private JPanel panelSur;
	private JScrollPane central;
	private JPanel panelCentral;
	private JPanel panelSubCentral;
	private JLabel lblCalle;
	private JTextField editCalle;
	private JLabel lblHoraDeInicio;
	private JComboBox<String> editHoraInicio;
	private JLabel lblHoraDeFinalizacin;
	private JComboBox<String> editHoraFin;
	private RSDateChooser fechaProgramada;
	private JLabel lblNmeroDeCalle;
	private JTextField editNumeroCalle;
	private JLabel lblNewLabel;
	private JComboBox<String> editOrientacion;
	private JLabel lblBuscarColonia;
	private JButton buttonBuscar;
	private JLabel lblColonia;
	private JLabel textColonia;
	private JLabel lblCliente;
	private JComboBox<String> editCliente;
	private JLabel lblArquitecto;
	private JComboBox<String> editArquitecto;
	private List<Persona> cliente;
	private List<Persona> arquitecto;
	private JLabel lblEstatusDeLa;
	private JLabel lblCausaDelEstatus;
	private JScrollPane scrollPane;
	private JTextArea editCausaCita;
	private JLabel textAgendada;

	public AgendarCita() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		panelTitulo = new JPanel();
		panelTitulo.setBackground(Color.WHITE);
		add(panelTitulo, BorderLayout.NORTH);

		buttonRegresar = new JButton("");
		buttonRegresar.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		buttonRegresar.setContentAreaFilled(false);
		panelTitulo.add(buttonRegresar);

		JLabel lblAgendarCita = new JLabel("                                                                             Agendar Cita                                                                                        ");
		lblAgendarCita.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgendarCita.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelTitulo.add(lblAgendarCita);

		panelSur = new JPanel();
		panelSur.setBackground(Color.WHITE);
		add(panelSur, BorderLayout.SOUTH);

		buttonAgendarCita = new JButton("Agendar cita");
		buttonAgendarCita.setForeground(Color.WHITE);
		buttonAgendarCita.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonAgendarCita.setBackground(new Color(45, 0, 255));
		buttonAgendarCita.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(buttonAgendarCita);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setForeground(Color.WHITE);
		buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonCancelar.setBackground(new Color(45, 0, 255));
		buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(buttonCancelar);

		central = new JScrollPane();
		add(central, BorderLayout.CENTER);

		panelCentral = new JPanel();
		panelCentral.setBackground(Color.WHITE);
		central.setViewportView(panelCentral);
		panelCentral.setLayout(new BorderLayout(0, 0));

		panelSubCentral = new JPanel();
		panelSubCentral.setBackground(Color.WHITE);
		panelCentral.add(panelSubCentral, BorderLayout.CENTER);
		panelSubCentral.setLayout(new GridLayout(0, 4, 0, 80));

		JLabel lblFechaProgramada = new JLabel("Fecha programada");
		panelSubCentral.add(lblFechaProgramada);

		fechaProgramada = new RSDateChooser();
		panelSubCentral.add(fechaProgramada);

		lblCalle = new JLabel("Calle");
		panelSubCentral.add(lblCalle);

		editCalle = new JTextField();
		panelSubCentral.add(editCalle);
		editCalle.setColumns(10);

		lblHoraDeInicio = new JLabel("Hora de inicio");
		panelSubCentral.add(lblHoraDeInicio);

		editHoraInicio = new JComboBox<String>();
		editHoraInicio.setBackground(Color.WHITE);
		editHoraInicio.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelSubCentral.add(editHoraInicio);

		lblHoraDeFinalizacin = new JLabel("Hora de finalización");
		panelSubCentral.add(lblHoraDeFinalizacin);

		editHoraFin = new JComboBox<String>();
		editHoraFin.setBackground(Color.WHITE);
		editHoraFin.setModel(new DefaultComboBoxModel<String>(new String[] {"7:00", "7:30", "8:00", "8:30", "9:00", "9:30", 
				"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"}));
		panelSubCentral.add(editHoraFin);

		lblNmeroDeCalle = new JLabel("Número de calle");
		panelSubCentral.add(lblNmeroDeCalle);

		editNumeroCalle = new JTextField();
		panelSubCentral.add(editNumeroCalle);
		editNumeroCalle.setColumns(10);

		lblNewLabel = new JLabel("Orientación");
		panelSubCentral.add(lblNewLabel);

		editOrientacion = new JComboBox<String>();
		editOrientacion.setBackground(Color.WHITE);
		editOrientacion.setModel(new DefaultComboBoxModel<String>(new String[] {"Norte", "Sur", "Este", "Oeste"}));
		panelSubCentral.add(editOrientacion);

		lblBuscarColonia = new JLabel("Buscar colonia");
		panelSubCentral.add(lblBuscarColonia);

		buttonBuscar = new JButton("Buscar");
		buttonBuscar.setForeground(Color.WHITE);
		buttonBuscar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonBuscar.setBackground(new Color(45, 0, 255));
		buttonBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSubCentral.add(buttonBuscar);

		lblColonia = new JLabel("Colonia");
		panelSubCentral.add(lblColonia);

		textColonia = new JLabel("");
		panelSubCentral.add(textColonia);

		lblCliente = new JLabel("Cliente");
		panelSubCentral.add(lblCliente);

		editCliente = new JComboBox<String>();
		editCliente.setBackground(Color.WHITE);
		panelSubCentral.add(editCliente);

		lblArquitecto = new JLabel("Arquitecto");
		panelSubCentral.add(lblArquitecto);

		editArquitecto = new JComboBox<String>();
		editArquitecto.setBackground(Color.WHITE);
		panelSubCentral.add(editArquitecto);
		
		lblEstatusDeLa = new JLabel("Estatus de la cita");
		panelSubCentral.add(lblEstatusDeLa);
		
		textAgendada = new JLabel("Agendada");
		panelSubCentral.add(textAgendada);
		
		lblCausaDelEstatus = new JLabel("Causa del estatus");
		panelSubCentral.add(lblCausaDelEstatus);
		
		scrollPane = new JScrollPane();
		panelSubCentral.add(scrollPane);
		
		editCausaCita = new JTextArea();
		editCausaCita.setLineWrap(true);
		scrollPane.setViewportView(editCausaCita);

	}
	
	public Cita getNuevaCita() {
		Cita cita = new Cita();
		cita.setFechaCita(getDateFormat(fechaProgramada.getDatoFecha()));
		cita.setCalleCita(editCalle.getText());
		cita.setHoraInicioCita(getTiempo(editHoraInicio.getSelectedItem().toString()));
		cita.setHoraFinCita(getTiempo(editHoraFin.getSelectedItem().toString()));
		cita.setNumeroCita(Integer.parseInt(editNumeroCalle.getText()));
		cita.setOrientacionCita(editOrientacion.getSelectedItem().toString());
		
		for (Persona arquitect : arquitecto) {
			StringBuilder nombreArq = new StringBuilder(arquitect.getApellidoPaternoPer() + " " + arquitect.getApellidoMaternoPer() + " "+ arquitect.getNombrePer());
			if(editArquitecto.getSelectedItem().toString().equals(nombreArq.toString())) {
				cita.setClaveTrabajador(arquitect.getClavePer());
				break;
			}
		}
		
		for (Persona clientes : cliente) {
			StringBuilder nombreCli = new StringBuilder(clientes.getApellidoPaternoPer() + " " + clientes.getApellidoMaternoPer() + " "+ clientes.getNombrePer());
			if(editCliente.getSelectedItem().toString().equals(nombreCli.toString())) {
				cita.setClaveCliente(clientes.getClavePer());
				break;
			}
		}
		
		return cita;
	}
	
	public StatusCita getStatusCita() {
		StatusCita status = new StatusCita();
		status.setStatusStatus(textAgendada.getText());
		status.setCausaStatus(editCausaCita.getText());
		
		return status;
	}

	public java.sql.Time getTiempo(String tiempo) {
		String[] horario = tiempo.split(":");
		return new java.sql.Time(Integer.parseInt(horario[0]), Integer.parseInt(horario[1]), 00);
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

	public void llenarCliente(List<Persona> clientes) {
		cliente = clientes;
		for (Persona persona : clientes) {
			StringBuilder names = new StringBuilder(persona.getApellidoPaternoPer() + " " + persona.getApellidoMaternoPer() + " "+ persona.getNombrePer());
			editCliente.addItem(names.toString());
		}
		editCliente.addItem("Otro");
	}

	public void llenarArquitecto(List<Persona> arquitectos) {
		arquitecto = arquitectos;
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
	
	public JButton getButtonBuscarColonia() {
		return buttonBuscar;
	}
	
	public JComboBox<String> getOrientacion() {
		return editOrientacion;
	}
	
	public JLabel getColonia() {
		return textColonia;
	}
	
	public JButton getButtonAgendaCita() {
		return buttonAgendarCita;
	}
	
	public JButton getButtonCancelar() {
		return buttonCancelar;
	}
}
