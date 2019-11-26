package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class NewClause extends JPanel {
	private JTable table;

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
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_2.add(panel_5, BorderLayout.SOUTH);
		
		JButton btnSiguiente = new JButton("Siguiente");
		panel_5.add(btnSiguiente);
		
		JButton btnCancelar = new JButton("Cancelar");
		panel_5.add(btnCancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel.add(panel_4, BorderLayout.SOUTH);
		
		JButton btnAgregarClausula = new JButton("Agregar clausula");
		panel_4.add(btnAgregarClausula);
		
		JButton btnAgregarNuevaClausula = new JButton("Agregar nueva clausula");
		panel_4.add(btnAgregarNuevaClausula);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel.add(scrollPane_1, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNuevoProyecto = new JLabel("Nuevo proyecto");
		lblNuevoProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoProyecto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNuevoProyecto);
		
	}
}