package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Actividad;
import modelo.Persona;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class NuevaActividadEmergente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField editActividad;
	private JComboBox<String> editUnidadMedida;
	private JTextArea editDescripcion;
	private JPanel panelCentral;
	private JPanel panelTitulo;
	private JButton buttonCancelar;
	private JButton buttonAgregar;

	public static void main(String[] args) {
		try {
			NuevaActividadEmergente dialog = new NuevaActividadEmergente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public NuevaActividadEmergente() {
		setBounds(100, 100, 490, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			panelTitulo = new JPanel();
			panelTitulo.setBackground(Color.WHITE);
			contentPanel.add(panelTitulo, BorderLayout.NORTH);
			{
				JLabel lblNuevaActividad = new JLabel("Nueva actividad");
				lblNuevaActividad.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				panelTitulo.add(lblNuevaActividad);
			}
		}
		{
			panelCentral = new JPanel();
			panelCentral.setBackground(Color.WHITE);
			contentPanel.add(panelCentral, BorderLayout.CENTER);
			panelCentral.setLayout(new GridLayout(3, 2, 0, 30));
			{
				JLabel lblNombreDeLa = new JLabel("Nombre de la actividad");
				lblNombreDeLa.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				lblNombreDeLa.setHorizontalAlignment(SwingConstants.CENTER);
				panelCentral.add(lblNombreDeLa);
			}
			{
				editActividad = new JTextField();
				editActividad.setHorizontalAlignment(SwingConstants.CENTER);
				editActividad.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
				editActividad.setBackground(Color.WHITE);
				panelCentral.add(editActividad);
				editActividad.setColumns(10);
			}
			{
				JLabel lblDescripcin = new JLabel("Descripción");
				lblDescripcin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				lblDescripcin.setHorizontalAlignment(SwingConstants.CENTER);
				panelCentral.add(lblDescripcin);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				panelCentral.add(scrollPane);
				{
					editDescripcion = new JTextArea();
					editDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
					editDescripcion.setBackground(Color.WHITE);
					editDescripcion.setLineWrap(true);
					scrollPane.setViewportView(editDescripcion);
				}
			}
			{
				JLabel lblActividad = new JLabel("Unidad de medida");
				lblActividad.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				lblActividad.setHorizontalAlignment(SwingConstants.CENTER);
				panelCentral.add(lblActividad);
			}
			{
				editUnidadMedida = new JComboBox<String>();
				editUnidadMedida.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
				editUnidadMedida.setBackground(Color.WHITE);
				panelCentral.add(editUnidadMedida);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				buttonAgregar = new JButton("Agregar");
				buttonAgregar.setActionCommand("Cancel");
				buttonAgregar.setActionCommand("OK");
				buttonAgregar.setForeground(Color.WHITE);
				buttonAgregar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
				buttonAgregar.setBackground(new Color(45, 0, 255));
				buttonAgregar.setBounds(10, 266, 269, 29);
				buttonAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				buttonAgregar.setActionCommand("OK");
				buttonPane.add(buttonAgregar);
				getRootPane().setDefaultButton(buttonAgregar);
			}
			{
				buttonCancelar = new JButton("Cancelar");
				buttonCancelar.setActionCommand("Cancel");
				buttonCancelar.setActionCommand("OK");
				buttonCancelar.setForeground(Color.WHITE);
				buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
				buttonCancelar.setBackground(new Color(45, 0, 255));
				buttonCancelar.setBounds(10, 266, 269, 29);
				buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				buttonPane.add(buttonCancelar);
			}
		}
	}
	
	public Actividad nuevaActividad() {
		Actividad activity = new Actividad();
		activity.setName(editActividad.getText());
		activity.setDescription(editDescripcion.getText());
		activity.setUnitOfMeasure(editUnidadMedida.getSelectedItem().toString());
		
		return activity;
	}
	
	public void llenarUnidadMedida(List<String> medidas) {
		for (String string : medidas) {
			editUnidadMedida.addItem(string);
		}
		editUnidadMedida.addItem("Otro");
	}
	
	public JComboBox<String> getUnidadMedida() {
		return editUnidadMedida;
	}
	
	public JButton getButtonAgregar() {
		return buttonAgregar;
	}
	
	public JButton getButtonCancelar() {
		return buttonCancelar;
	}
}
