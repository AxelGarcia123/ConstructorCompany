package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Codigo;
import modelo.Colonia;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class SearchZipCode extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton buttonSeleccionar;
	private JButton buttonCancelar;
	private JPanel panelCalles;
	private JComboBox<String> codigoPostal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SearchZipCode dialog = new SearchZipCode();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SearchZipCode() {
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			contentPanel.add(panel, BorderLayout.WEST);
			panel.setLayout(new GridLayout(2, 1, 0, 50));
			{
				JLabel lblCdigoPostal = new JLabel("Código Postal");
				lblCdigoPostal.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
				lblCdigoPostal.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblCdigoPostal);
			}
			{
				codigoPostal = new JComboBox<String>();
				codigoPostal.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
				codigoPostal.setBackground(Color.WHITE);
				panel.add(codigoPostal);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			{
				panelCalles = new JPanel();
				panelCalles.setBackground(Color.WHITE);
				scrollPane.setViewportView(panelCalles);
				panelCalles.setLayout(new GridLayout(700, 1, 0, 0));
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				buttonSeleccionar = new JButton("Seleccionar");
				buttonSeleccionar.setActionCommand("OK");
				buttonSeleccionar.setForeground(Color.WHITE);
				buttonSeleccionar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
				buttonSeleccionar.setBackground(new Color(45, 0, 255));
				buttonSeleccionar.setBounds(10, 266, 269, 29);
				buttonSeleccionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				buttonPane.add(buttonSeleccionar);
				getRootPane().setDefaultButton(buttonSeleccionar);
			}
			{
				buttonCancelar = new JButton("Cancelar");
				buttonCancelar.setActionCommand("Cancel");
				buttonCancelar.setForeground(Color.WHITE);
				buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
				buttonCancelar.setBackground(new Color(45, 0, 255));
				buttonCancelar.setBounds(10, 266, 269, 29);
				buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				buttonPane.add(buttonCancelar);
			}
		}
	}
	
	public void cargarCodigosPostales(List<Codigo> codigosPostales) {
		for (Codigo codigo : codigosPostales) {
			codigoPostal.addItem(String.valueOf(codigo.getCodigoPostal()));
		}
	}
	
	public void mostrarColonias(List<Colonia> colonias) {
		for (Colonia colonia : colonias) {
			JLabel colony = new JLabel(colonia.getNombreColonia());
			colony.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
			colony.setHorizontalAlignment(SwingConstants.CENTER);
			colony.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			panelCalles.add(colony);
			panelCalles.updateUI();
		}
	}
	
	public JComboBox<String> getCodigosPostales() {
		return codigoPostal;
	}
	
//	public void numeroFilas(List<Integer> filas) {
//		panelCalles.setLayout(new GridLayout(filas.get(0), 1, 0, 0));
//	}
	
	public JPanel getPanelCalles() {
		return panelCalles;
	}
}
