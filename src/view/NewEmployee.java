package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import rojeru_san.componentes.RSDateChooser;
import javax.swing.JSeparator;

public class NewEmployee extends JPanel {
	private JButton buttonSiguiente;
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

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
		lblNuevoEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNuevoEmpleado);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.SOUTH);
		
		buttonSiguiente = new JButton("Siguiente");
		panel_1.add(buttonSiguiente);
		
		buttonCancelar = new JButton("Cancelar");
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
		panel_5.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_5.add(textField);
		
		JLabel label_2 = new JLabel("Apellido Materno:");
		panel_5.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_5.add(textField_1);
		
		JLabel label_3 = new JLabel("Nombre:");
		panel_5.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_5.add(textField_2);
		
		JLabel label_4 = new JLabel("Calle:");
		panel_5.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_5.add(textField_3);
		
		JLabel label_5 = new JLabel("Número de calle");
		panel_5.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_5.add(textField_4);
		
		JLabel label_6 = new JLabel("Orientación:");
		panel_5.add(label_6);
		
		JComboBox comboBox = new JComboBox();
		panel_5.add(comboBox);
		
		JLabel label_7 = new JLabel("Entre calles:");
		panel_5.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_5.add(textField_5);
		
		JLabel label_8 = new JLabel("Género:");
		panel_5.add(label_8);
		
		JComboBox comboBox_1 = new JComboBox();
		panel_5.add(comboBox_1);
		
		JLabel label_9 = new JLabel("Estado civil:");
		panel_5.add(label_9);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_5.add(textField_6);
		
		JLabel label_10 = new JLabel("Email:");
		panel_5.add(label_10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_5.add(textField_7);
		
		JLabel label_11 = new JLabel("Teléfono:");
		panel_5.add(label_11);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel_5.add(textField_8);
		
		JLabel label_12 = new JLabel("Fecha de nacimiento:");
		panel_5.add(label_12);
		
		RSDateChooser dateChooser = new RSDateChooser();
		panel_5.add(dateChooser);
		
		JLabel label_13 = new JLabel("Código postal");
		panel_5.add(label_13);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel_5.add(textField_9);
		
		JLabel label_14 = new JLabel("Colonia");
		panel_5.add(label_14);
		
		JLabel label_15 = new JLabel("prueba");
		panel_5.add(label_15);
		
		JLabel label_16 = new JLabel("Ciudad:");
		panel_5.add(label_16);
		
		JLabel label_17 = new JLabel("");
		panel_5.add(label_17);
		
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
		panel_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblPrueba = new JLabel("Prueba");
		panel_6.add(lblPrueba);
		
	}
}
