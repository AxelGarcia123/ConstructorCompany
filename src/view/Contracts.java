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

import modelo.Contrato;
import modelo.Persona;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Contracts extends JPanel {
	
	private JPanel panel;
	private List<JButton> contractFiles;
	private List<JLabel> contractNames;
	private List<JPanel> panels;
	private int counter = 0;
	private int iterator = 0;
	private int i = 0;
	private JButton buttonVerContrato;

	public Contracts() {
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
		
		JLabel lblContratos = new JLabel("Contratos");
		lblContratos.setHorizontalAlignment(SwingConstants.CENTER);
		lblContratos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblContratos);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.SOUTH);
		
		buttonVerContrato = new JButton("Ver contrato");
		panel_2.add(buttonVerContrato);	
	}
	
	public void showProjectContracts(List<Contrato> contratos, List<Persona> personas) {
		for (Contrato contrato : contratos) {
			System.out.println("Entra al for");
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(Color.WHITE);
			panel.add(panel_3);
			panel_3.setLayout(new GridLayout(0, 1, 0, 0));
			
			JButton buttonContracts = new JButton();
			buttonContracts.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_insert_drive_file_black_18dp.png"));
			buttonContracts.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			buttonContracts.setContentAreaFilled(false);
			buttonContracts.setBorderPainted(false);
			panel_3.add(buttonContracts);
			
			StringBuilder nombre = new StringBuilder(personas.get(i).getNombrePer() + " "+ personas.get(i).getApellidoPaternoPer() + " "+ personas.get(i).getApellidoMaternoPer());
			
			JLabel contractsDescription = new JLabel("  " + nombre + "  ");
			contractsDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contractsDescription.setHorizontalAlignment(SwingConstants.CENTER);
			panel_3.add(contractsDescription);
			
			JLabel fecha = new JLabel("  " + contrato.getFechaInicioContrato() + "  ");
			fecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
			fecha.setHorizontalAlignment(SwingConstants.CENTER);
			panel_3.add(fecha);
			
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
	
	public JButton getContrato() {
		return buttonVerContrato;
	}
	
	public List<JLabel> getNombres() {
		return contractNames;
	}
}