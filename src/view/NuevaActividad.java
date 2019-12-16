package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import modelo.Actividad;

import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevaActividad extends JPanel {
	private JButton buttonRegresar;
	private JPanel panelTitulo;
	private JPanel panelCentral;
	private JPanel panelSur;
	private JButton buttonAgregarActividad;
	private JButton buttonCancelar;
	private JTextField editNombreActividad;
	private JComboBox<String> editUnidadMedida;
	private JScrollPane scrollPane;
	private JTextArea editDescripcion;

	public NuevaActividad() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		panelTitulo = new JPanel();
		panelTitulo.setBackground(Color.WHITE);
		add(panelTitulo, BorderLayout.NORTH);
		
		buttonRegresar = new JButton("");
		buttonRegresar.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		buttonRegresar.setContentAreaFilled(false);
		panelTitulo.add(buttonRegresar);
		
		JLabel lblNuevaActividad = new JLabel("                                                                          Nueva Actividad                                                                                        ");
		lblNuevaActividad.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevaActividad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelTitulo.add(lblNuevaActividad);
		
		panelCentral = new JPanel();
		panelCentral.setBackground(Color.WHITE);
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(3, 2, 0, 100));
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la actividad");
		lblNombreDeLa.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblNombreDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblNombreDeLa);
		
		editNombreActividad = new JTextField();
		editNombreActividad.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editNombreActividad.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(editNombreActividad);
		editNombreActividad.setColumns(10);
		
		JLabel lblDescripcin = new JLabel("Descripción");
		lblDescripcin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblDescripcin.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblDescripcin);
		
		scrollPane = new JScrollPane();
		panelCentral.add(scrollPane);
		
		editDescripcion = new JTextArea();
		editDescripcion.setLineWrap(true);
		editDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		scrollPane.setViewportView(editDescripcion);
		
		JLabel lblUnidadDeMedida = new JLabel("Unidad de medida");
		lblUnidadDeMedida.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblUnidadDeMedida.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblUnidadDeMedida);
		
		editUnidadMedida = new JComboBox<String>();
		editUnidadMedida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(editUnidadMedida.getSelectedItem().toString().equals("Otro")) {
					String medida = JOptionPane.showInputDialog(null, "Escriba la nueva unidad de medida");
					editUnidadMedida.addItem(medida);
					editUnidadMedida.setSelectedItem(medida);
					buttonAgregarActividad.requestFocus();
				}
			}
		});
		editUnidadMedida.setBackground(Color.WHITE);
		editUnidadMedida.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		panelCentral.add(editUnidadMedida);
		
		panelSur = new JPanel();
		panelSur.setBackground(Color.WHITE);
		add(panelSur, BorderLayout.SOUTH);
		
		buttonAgregarActividad = new JButton("Agregar actividad");
		buttonAgregarActividad.setForeground(Color.WHITE);
		buttonAgregarActividad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonAgregarActividad.setBackground(new Color(45, 0, 255));
		buttonAgregarActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(buttonAgregarActividad);
		
		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setForeground(Color.WHITE);
		buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonCancelar.setBackground(new Color(45, 0, 255));
		buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(buttonCancelar);

	}
	
	public Actividad nuevaActividad() {
		Actividad act = new Actividad();
		act.setName(editNombreActividad.getText());
		act.setDescription(editDescripcion.getText());
		act.setUnitOfMeasure(editUnidadMedida.getSelectedItem().toString());
		
		return act;
	}
	
	public void llenarUnidadMedida(List<String> actividades) {
		for (String actividad : actividades) {
			editUnidadMedida.addItem(actividad);
		}
		editUnidadMedida.addItem("Otro");
	}

	public JComboBox<String> getUnidadMedida() {
		return editUnidadMedida;
	}
	
	public JButton getButtonGuardarActividad() {
		return buttonAgregarActividad;
	}
	
	public JButton getButtonCancelar() {
		return buttonCancelar;
	}
}
