package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

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

	public RegistrarMaterial() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		panelTitulo = new JPanel();
		panelTitulo.setBackground(Color.WHITE);
		add(panelTitulo, BorderLayout.NORTH);
		
		JLabel lblRegistrarNuevoMaterial = new JLabel("Registrar nuevo material");
		lblRegistrarNuevoMaterial.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		panelTitulo.add(lblRegistrarNuevoMaterial);
		
		panelCentral = new JPanel();
		panelCentral.setBackground(Color.WHITE);
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(4, 4, 0, 0));
		
		JLabel lblNombreDelMaterial = new JLabel("Nombre del material");
		lblNombreDelMaterial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNombreDelMaterial.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblNombreDelMaterial);
		
		editNombreMaterial = new JTextField();
		editNombreMaterial.setHorizontalAlignment(SwingConstants.CENTER);
		editNombreMaterial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		editNombreMaterial.addActionListener(this);
		panelCentral.add(editNombreMaterial);
		editNombreMaterial.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblMarca);
		
		editMarcaMaterial = new JComboBox<String>();
		editMarcaMaterial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		editMarcaMaterial.addActionListener(this);
		editMarcaMaterial.setBackground(Color.WHITE);
		panelCentral.add(editMarcaMaterial);
		
		JLabel lblTipoDeMaterial = new JLabel("Tipo de material");
		lblTipoDeMaterial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTipoDeMaterial.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblTipoDeMaterial);
		
		editTipoMaterial = new JComboBox<String>();
		editTipoMaterial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		editTipoMaterial.addActionListener(this);
		editTipoMaterial.setBackground(Color.WHITE);
		panelCentral.add(editTipoMaterial);
		
		JLabel lblCantidadMnima = new JLabel("Cantidad mínima");
		lblCantidadMnima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblCantidadMnima.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblCantidadMnima);
		
		editCantidadMinima = new JSpinner();
		editCantidadMinima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panelCentral.add(editCantidadMinima);
		
		JLabel lblCantidadMxima = new JLabel("Cantidad máxima");
		lblCantidadMxima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblCantidadMxima.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblCantidadMxima);
		
		editCantidadMaxima = new JSpinner();
		editCantidadMaxima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panelCentral.add(editCantidadMaxima);
		
		JLabel lblUnidadDeMedida = new JLabel("Unidad de medida");
		lblUnidadDeMedida.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblUnidadDeMedida.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblUnidadDeMedida);
		
		editUnidadMedida = new JComboBox<String>();
		editUnidadMedida.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		editUnidadMedida.addActionListener(this);
		editUnidadMedida.setBackground(Color.WHITE);
		panelCentral.add(editUnidadMedida);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblContenido.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblContenido);
		
		editContenido = new JTextField();
		editContenido.setHorizontalAlignment(SwingConstants.CENTER);
		editContenido.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		editContenido.addActionListener(this);
		panelCentral.add(editContenido);
		editContenido.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.SOUTH);
		
		JButton btnRegistrar = new JButton("Registrar");
		panel.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		panel.add(btnCancelar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
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
}