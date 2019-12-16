package view;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import modelo.Material;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowMateriales extends JPanel {
	private JPanel panelTitulo;
	private JButton buttonRegresar;
	private JPanel panelSur;
	private JPanel panelCentral;
	private JPanel panelSubCentral;
	private JLabel textNombre;
	private JLabel textMarca;
	private JLabel textTipo;
	private JLabel textCantidadMinima;
	private JLabel textUnidadMedida;
	private JLabel textContenido;
	private List<Material> materiales;
	private JLabel textCantidadMaxima;

	public ShowMateriales() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
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
		
		panelSur = new JPanel();
		panelSur.setBackground(Color.WHITE);
		add(panelSur, BorderLayout.SOUTH);
		
		panelCentral = new JPanel();
		panelCentral.setBackground(Color.WHITE);
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new BorderLayout(0, 0));
		
		panelSubCentral = new JPanel();
		panelSubCentral.setBackground(Color.WHITE);
		panelCentral.add(panelSubCentral, BorderLayout.CENTER);
		panelSubCentral.setLayout(new GridLayout(7, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(lblNombre);
		
		textNombre = new JLabel("");
		textNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		textNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(textNombre);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(lblMarca);
		
		textMarca = new JLabel("");
		textMarca.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		textMarca.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(textMarca);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(lblTipo);
		
		textTipo = new JLabel("");
		textTipo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		textTipo.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(textTipo);
		
		JLabel lblCantidadMnima = new JLabel("Cantidad mínima");
		lblCantidadMnima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCantidadMnima.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(lblCantidadMnima);
		
		textCantidadMinima = new JLabel("");
		textCantidadMinima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		textCantidadMinima.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(textCantidadMinima);
		
		JLabel lblCantidadMxima = new JLabel("Cantidad máxima");
		lblCantidadMxima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCantidadMxima.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(lblCantidadMxima);
		
		textCantidadMaxima = new JLabel("");
		textCantidadMaxima.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		textCantidadMaxima.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(textCantidadMaxima);
		
		JLabel lblUnidadDeMedida = new JLabel("Unidad de medida");
		lblUnidadDeMedida.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblUnidadDeMedida.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(lblUnidadDeMedida);
		
		textUnidadMedida = new JLabel("");
		textUnidadMedida.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		textUnidadMedida.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(textUnidadMedida);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblContenido.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(lblContenido);
		
		textContenido = new JLabel("");
		textContenido.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		textContenido.setHorizontalAlignment(SwingConstants.CENTER);
		panelSubCentral.add(textContenido);
	}
	
	public void llenarMateriales(Material material) {
		textNombre.setText(material.getNombreMaterial());
		textMarca.setText(material.getMarcaMaterial());
		textTipo.setText(material.getTipoMaterial());
		textCantidadMinima.setText(String.valueOf(material.getMinimoMaterial()));
		textCantidadMaxima.setText(String.valueOf(material.getMaximoMaterial()));
		textUnidadMedida.setText(material.getUnidadMedidaMaterial());
		textContenido.setText(String.valueOf(material.getContenidoMaterial()));
	}
	
	public JButton getButtonRegresar() {
		return buttonRegresar;
	}
}
