package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import modelo.Autorizacion;
import modelo.Clausula;
import modelo.Permiso;
import modelo.PermisoContrato;

@SuppressWarnings("serial")
public class Clause extends JPanel {
	private JButton buttonRegresar;
	private JTable table;
	private JButton buttonDescripción;
	private JLabel textDescripción;
	private JLabel empleado;

	/**
	 * Create the panel.
	 */
	public Clause() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		buttonRegresar = new JButton("");
		buttonRegresar.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		buttonRegresar.setContentAreaFilled(false);
		buttonRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		
		buttonDescripción = new JButton("Ver Descripción");
		buttonDescripción.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		buttonDescripción.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonDescripción);
		
		table = new JTable();
		table.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		JScrollPane scrollPane = new JScrollPane(table);
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		empleado = new JLabel("Descripción:");
		empleado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		empleado.setVisible(false);
		panel_3.add(empleado);
		
		textDescripción = new JLabel("");
		textDescripción.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_3.add(textDescripción);
	}
	
	public void showClausulas(List<Clausula> clausulas) {
		String[] titulos = {"Clave", "Clausula"};
		int i = 0;
		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);

		for (Clausula clausula : clausulas) {
			String[] tupla = {String.valueOf(clausula.getClaveClausula()), clausula.getDescripcionClausula()};
			i++;
			modelo.addRow(tupla);
		}
		table.setModel(modelo);
	}
	
	public void verDescripcion() {
		int fila = table.getSelectedRow();
		
		if(fila != -1) {
			String descripcion = (String) table.getValueAt(fila, 1);
			empleado.setVisible(true);
			StringBuilder description = new StringBuilder(descripcion);
			description.insert(0, "<html><body>");
			description.insert(description.length() - 1, "</body></html>");
			
			textDescripción.setText(description.toString());
		}
		else
			JOptionPane.showMessageDialog(null, "¡No ha seleccionado ninguna fila!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
	}
	
	public JButton getDescripcion() {
		return buttonDescripción;
	}
	
	public int getClavePermiso() {
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