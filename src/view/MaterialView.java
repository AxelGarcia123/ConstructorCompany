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

import modelo.Cliente;
import modelo.Contrato;
import modelo.Material;
import modelo.Persona;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MaterialView extends JPanel {

	private JPanel panel;
	private List<JButton> contractFiles;
	private List<JLabel> contractNames;
	private List<JPanel> panels;
	private int counter = 0;
	private int iterator = 0;
	private int i = 0;
	private JButton buttonVerMaterial;
	private JButton buttonRegresar;
	private JButton buttonRegistrarMaterial;
	private JPanel panelTitulo;

	public MaterialView() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		contractFiles = new ArrayList<JButton>();
		contractNames = new ArrayList<JLabel>();
		panels = new ArrayList<JPanel>();

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);

		panelTitulo = new JPanel();
		panelTitulo.setBackground(Color.WHITE);
		add(panelTitulo, BorderLayout.NORTH);

		buttonRegresar = new JButton("");
		buttonRegresar.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		buttonRegresar.setContentAreaFilled(false);
		buttonRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelTitulo.add(buttonRegresar);

		JLabel lblContratos = new JLabel("                                                                               Materiales                                                                                       ");
		lblContratos.setHorizontalAlignment(SwingConstants.CENTER);
		lblContratos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelTitulo.add(lblContratos);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.SOUTH);

		buttonVerMaterial = new JButton("Ver material");
		buttonVerMaterial.setForeground(Color.WHITE);
		buttonVerMaterial.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonVerMaterial.setBackground(new Color(45, 0, 255));
		buttonVerMaterial.setBounds(10, 266, 269, 29);
		buttonVerMaterial.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(buttonVerMaterial);	

		buttonRegistrarMaterial = new JButton("Registrar material");
		buttonRegistrarMaterial.setForeground(Color.WHITE);
		buttonRegistrarMaterial.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonRegistrarMaterial.setBackground(new Color(45, 0, 255));
		buttonRegistrarMaterial.setBounds(10, 266, 269, 29);
		buttonRegistrarMaterial.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(buttonRegistrarMaterial);
	}

	public void showMaterials(List<Material> materiales) {
		for (Material material : materiales) {
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(Color.WHITE);
			panel.add(panel_3);
			panel_3.setLayout(new GridLayout(0, 1, 0, 0));

			JButton buttonContracts = new JButton();
			buttonContracts.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_build_black_18dp.png"));
			buttonContracts.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			buttonContracts.setContentAreaFilled(false);
			buttonContracts.setBorderPainted(false);
			panel_3.add(buttonContracts);

			JLabel contractsDescription = new JLabel("  " + material.getNombreMaterial() + "  ");
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

	public JButton getVerMaterial() {
		return buttonVerMaterial;
	}

	public List<JLabel> getNombres() {
		return contractNames;
	}

	public JButton getBotonRegresar() {
		return buttonRegresar;
	}

	public JButton getButtonRegistrarMaterial() {
		return buttonRegistrarMaterial;
	}
}