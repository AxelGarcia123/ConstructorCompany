package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;

import modelo.Actividad;
import modelo.Contrato;
import modelo.Persona;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ShowActividad extends JPanel {
	
	private JPanel panel;
	private List<JButton> contractFiles;
	private List<JLabel> contractNames;
	private List<JPanel> panels;
	private int counter = 0;
	private int iterator = 0;
	private JButton buttonVerActividad;
	private JButton buttonRegresar;
	private JButton buttonNuevaActividad;

	public ShowActividad() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		contractFiles = new ArrayList<JButton>();
		contractNames = new ArrayList<JLabel>();
		panels = new ArrayList<JPanel>();
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.NORTH);
		
		buttonRegresar = new JButton("");
		buttonRegresar.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		buttonRegresar.setContentAreaFilled(false);
		buttonRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.add(buttonRegresar);
		
		JLabel lblContratos = new JLabel("                                                                               Categoría                                                                                        ");
		lblContratos.setHorizontalAlignment(SwingConstants.CENTER);
		lblContratos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblContratos);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.SOUTH);
		
		buttonVerActividad = new JButton("Ver actividad");
		buttonVerActividad.setForeground(Color.WHITE);
		buttonVerActividad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonVerActividad.setBackground(new Color(45, 0, 255));
		buttonVerActividad.setBounds(10, 266, 269, 29);
		buttonVerActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(buttonVerActividad);	
		
		buttonNuevaActividad = new JButton("Nueva actividad");
		buttonNuevaActividad.setForeground(Color.WHITE);
		buttonNuevaActividad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonNuevaActividad.setBackground(new Color(45, 0, 255));
		buttonNuevaActividad.setBounds(10, 266, 269, 29);
		buttonNuevaActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(buttonNuevaActividad);
	}
	
	public void showActividades(List<Actividad> actividades) {
		for (Actividad actividad : actividades) {
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(Color.WHITE);
			panel.add(panel_3);
			panel_3.setLayout(new GridLayout(0, 1, 0, 0));
			
			JButton buttonContracts = new JButton();
			buttonContracts.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_work_black_18dp.png"));
			buttonContracts.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			buttonContracts.setContentAreaFilled(false);
			buttonContracts.setBorderPainted(false);
			panel_3.add(buttonContracts);
			
			
			JLabel contractsDescription = new JLabel("  " + actividad.getName() + "  ");
			contractsDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contractsDescription.setHorizontalAlignment(SwingConstants.CENTER);
			panel_3.add(contractsDescription);
			
			panels.add(panel_3);
			contractFiles.add(buttonContracts);
			contractNames.add(contractsDescription);
			panel.add(panel_3);
			panel.updateUI();
			
			for (JButton buttons : contractFiles) {
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
		return contractFiles;
	}
	
	public int getCounter() {
		iterator = counter;
		counter = 0;
		return iterator;
	}
	
	public JButton getVerActividad() {
		return buttonVerActividad;
	}
	
	public List<JLabel> getNombres() {
		return contractNames;
	}
	
	public JButton getButtonRegresar() {
		return buttonRegresar;
	}
	
	public JButton getButtonNuevaActividad() {
		return buttonNuevaActividad;
	}
}