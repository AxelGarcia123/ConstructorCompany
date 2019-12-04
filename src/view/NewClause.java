package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import modelo.Clausula;

import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class NewClause extends JPanel {
	private JTable table;
	private JButton buttonSiguiente;
	private JButton buttonCancelar;
	private JButton buttonAgregarClausula;
	private JButton buttonNuevaClausula;
	private JTable table_1;
	private List<Integer> claveClausula;

	public NewClause() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_2.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblClausulasAgregadas = new JLabel("Clausulas agregadas");
		lblClausulasAgregadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblClausulasAgregadas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(lblClausulasAgregadas);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_2.add(panel_5, BorderLayout.SOUTH);

		buttonSiguiente = new JButton("Siguiente");
		buttonSiguiente.setForeground(Color.WHITE);
		buttonSiguiente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonSiguiente.setBackground(new Color(45, 0, 255));
		buttonSiguiente.setBounds(10, 266, 269, 29);
		buttonSiguiente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		panel_5.add(buttonSiguiente);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setForeground(Color.WHITE);
		buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonCancelar.setBackground(new Color(45, 0, 255));
		buttonCancelar.setBounds(10, 266, 269, 29);
		buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_5.add(buttonCancelar);

		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);

		table_1 = new JTable();
		table_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		scrollPane.setViewportView(table_1);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel.add(panel_4, BorderLayout.SOUTH);

		buttonAgregarClausula = new JButton("Agregar clausula");
		buttonAgregarClausula.setForeground(Color.WHITE);
		buttonAgregarClausula.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonAgregarClausula.setBackground(new Color(45, 0, 255));
		buttonAgregarClausula.setBounds(10, 266, 269, 29);
		buttonAgregarClausula.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonAgregarClausula);

		buttonNuevaClausula = new JButton("Agregar nueva clausula");
		buttonNuevaClausula.setForeground(Color.WHITE);
		buttonNuevaClausula.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		buttonNuevaClausula.setBackground(new Color(45, 0, 255));
		buttonNuevaClausula.setBounds(10, 266, 269, 29);
		buttonNuevaClausula.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonNuevaClausula);

		JScrollPane scrollPane_1 = new JScrollPane();
		panel.add(scrollPane_1, BorderLayout.CENTER);

		table = new JTable();
		table.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		scrollPane_1.setViewportView(table);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.NORTH);

		JLabel lblNuevoProyecto = new JLabel("Nuevo proyecto");
		lblNuevoProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoProyecto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNuevoProyecto);
		
		claveClausula = new ArrayList<Integer>();
	}

	public void showClausulas(List<Clausula> clausulas) {
		String[] titulos = {"Clave", "Clausula"};
		int i = 0;
		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);

		for (Clausula clausula : clausulas) {
			String[] tupla = {String.valueOf(clausula.getClaveClausula()), clausula.getDescripcionClausula()};
			i++;
			modelo.addRow(tupla);
		}
		table.setModel(modelo);
	}

	public void showNuevasClausulas(int clausula) {
		String[] titulos = {"Clave"};
		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);
		
		claveClausula.add(clausula);
		
		for (Integer clave : claveClausula) {
			String[] tupla = {String.valueOf(clave)};
			modelo.addRow(tupla);
		}
		table_1.setModel(modelo);
	}

	public String getClaveClausula() {
		int fila = table.getSelectedRow();

		if(fila != -1) {
			String clave = (String) table.getValueAt(fila, 0);
			return clave;
		}
		else
			return null;
	}

	public JButton getBotonAgregarClausula() {
		return buttonAgregarClausula;
	}

	public JButton getBotonAgregarNuevaClausula() {
		return buttonNuevaClausula;
	}

	public JButton getBotonSiguiente() {
		return buttonSiguiente;
	}

	public JButton getBotonCancelar() {
		return buttonCancelar;
	}
}