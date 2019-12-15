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

import modelo.Clausula;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class NuevaClausulaEmergente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton buttonCancelar;
	private JButton buttonAgregar;
	private JPanel panel;
	private JLabel lblNuevaClausula;
	private JPanel panel_1;
	private JLabel lblEscribeLaNueva;
	private JScrollPane scrollPane;
	private JTextArea editNuevaClausula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevaClausulaEmergente dialog = new NuevaClausulaEmergente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevaClausulaEmergente() {
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setBounds(100, 100, 557, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				lblNuevaClausula = new JLabel("Nueva Clausula");
				lblNuevaClausula.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
				panel.add(lblNuevaClausula);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			contentPanel.add(panel_1, BorderLayout.CENTER);
			panel_1.setLayout(new GridLayout(2, 0, 0, 0));
			{
				lblEscribeLaNueva = new JLabel("Escribe la nueva clausula");
				lblEscribeLaNueva.setHorizontalAlignment(SwingConstants.CENTER);
				lblEscribeLaNueva.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				panel_1.add(lblEscribeLaNueva);
			}
			{
				scrollPane = new JScrollPane();
				panel_1.add(scrollPane);
				{
					editNuevaClausula = new JTextArea();
					editNuevaClausula.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
					editNuevaClausula.setLineWrap(true);
					scrollPane.setViewportView(editNuevaClausula);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				buttonAgregar = new JButton("Agregar");
				buttonAgregar.setActionCommand("OK");
				buttonAgregar.setForeground(Color.WHITE);
				buttonAgregar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
				buttonAgregar.setBackground(new Color(45, 0, 255));
				buttonAgregar.setBounds(10, 266, 269, 29);
				buttonAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				buttonPane.add(buttonAgregar);
				getRootPane().setDefaultButton(buttonAgregar);
			}
			{
				buttonCancelar = new JButton("Cancelar");
				buttonCancelar.setActionCommand("Cancel");
				buttonCancelar.setForeground(Color.WHITE);
				buttonCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
				buttonCancelar.setBackground(new Color(45, 0, 255));
				buttonCancelar.setBounds(10, 266, 269, 29);
				buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				buttonPane.add(buttonCancelar);
			}
		}
	}

	public Clausula getNuevaClausula() {
		Clausula clausula = new Clausula();
		clausula.setDescripcionClausula(editNuevaClausula.getText());
		
		return clausula;
	}
	
	public JButton getButtonAgregar() {
		return buttonAgregar;
	}
	
	public JButton getButtonCancelar() {
		return buttonCancelar;
	}
}
