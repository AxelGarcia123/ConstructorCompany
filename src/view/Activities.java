package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import modelo.Actividad;
import modelo.Contrato;
import modelo.Persona;
import modelo.TrabajadorActividad;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Activities extends JPanel {
	private JButton buttonRegresar;
	private JTable table;

	public Activities() {
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

		JLabel lblActividades = new JLabel("                                                                             Actividades                                                                                        ");
		lblActividades.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		panel.add(lblActividades);
		
		table = new JTable();
		table.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
	}

	public void showActivities(List<Actividad> activities, List<TrabajadorActividad> traacts) {
		String[] titulos = {"Nombre", "Cantidad", "Unidad de medida", "Descripción"};
		int i = 0;
		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);

		for (Actividad activity : activities) {
			String[] tupla = {activity.getName(), String.valueOf(traacts.get(i).getCantidadTrabajadorAct()), activity.getUnitOfMeasure(),
					 activity.getDescription()};
			i++;
			modelo.addRow(tupla);
		}
		table.setModel(modelo);
	}
	
	public JButton getBotonRegresar() {
		return buttonRegresar;
	}
}
