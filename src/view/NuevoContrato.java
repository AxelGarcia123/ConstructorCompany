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
import rojeru_san.componentes.RSDateChooser;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTable;

public class NuevoContrato extends JPanel {
	private JTextField editHonorarios;
	private JTextField editCostoObra;
	private JTextField editMetrosCuadrados;
	private RSDateChooser fechaInicio;
	private RSDateChooser fechaFin;
	private JComboBox<String> editTipoContratio;
	private JComboBox<String> editCliente;
	private JComboBox<String> editArquitecto;
	private JTable table;
	private JTable table_1;

	public NuevoContrato() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.NORTH);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		button.setContentAreaFilled(false);
		panel_1.add(button);
		
		JLabel label = new JLabel("                                                                             Nuevo Contrato                                                                                        ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(5, 4, 0, 0));
		
		JLabel label_1 = new JLabel("Fecha de inicio:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_3.add(label_1);
		
		fechaInicio = new RSDateChooser();
		fechaInicio.setFuente(new Font("Segoe UI Symbol", Font.BOLD, 17));
		panel_3.add(fechaInicio);
		
		JLabel label_2 = new JLabel("Honorarios del Arquitecto:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_3.add(label_2);
		
		editHonorarios = new JTextField();
		editHonorarios.setHorizontalAlignment(SwingConstants.CENTER);
		editHonorarios.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		editHonorarios.setColumns(10);
		panel_3.add(editHonorarios);
		
		JLabel label_3 = new JLabel("Fecha de finalización:");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_3.add(label_3);
		
		fechaFin = new RSDateChooser();
		fechaFin.setFuente(new Font("Segoe UI Symbol", Font.BOLD, 17));
		panel_3.add(fechaFin);
		
		JLabel label_4 = new JLabel("Costo de la obra:");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_3.add(label_4);
		
		editCostoObra = new JTextField();
		editCostoObra.setHorizontalAlignment(SwingConstants.CENTER);
		editCostoObra.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		editCostoObra.setColumns(10);
		panel_3.add(editCostoObra);
		
		JLabel label_5 = new JLabel("Tipo de contrato:");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_3.add(label_5);
		
		editTipoContratio = new JComboBox<String>();
		editTipoContratio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_3.add(editTipoContratio);
		
		JLabel label_6 = new JLabel("Cliente:");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_3.add(label_6);
		
		editCliente = new JComboBox<String>();
		editCliente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_3.add(editCliente);
		
		JLabel label_7 = new JLabel("Metros cuadrados:");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_3.add(label_7);
		
		editMetrosCuadrados = new JTextField();
		editMetrosCuadrados.setHorizontalAlignment(SwingConstants.CENTER);
		editMetrosCuadrados.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		editMetrosCuadrados.setColumns(10);
		panel_3.add(editMetrosCuadrados);
		
		JLabel label_8 = new JLabel("Arquitecto:");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_3.add(label_8);
		
		editArquitecto = new JComboBox<String>();
		editArquitecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_3.add(editArquitecto);
		
		JSeparator separator = new JSeparator();
		panel_3.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		panel_3.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		panel_3.add(separator_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_2.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAgregarClausulas = new JLabel("Agregar clausulas");
		lblAgregarClausulas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarClausulas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4.add(lblAgregarClausulas, BorderLayout.NORTH);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_4.add(scrollPane_1, BorderLayout.EAST);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panel_4.add(scrollPane_2, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane_2.setViewportView(table);
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8, BorderLayout.SOUTH);
		
		JButton btnAgregarClausula = new JButton("Agregar clausula");
		panel_8.add(btnAgregarClausula);
		
		JButton btnAgregarNuevaClausula = new JButton("Agregar nueva clausula");
		panel_8.add(btnAgregarNuevaClausula);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_2.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_2.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_2.add(panel_7);
		
	}
}