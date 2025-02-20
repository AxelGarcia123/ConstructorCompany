package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import modelo.Material;

public class RegistrarMaterial extends JPanel implements ActionListener{
	private JPanel panelTitulo;
	private JPanel panelCentral;
	private JTextField editNombreMaterial;
	private JTextField editContenido;
	private JComboBox<String> editMarcaMaterial;
	private JComboBox<String> editTipoMaterial;
	private JSpinner editCantidadMinima;
	private JSpinner editCantidadMaxima;
	private JComboBox<String> editUnidadMedida;
	private JButton buttonRegistrar;
	private JButton buttonCancelar;
	private JPanel panelSur;

	public RegistrarMaterial() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		panelTitulo = new JPanel();
		panelTitulo.setBackground(Color.WHITE);
		add(panelTitulo, BorderLayout.NORTH);

		JLabel lblRegistrarNuevoMaterial = new JLabel("Registrar nuevo material");
		lblRegistrarNuevoMaterial.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		panelTitulo.add(lblRegistrarNuevoMaterial);

		panelCentral = new JPanel();
		panelCentral.setBackground(Color.WHITE);
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(4, 4, 0, 100));

		JLabel lblNombreDelMaterial = new JLabel("Nombre del material");
		lblNombreDelMaterial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblNombreDelMaterial.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblNombreDelMaterial);

		editNombreMaterial = new JTextField();
		editNombreMaterial.setHorizontalAlignment(SwingConstants.CENTER);
		editNombreMaterial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editNombreMaterial.addActionListener(this);
		panelCentral.add(editNombreMaterial);
		editNombreMaterial.setColumns(10);

		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblMarca);

		editMarcaMaterial = new JComboBox<String>();
		editMarcaMaterial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editMarcaMaterial.addActionListener(this);
		editMarcaMaterial.setBackground(Color.WHITE);
		panelCentral.add(editMarcaMaterial);

		JLabel lblTipoDeMaterial = new JLabel("Tipo de material");
		lblTipoDeMaterial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblTipoDeMaterial.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblTipoDeMaterial);

		editTipoMaterial = new JComboBox<String>();
		editTipoMaterial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editTipoMaterial.addActionListener(this);
		editTipoMaterial.setBackground(Color.WHITE);
		panelCentral.add(editTipoMaterial);

		JLabel lblCantidadMnima = new JLabel("Cantidad mínima");
		lblCantidadMnima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblCantidadMnima.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblCantidadMnima);

		editCantidadMinima = new JSpinner();
		editCantidadMinima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		panelCentral.add(editCantidadMinima);

		JLabel lblCantidadMxima = new JLabel("Cantidad máxima");
		lblCantidadMxima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblCantidadMxima.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblCantidadMxima);

		editCantidadMaxima = new JSpinner();
		editCantidadMaxima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		panelCentral.add(editCantidadMaxima);

		JLabel lblUnidadDeMedida = new JLabel("Unidad de medida");
		lblUnidadDeMedida.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblUnidadDeMedida.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblUnidadDeMedida);

		editUnidadMedida = new JComboBox<String>();
		editUnidadMedida.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editUnidadMedida.addActionListener(this);
		editUnidadMedida.setBackground(Color.WHITE);
		panelCentral.add(editUnidadMedida);

		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblContenido.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblContenido);

		editContenido = new JTextField();
		editContenido.setHorizontalAlignment(SwingConstants.CENTER);
		editContenido.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editContenido.addActionListener(this);
		panelCentral.add(editContenido);
		editContenido.setColumns(10);

		panelSur = new JPanel();
		panelSur.setBackground(Color.WHITE);
		add(panelSur, BorderLayout.SOUTH);

		buttonRegistrar = new JButton("Registrar");
		buttonRegistrar.setForeground(Color.WHITE);
		buttonRegistrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonRegistrar.setBackground(new Color(45, 0, 255));
		buttonRegistrar.setBounds(10, 266, 269, 29);
		buttonRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(buttonRegistrar);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setForeground(Color.WHITE);
		buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonCancelar.setBackground(new Color(45, 0, 255));
		buttonCancelar.setBounds(10, 266, 269, 29);
		buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(buttonCancelar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == editNombreMaterial) {
			if(editNombreMaterial.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo no puede quedar vacio", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editMarcaMaterial.requestFocus();
		}

		if(e.getSource() == editMarcaMaterial) {
			if(editMarcaMaterial.getSelectedItem().toString().equals("Otro")) {
				String nuevaMarca = JOptionPane.showInputDialog(null, "Escriba la marca del material");
				editMarcaMaterial.addItem(nuevaMarca);
				editMarcaMaterial.setSelectedItem(nuevaMarca);
			}
			editTipoMaterial.requestFocus();
		}

		if(e.getSource() == editTipoMaterial) {
			if(editTipoMaterial.getSelectedItem().toString().equals("Otro")) {
				String nuevoTipo = JOptionPane.showInputDialog(null, "Escriba el tipo de material");
				editTipoMaterial.addItem(nuevoTipo);
				editTipoMaterial.setSelectedItem(nuevoTipo);
			}
			editCantidadMinima.requestFocus();
		}

		if(e.getSource() == editCantidadMinima) {
			editCantidadMaxima.requestFocus();
		}

		if(e.getSource() == editUnidadMedida) {
			if(editUnidadMedida.getSelectedItem().toString().equals("Otro")) {
				String nuevaMedida = JOptionPane.showInputDialog(null, "Escriba la unidad de medida del material");
				editUnidadMedida.addItem(nuevaMedida);
				editUnidadMedida.setSelectedItem(nuevaMedida);
			}
			editContenido.requestFocus();
		}

		if(e.getSource() == editContenido) {
			if(editContenido.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo no puede quedar vacio", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				buttonRegistrar.requestFocus();
		}
	}

	public Material nuevoMaterial() {
		Material material = new Material();
		material.setNombreMaterial(editNombreMaterial.getText());
		material.setMarcaMaterial(editMarcaMaterial.getSelectedItem().toString());
		material.setTipoMaterial(editTipoMaterial.getSelectedItem().toString());
		
		try { 
			editCantidadMinima.commitEdit(); 
		} catch (java.text.ParseException e) {

		}
		
		int value = (Integer) editCantidadMinima.getValue();
		material.setMinimoMaterial(value);
		
		try { 
		    editCantidadMaxima.commitEdit(); 
		} catch (java.text.ParseException e) {
			
		}
		
		value = (Integer) editCantidadMaxima.getValue();
		material.setMaximoMaterial(value);
		material.setUnidadMedidaMaterial(editUnidadMedida.getSelectedItem().toString());
		material.setContenidoMaterial(Integer.parseInt(editContenido.getText()));
		
		return material;
	}

	public void llenarMarcaMaterial(List<Material> marca) {
		for (Material material : marca) {
			editMarcaMaterial.addItem(material.getMarcaMaterial());
		}
		editMarcaMaterial.addItem("Otro");
	}

	public void llenarTipoMaterial(List<Material> tipo) {
		for (Material material : tipo) {
			editTipoMaterial.addItem(material.getTipoMaterial());
		}
		editTipoMaterial.addItem("Otro");
	}

	public void llenarUnidadMedida(List<Material> umedida) {
		for (Material material : umedida) {
			editUnidadMedida.addItem(material.getUnidadMedidaMaterial());
		}
		editUnidadMedida.addItem("Otro");
	}

	public JComboBox<String> tipoMaterial() {
		return editTipoMaterial;
	}

	public JComboBox<String> marca() {
		return editMarcaMaterial;
	}

	public JComboBox<String> unidadMedida() {
		return editUnidadMedida;
	}
	
	public JButton getButtonRegistrar() {
		return buttonRegistrar;
	}
	
	public JButton getButtonCancelar() {
		return buttonCancelar;
	}
}