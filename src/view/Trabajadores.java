package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

import modelo.Actividad;
import modelo.Avance;
import modelo.Persona;
import modelo.TrabajadorActividad;

import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Trabajadores extends JPanel {
	private JButton buttonRegresar;
	private JTable table;
	private JButton buttonAvance;
	private JLabel textEmpleado;
	private JLabel textActividad;
	private JLabel textAvance;
	private JLabel textFecha;
	private JLabel fecha;
	private JLabel avance;
	private JLabel actividad;
	private JLabel empleado;

	/**
	 * Create the panel.
	 */
	public Trabajadores() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		buttonRegresar = new JButton("");
		buttonRegresar.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		buttonRegresar.setContentAreaFilled(false);
		panel.add(buttonRegresar);
		
		JLabel lblTrabajadores = new JLabel("                                                                             Trabajadores                                                                                        ");
		lblTrabajadores.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrabajadores.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		panel.add(lblTrabajadores);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_2.add(panel_4, BorderLayout.SOUTH);
		
		buttonAvance = new JButton("Ver avance");
		buttonAvance.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		panel_4.add(buttonAvance);
		
		table = new JTable();
		table.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		JScrollPane scrollPane = new JScrollPane(table);
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		empleado = new JLabel("Empleado:");
		empleado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		empleado.setVisible(false);
		panel_3.add(empleado);
		
		textEmpleado = new JLabel("");
		textEmpleado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_3.add(textEmpleado);
		
		actividad = new JLabel("Actividad:");
		actividad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		actividad.setVisible(false);
		panel_3.add(actividad);
		
		textActividad = new JLabel("");
		textActividad.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_3.add(textActividad);
		
		avance = new JLabel("Avance:");
		avance.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		avance.setVisible(false);
		panel_3.add(avance);
		
		textAvance = new JLabel("");
		textAvance.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_3.add(textAvance);
		
		fecha = new JLabel("Fecha:");
		fecha.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		fecha.setVisible(false);
		panel_3.add(fecha);
		
		textFecha = new JLabel("");
		textFecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_3.add(textFecha);
	}
	
	public void showTrabajadores(List<Actividad> activities, List<Persona> people, List<TrabajadorActividad> traacts) {
		String[] titulos = {"Clave del trabajador", "Nombre", "Actividad", "Cantidad"};
		int i = 0;
		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);

		for (Persona person : people) {
			StringBuilder name = new StringBuilder(person.getNombrePer() + " " + person.getApellidoPaternoPer() + " "+ person.getApellidoMaternoPer());
			String[] tupla = {String.valueOf(traacts.get(i).getClaveTrabajadorAct()), String.valueOf(name), 
					activities.get(i).getName(), String.valueOf(traacts.get(i).getCantidadTrabajadorAct())};
			i++;
			modelo.addRow(tupla);
		}
		table.setModel(modelo);
	}
	
	public void verAvance(Avance avances) {
		int fila = table.getSelectedRow();
		
		if(fila != -1) {
			String nombre = (String) table.getValueAt(fila, 1);
			String actividadDato = (String) table.getValueAt(fila, 2);
			empleado.setVisible(true);
			actividad.setVisible(true);
			avance.setVisible(true);
			fecha.setVisible(true);
			textEmpleado.setText(nombre);
			textActividad.setText(actividadDato);
			textAvance.setText(String.valueOf(avances.getCantidadAvance()));
			textFecha.setText(String.valueOf(avances.getFechaAvance()));
		}
		else
			JOptionPane.showMessageDialog(null, "¡No ha seleccionado ninguna fila!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
	}
	
	public JButton getVerAvance() {
		return buttonAvance;
	}
	
	public int getClaveTrabajador() {
		int fila = table.getSelectedRow();
		if(fila != -1) 
			return Integer.valueOf((String) table.getValueAt(fila, 0));
		else
			return 0;
	}
	
	public JButton getBotonRegresar() {
		return buttonRegresar;
	}
}
