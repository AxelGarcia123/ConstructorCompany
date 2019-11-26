package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import modelo.Actividad;
import modelo.Autorizacion;
import modelo.Avance;
import modelo.Permiso;
import modelo.PermisoContrato;
import modelo.Persona;
import modelo.TrabajadorActividad;

import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.util.List;

public class Authorization extends JPanel {
	private JButton buttonRegresar;
	private JTable table;
	private JButton buttonStatus;
	private JLabel textPermiso;
	private JLabel textStatus;
	private JLabel textFecha;
	private JLabel avance;
	private JLabel actividad;
	private JLabel empleado;

	/**
	 * Create the panel.
	 */
	public Authorization() {
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
		
		buttonStatus = new JButton("Ver Status");
		buttonStatus.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		buttonStatus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonStatus);
		
		table = new JTable();
		table.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		JScrollPane scrollPane = new JScrollPane(table);
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		empleado = new JLabel("Permiso:");
		empleado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		empleado.setVisible(false);
		panel_3.add(empleado);
		
		textPermiso = new JLabel("");
		textPermiso.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_3.add(textPermiso);
		
		actividad = new JLabel("Status:");
		actividad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		actividad.setVisible(false);
		panel_3.add(actividad);
		
		textStatus = new JLabel("");
		textStatus.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_3.add(textStatus);
		
		avance = new JLabel("Fecha:");
		avance.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		avance.setVisible(false);
		panel_3.add(avance);
		
		textFecha = new JLabel("");
		textFecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panel_3.add(textFecha);
	}
	
	public void showAutorizaciones(List<PermisoContrato> permisoCont, List<Permiso> permisos) {
		String[] titulos = {"Clave", "Tipo de permiso", "Fecha", "Costo del permiso", "Fecha de inicio", "Fecha de finalización", 
				"Descripción"};
		int i = 0;
		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);

		for (PermisoContrato permisosCont : permisoCont) {
			String[] tupla = {String.valueOf(permisosCont.getClavePermContrato()), permisos.get(i).getTipoPermiso(), 
					String.valueOf(permisosCont.getFechaPermContrato()), String.valueOf(permisosCont.getCostoPermContrato()), 
					String.valueOf(permisosCont.getFechaInicioPermContrato()), String.valueOf(permisosCont.getFechaFinPermContrato()), 
					permisos.get(i).getDescripcionPermiso()};
			i++;
			modelo.addRow(tupla);
		}
		table.setModel(modelo);
	}
	
	public void verAvance(Autorizacion autorizacion) {
		int fila = table.getSelectedRow();
		
		if(fila != -1) {
			String permiso = (String) table.getValueAt(fila, 1);
			String status = autorizacion.getStatusAutoriza();
			empleado.setVisible(true);
			actividad.setVisible(true);
			avance.setVisible(true);
			textFecha.setVisible(true);
			textPermiso.setText(permiso);
			textStatus.setText(status);
			textFecha.setText(String.valueOf(autorizacion.getFechaAutoriza()));
		}
		else
			JOptionPane.showMessageDialog(null, "¡No ha seleccionado ninguna fila!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
	}
	
	public JButton getVerStatus() {
		return buttonStatus;
	}
	
	public int getClavePermisoCont() {
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