package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class AddNewClause extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton buttonCrear;
	private JButton buttonCrearAgregar;
	private JButton buttonCancelar;
	private JLabel lblDescripcinDeLa;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddNewClause dialog = new AddNewClause();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public AddNewClause() {
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER); 
		contentPanel.setLayout(new GridLayout(0, 2, 0, 0));
		{
			StringBuilder description = new StringBuilder("Descripción de la nueva clausula:");
			description.insert(0, "<html><body>");
			description.insert(description.length() - 1, "</body></html>");
			lblDescripcinDeLa = new JLabel(description.toString());
			lblDescripcinDeLa.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
			contentPanel.add(lblDescripcinDeLa);
		}
		{
			scrollPane = new JScrollPane();
			contentPanel.add(scrollPane);
			{
				textArea = new JTextArea();
				textArea.setLineWrap(true);
				textArea.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
				scrollPane.setViewportView(textArea);
			}
		}{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH); {
				buttonCrear = new JButton("OK");
				buttonCrear.setActionCommand("OK");
				buttonCrear.setForeground(Color.WHITE);
				buttonCrear.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
				buttonCrear.setBackground(new Color(45, 0, 255));
				buttonCrear.setBounds(10, 266, 269, 29);
				buttonCrear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				buttonPane.add(buttonCrear);
				getRootPane().setDefaultButton(buttonCrear);
			}
			{
				buttonCrearAgregar = new JButton("Crear y agregar");
				buttonCrearAgregar.setActionCommand("OK");
				buttonCrearAgregar.setForeground(Color.WHITE);
				buttonCrearAgregar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
				buttonCrearAgregar.setBackground(new Color(45, 0, 255));
				buttonCrearAgregar.setBounds(10, 266, 269, 29);
				buttonCrearAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				buttonPane.add(buttonCrearAgregar);
			}

			{
				buttonCancelar = new JButton("Cancel");
				buttonCancelar.setActionCommand("OK");
				buttonCancelar.setForeground(Color.WHITE);
				buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
				buttonCancelar.setBackground(new Color(45, 0, 255));
				buttonCancelar.setBounds(10, 266, 269, 29);
				buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				buttonCancelar.setActionCommand("Cancel");
				buttonPane.add(buttonCancelar);
			}
		}
	}
}
