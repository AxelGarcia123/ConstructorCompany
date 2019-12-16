package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import rojeru_san.componentes.RSDateChooser;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import baseDeDatos.TablaResurtir;
import modelo.Material;
import modelo.Resurtir;

import java.util.Date;
import java.util.List;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

public class ResurtirMaterial extends JPanel implements ActionListener{
	private JTextField editCantidad;
	private JTextField editPrecioUnidad;
	private JTable tablaResurtir;
	private JButton botonResurtir;
	private JButton botonRegistrar;
	private JButton botonCancelar;
	private RSDateChooser fechaResurtido;
	private RSDateChooser fechaCaducidad;
	private JComboBox<String> editMaterial;
	private JPanel panelDeDatos;
	private JPanel panelSur;
	private List<Material> materialesAux;
	
	public ResurtirMaterial() {
		setLayout(new BorderLayout(0, 0));

		panelSur = new JPanel();
		panelSur.setBackground(Color.WHITE);
		add(panelSur, BorderLayout.SOUTH);

		botonResurtir = new JButton("Resurtir");
		botonResurtir.setForeground(Color.WHITE);
		botonResurtir.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		botonResurtir.setBackground(new Color(45, 0, 255));
		botonResurtir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(botonResurtir);

		botonRegistrar = new JButton("Registrar Producto");
		botonRegistrar.setForeground(Color.WHITE);
		botonRegistrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		botonRegistrar.setBackground(new Color(45, 0, 255));
		botonRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(botonRegistrar);

		botonCancelar = new JButton("Cancelar");
		botonCancelar.setForeground(Color.WHITE);
		botonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		botonCancelar.setBackground(new Color(45, 0, 255));
		botonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSur.add(botonCancelar);

		panelDeDatos = new JPanel();
		panelDeDatos.setBackground(Color.WHITE);
		add(panelDeDatos, BorderLayout.WEST);
		panelDeDatos.setLayout(new GridLayout(10, 1, 10, 30));

		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblProducto.setHorizontalAlignment(SwingConstants.CENTER);
		panelDeDatos.add(lblProducto);
		
		editMaterial = new JComboBox<String>();
		editMaterial.setBackground(Color.WHITE);
		editMaterial.setToolTipText("");
		editMaterial.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelDeDatos.add(editMaterial);

		JLabel lblCantidadResurtida = new JLabel("Cantidad Resurtida:");
		lblCantidadResurtida.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblCantidadResurtida.setHorizontalAlignment(SwingConstants.CENTER);
		panelDeDatos.add(lblCantidadResurtida);

		editCantidad = new JTextField();
		editCantidad.addActionListener(this);
		editCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		editCantidad.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelDeDatos.add(editCantidad);
		editCantidad.setColumns(10);

		JLabel lblFechaDeResurtido = new JLabel("Fecha de resurtido:");
		lblFechaDeResurtido.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblFechaDeResurtido.setHorizontalAlignment(SwingConstants.CENTER);
		panelDeDatos.add(lblFechaDeResurtido);

		fechaResurtido = new RSDateChooser();
		fechaResurtido.setColorButtonHover(new Color(67, 105, 209));
		fechaResurtido.setColorForeground(new Color(0, 112, 192));
		fechaResurtido.setColorBackground(new Color(0, 112, 192));
		panelDeDatos.add(fechaResurtido);

		JLabel lblPrcioPorUnidad = new JLabel("Pr\u00E9cio por unidad:");
		lblPrcioPorUnidad.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblPrcioPorUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		panelDeDatos.add(lblPrcioPorUnidad);

		editPrecioUnidad = new JTextField();
		editPrecioUnidad.addActionListener(this);
		editPrecioUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		editPrecioUnidad.setFont(new Font("Roboto", Font.PLAIN, 15));
		panelDeDatos.add(editPrecioUnidad);
		editPrecioUnidad.setColumns(10);

		JLabel lblFechaDeCaducidad = new JLabel("Fecha de Caducidad");
		lblFechaDeCaducidad.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblFechaDeCaducidad.setHorizontalAlignment(SwingConstants.CENTER);
		panelDeDatos.add(lblFechaDeCaducidad);

		fechaCaducidad = new RSDateChooser();
		fechaCaducidad.setColorButtonHover(new Color(67, 105, 209));
		fechaCaducidad.setColorForeground(new Color(0, 112, 192));
		fechaCaducidad.setColorBackground(new Color(0, 112, 192));
		panelDeDatos.add(fechaCaducidad);

		tablaResurtir = new JTable();
		tablaResurtir.setFont(new Font("Roboto", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(tablaResurtir);
		add(scrollPane, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == editCantidad) {
			if(editCantidad.getText().isEmpty()) 
				JOptionPane.showMessageDialog(null, "El campo no puede quedar vacio.", null, JOptionPane.ERROR_MESSAGE);
			else
				fechaResurtido.requestFocus();
		}

		if(e.getSource() == fechaResurtido) {
			editPrecioUnidad.requestFocus();
		}

		if(e.getSource() == editPrecioUnidad) {
			if(editPrecioUnidad.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo no puede quedar vacio.", null, JOptionPane.ERROR_MESSAGE);
			else
				fechaCaducidad.requestFocus();
		}

		if(e.getSource() == fechaCaducidad) {
			botonResurtir.requestFocus();
		}
	}

	public Resurtir registrarResurtir() {
		Resurtir resurtir = new Resurtir();
		resurtir.setFechaResurtir(getDateFormat(fechaResurtido.getDatoFecha()));
		resurtir.setFechaCadResurtir(getDateFormat(fechaCaducidad.getDatoFecha()));
		resurtir.setNumResurtir(Integer.parseInt(editCantidad.getText()));
		resurtir.setPrecioPorUnidadResurtir(Integer.parseInt(editPrecioUnidad.getText()));
		resurtir.setBajaResurtir(Integer.parseInt(editCantidad.getText()));
		resurtir.setClaveMaterial(buscarClave(editMaterial.getSelectedItem().toString()));
		
		return resurtir;
	}
	
	public java.sql.Date getDateFormat(Date fechaNacimiento) {
		String formatoFecha = "yyyyMMdd";
		Date fecha = fechaNacimiento;

		SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
		String prueba1 = String.valueOf(formateador.format(fecha));

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date parsed = null;
		try {
			parsed = format.parse(prueba1);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		java.sql.Date sql = new java.sql.Date(parsed.getTime());

		return sql;
	}
	
	public void mostrarResurtidos(List<Resurtir> resurtidos, TablaResurtir tabla) {
		String[] titulos = {"Producto", "Fecha de resurtido", "Cantidad Resurtida", "Pr\u00e9cio por unidad",
				"Fecha de Caducidad", "Disponible"};

		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);

		for (Resurtir resurtir : resurtidos) {
			String[] tupla = {tabla.getNombreMaterial(resurtir.getClaveMaterial()), String.valueOf(resurtir.getFechaResurtir()), 
					String.valueOf(resurtir.getNumResurtir()), String.valueOf(resurtir.getPrecioPorUnidadResurtir()),
					String.valueOf(resurtir.getFechaCadResurtir()), String.valueOf(resurtir.getBajaResurtir())};
			modelo.addRow(tupla);
		}
		tablaResurtir.setModel(modelo);
	}

	public boolean camposVacios() {
		String fechaResurtir = String.valueOf(fechaResurtido.getDatoFecha());
		String fechaCad = String.valueOf(fechaCaducidad.getDatoFecha());
		String datoProducto = editMaterial.getSelectedItem().toString();
		return datoProducto.isEmpty() || editCantidad.getText().isEmpty() || editPrecioUnidad.getText().isEmpty()
				|| fechaResurtir.isEmpty() || fechaCad.isEmpty();
	}
	
	public void limpiarCampos() {
		editMaterial.setSelectedItem(null);
		editCantidad.setText(null);
		editPrecioUnidad.setText(null);
		fechaResurtido.setDatoFecha(null);
		fechaCaducidad.setDatoFecha(null);
	}
	
	public void buscarProducto(List<Material> materiales) {
		materialesAux = materiales;
		for (Material material : materiales) {
			editMaterial.addItem(material.getNombreMaterial());
		}
	}
	
	public int buscarClave(String materialSeleccionado) {
		int clave = 0;
		for (Material material : materialesAux) {
			if(materialSeleccionado.equals(material.getNombreMaterial())) {
				clave = material.getClaveMaterial();
				break;
			}
		}
		return clave;
	}

	public JButton getBotonResurtir() {
		return botonResurtir;
	}

	public JButton getBotonRegistrarMaterial() {
		return botonRegistrar;
	}

	public JButton getBotonCancelar() {
		return botonCancelar;
	}

	public JComboBox<String> getCampoMaterial() {
		return editMaterial;
	}

	public void enfocarCantidad() {
		editCantidad.requestFocus();
	}
	
	public int getCantidadResurtir() {
		return Integer.parseInt(editCantidad.getText());
	}
	
	public void enfocarCursor() {
		editMaterial.requestFocus();
	}
	
	public JTextField getCantidadProducto() {
		return editCantidad;
	}
	
	public int getCantidad() {
		return Integer.parseInt(editCantidad.getText());
	}
}