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
import modelo.Persona;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Clientes extends JPanel {

	private JPanel panel;
	private List<JButton> contractFiles;
	private List<JLabel> contractNames;
	private List<JPanel> panels;
	private List<JLabel> date;
	private int counter = 0;
	private int iterator = 0;
	private int i = 0;
	private JButton buttonVerCliente;
	private JButton buttonRegresar;
	private JButton buttonNuevoCliente;
	private JPanel panelTitulo;

	public Clientes() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		contractFiles = new ArrayList<JButton>();
		contractNames = new ArrayList<JLabel>();
		panels = new ArrayList<JPanel>();
		date = new ArrayList<JLabel>();

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

		JLabel lblContratos = new JLabel("                                                                               Clientes                                                                                       ");
		lblContratos.setHorizontalAlignment(SwingConstants.CENTER);
		lblContratos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelTitulo.add(lblContratos);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.SOUTH);

		buttonVerCliente = new JButton("Ver cliente");
		buttonVerCliente.setForeground(Color.WHITE);
		buttonVerCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonVerCliente.setBackground(new Color(45, 0, 255));
		buttonVerCliente.setBounds(10, 266, 269, 29);
		buttonVerCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(buttonVerCliente);	

		buttonNuevoCliente = new JButton("Nuevo cliente");
		buttonNuevoCliente.setForeground(Color.WHITE);
		buttonNuevoCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonNuevoCliente.setBackground(new Color(45, 0, 255));
		buttonNuevoCliente.setBounds(10, 266, 269, 29);
		buttonNuevoCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(buttonNuevoCliente);
	}

	public void showClientes(List<Cliente> clientes, List<Persona> personas) {
		i = 0;
		for (Cliente cliente : clientes) {
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(Color.WHITE);
			panel.add(panel_3);
			panel_3.setLayout(new GridLayout(0, 1, 0, 0));

			JButton buttonContracts = new JButton();
			buttonContracts.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\round_person_black_18dp.png"));
			buttonContracts.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			buttonContracts.setContentAreaFilled(false);
			buttonContracts.setBorderPainted(false);
			panel_3.add(buttonContracts);

			StringBuilder nombre = new StringBuilder(personas.get(i).getNombrePer() + " "+ personas.get(i).getApellidoPaternoPer() + " "+ personas.get(i).getApellidoMaternoPer());

			JLabel contractsDescription = new JLabel("  " + nombre + "  ");
			contractsDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contractsDescription.setHorizontalAlignment(SwingConstants.CENTER);
			panel_3.add(contractsDescription);

			JLabel fecha = new JLabel("  " + cliente.getFechaCliente() + "  ");
			fecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
			fecha.setHorizontalAlignment(SwingConstants.CENTER);
			panel_3.add(fecha);

			panels.add(panel_3);
			contractFiles.add(buttonContracts);
			contractNames.add(contractsDescription);
			date.add(fecha);
			panel.add(panel_3);
			panel.updateUI();

			i++;

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

	public JButton getVerCliente() {
		return buttonVerCliente;
	}

	public List<JLabel> getNombres() {
		return contractNames;
	}

	public List<JLabel> getFechas() {
		return date;
	}

	public JButton getBotonRegresar() {
		return buttonRegresar;
	}

	public JButton getButtonNuevoCliente() {
		return buttonNuevoCliente;
	}
}