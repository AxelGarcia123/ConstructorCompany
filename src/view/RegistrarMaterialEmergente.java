package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import modelo.Material;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Toolkit;
import javax.swing.JComboBox;

public class RegistrarMaterialEmergente extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField editNombreMaterial;
	private JTextField editContenido;
	private JButton buttonRegistrar;
	private JButton buttonCancelar;
	private JSpinner editCantidadMinima;
	private JSpinner editCantidadMaxima;
	private JPanel panelCentral;
	private JPanel panelSur;
	private JPanel panelTitulo;
	private JComboBox<String> editTipoMaterial;
	private JComboBox<String> editUnidadMedida;
	private JComboBox<String> editMarcaMaterial;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarMaterialEmergente frame = new RegistrarMaterialEmergente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RegistrarMaterialEmergente() {
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\bryangarcia\\Desktop\\POO\\Eclipse\\Tienda\\iconos\\attachment_38986924.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		
		panelTitulo = new JPanel();
		panelTitulo.setBackground(Color.WHITE);
		contentPane.add(panelTitulo, BorderLayout.NORTH);
		
		JLabel lblNuevoProducto = new JLabel("Nuevo Producto");
		lblNuevoProducto.setBackground(Color.BLACK);
		lblNuevoProducto.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNuevoProducto.setForeground(Color.BLACK);
		panelTitulo.add(lblNuevoProducto);
		
		panelCentral = new JPanel();
		panelCentral.setBackground(Color.WHITE);
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(7, 2, 0, 30));
		
		JLabel lblNombreDelProducto = new JLabel("Nombre del material");
		lblNombreDelProducto.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelCentral.add(lblNombreDelProducto);
		
		editNombreMaterial = new JTextField();
		editNombreMaterial.addActionListener(this);
		editNombreMaterial.setHorizontalAlignment(SwingConstants.CENTER);
		editNombreMaterial.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelCentral.add(editNombreMaterial);
		editNombreMaterial.setColumns(10);
		
		JLabel lblTipoDeProducto = new JLabel("Marca del material");
		lblTipoDeProducto.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelCentral.add(lblTipoDeProducto);
		
		editMarcaMaterial = new JComboBox<String>();
		editMarcaMaterial.addActionListener(this);
		editMarcaMaterial.setBackground(Color.WHITE);
		panelCentral.add(editMarcaMaterial);
		
		JLabel lblContenido = new JLabel("Tipo de material");
		lblContenido.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelCentral.add(lblContenido);
		
		editTipoMaterial = new JComboBox<String>();
		editTipoMaterial.addActionListener(this);
		editTipoMaterial.setBackground(Color.WHITE);
		panelCentral.add(editTipoMaterial);
		
		JLabel lblMarca = new JLabel("Unidad de medida");
		lblMarca.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelCentral.add(lblMarca);
		
		editUnidadMedida = new JComboBox<String>();
		editUnidadMedida.addActionListener(this);
		editUnidadMedida.setBackground(Color.WHITE);
		panelCentral.add(editUnidadMedida);
		
		JLabel lblPrecioDeVenta = new JLabel("Contenido");
		lblPrecioDeVenta.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelCentral.add(lblPrecioDeVenta);
		
		editContenido = new JTextField();
		editContenido.addActionListener(this);
		editContenido.setHorizontalAlignment(SwingConstants.CENTER);
		editContenido.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelCentral.add(editContenido);
		editContenido.setColumns(10);
		
		JLabel lblCantidadMnima = new JLabel("Cantidad M\u00EDnima");
		lblCantidadMnima.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelCentral.add(lblCantidadMnima);
		
		editCantidadMinima = new JSpinner();
		editCantidadMinima.setModel(new SpinnerNumberModel(1, 1, 50, 1));
		editCantidadMinima.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelCentral.add(editCantidadMinima);
		
		JLabel lblCantidadMxima = new JLabel("Cantidad M\u00E1xima");
		lblCantidadMxima.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelCentral.add(lblCantidadMxima);
		
		editCantidadMaxima = new JSpinner();
		editCantidadMaxima.setModel(new SpinnerNumberModel(1, 1, 50, 1));
		editCantidadMaxima.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelCentral.add(editCantidadMaxima);
		
		panelSur = new JPanel();
		panelSur.setBackground(Color.WHITE);
		contentPane.add(panelSur, BorderLayout.SOUTH);
		
		buttonRegistrar = new JButton("Registrar");
		buttonRegistrar.setForeground(Color.WHITE);
		buttonRegistrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonRegistrar.setBackground(new Color(45, 0, 255));
		buttonRegistrar.setBounds(10, 266, 269, 29);
		buttonRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(buttonRegistrar);
		
		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.addActionListener(this);
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
		
		if(e.getSource() == buttonCancelar)
			this.dispose();
	}
	
	public Material registrarNuevoMaterial() {
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

	public JComboBox<String> getTipoMaterial() {
		return editTipoMaterial;
	}

	public JComboBox<String> getMarca() {
		return editMarcaMaterial;
	}

	public JComboBox<String> getUnidadMedida() {
		return editUnidadMedida;
	}
	
	public void limpiarVentana() {
		this.dispose();
	}
	
	public JButton getBotonCancelar() {
		return buttonCancelar;
	}
	
	public JButton getButtonRegistrar() {
		return buttonRegistrar;
	}
}
