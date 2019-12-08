package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import modelo.Contrato;
import modelo.ContratoTrabajador;

public class EmployeeCategory extends JPanel {
	private JPanel panel;
	private List<JPanel> panels;
	private List<JButton> projectFolders;
	private List<JLabel> projectsNames;
	private int counter = 0;
	private int iterator = 0;
	private JButton buttonVerEmpleado;
	private JButton buttonRegresar;
	private JButton buttonNuevoEmpleado;
	
	public EmployeeCategory() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		projectFolders = new ArrayList<JButton>();
		projectsNames = new ArrayList<JLabel>();
		panels = new ArrayList<JPanel>();
		
		panel = new JPanel();
		FlowLayout fl_panel = (FlowLayout) panel.getLayout();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.NORTH);
		
		buttonRegresar = new JButton("");
		buttonRegresar.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		buttonRegresar.setContentAreaFilled(false);
		panel_1.add(buttonRegresar);
		
		JLabel lblCategoras = new JLabel("                                                                             Categorías                                                                                        ");
		lblCategoras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCategoras.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblCategoras);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.SOUTH);
		
		buttonVerEmpleado = new JButton("Ver categoría");
		buttonVerEmpleado.setActionCommand("Cancel");
		buttonVerEmpleado.setForeground(Color.WHITE);
		buttonVerEmpleado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonVerEmpleado.setBackground(new Color(45, 0, 255));
		buttonVerEmpleado.setBounds(10, 266, 269, 29);
		buttonVerEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(buttonVerEmpleado);
		
		buttonNuevoEmpleado = new JButton("Nuevo empleado");
		buttonNuevoEmpleado.setActionCommand("Cancel");
		buttonNuevoEmpleado.setForeground(Color.WHITE);
		buttonNuevoEmpleado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonNuevoEmpleado.setBackground(new Color(45, 0, 255));
		buttonNuevoEmpleado.setBounds(10, 266, 269, 29);
		buttonNuevoEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(buttonNuevoEmpleado);
	}
	
	public void showTypesOfEmployees(List<ContratoTrabajador> empleados) {
		for (ContratoTrabajador empleado : empleados) {
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(Color.WHITE);
			panel.add(panel_3);
			panel_3.setLayout(new GridLayout(0, 1, 0, 0));
			
			JButton buttonFolders = new JButton();
			buttonFolders.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_folder_black_18dp.png"));
			buttonFolders.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			buttonFolders.setContentAreaFilled(false);
			buttonFolders.setBorderPainted(false);
			panel_3.add(buttonFolders);
			
			JLabel foldersDescription = new JLabel("  " + empleado.getPuestoTrabajador() + "  ");
			foldersDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
			foldersDescription.setHorizontalAlignment(SwingConstants.CENTER);
			panel_3.add(foldersDescription);
			
			panels.add(panel_3);
			projectFolders.add(buttonFolders);
			projectsNames.add(foldersDescription);
			panel.add(panel_3);
			panel.updateUI();
			
			for (JButton buttons : projectFolders) {
				buttons.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						counter++;
					}
				});
			}
		}
	}
	
	public List<JButton> getButtons() {
		return projectFolders;
	}
	
	public int getCounter() {
		iterator = counter;
		counter = 0;
		return iterator;
	}
	
	public JButton getVerCategoria() {
		return buttonVerEmpleado;
	}
	
	public List<JLabel> getTipos() {
		return projectsNames;
	}
	
	public JButton getNuevoEmpleado() {
		return buttonNuevoEmpleado;
	}
}