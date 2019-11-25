package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import modelo.Contrato;

import java.awt.Font;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class Projects extends JPanel {
	private JPanel panel;
	private List<JPanel> panels;
	private List<JButton> projectFolders;
	private List<JLabel> projectsNames;
	private int counter = 0;
	private int iterator = 0;
	private JButton verProyecto;
	private JButton buttonRegresar;
	private JButton buttonNuevoProyecto;
	
	public Projects() {
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
		
		verProyecto = new JButton("Ver proyecto");
		panel_2.add(verProyecto);
		
		buttonNuevoProyecto = new JButton("Nuevo proyecto");
		panel_2.add(buttonNuevoProyecto);
	}
	
	public void showProjectFolders(List<Contrato> contratos) {
		for (Contrato contrato : contratos) {
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
			
			JLabel foldersDescription = new JLabel("  " + contrato.getTipoContrato() + "  ");
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
	
	public JButton getProyecto() {
		return verProyecto;
	}
	
	public List<JLabel> getTipos() {
		return projectsNames;
	}
}
