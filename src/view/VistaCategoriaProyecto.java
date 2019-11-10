package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import modelo.Contrato;

public class VistaCategoriaProyecto extends JPanel {
	private JTable datosProyectos;

	public VistaCategoriaProyecto() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(225, 245, 254));
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblCategoraDeProyectos = new JLabel("Categoría de Proyectos");
		lblCategoraDeProyectos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoraDeProyectos.setForeground(Color.BLACK);
		lblCategoraDeProyectos.setFont(new Font("Roboto", Font.PLAIN, 20));
		panel_2.add(lblCategoraDeProyectos);

		datosProyectos = new JTable();
		datosProyectos.setFont(new Font("Roboto", Font.PLAIN, 15));
		JScrollPane panelTabla = new JScrollPane(datosProyectos);
		panel_1.add(panelTabla, BorderLayout.CENTER);
	}
	
	public void mostrarProductos(List<Contrato> proyectos) {
		String[] titulos = {"C\u00f3digo de Barras", "Nombre", "Tipo", "Contenido",
				"Unidad de Medida", "Presentaci\u00f3n", "Marca", "Precio de venta"};

		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);

		for (Contrato proyecto : proyectos) {
			String[] tupla = {proyecto.getTipoContrato()};
			modelo.addRow(tupla);
		}
		datosProyectos.setModel(modelo);
	}
}