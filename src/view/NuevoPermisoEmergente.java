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

import modelo.Permiso;
import modelo.PermisoContrato;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import rojeru_san.componentes.RSDateChooser;

public class NuevoPermisoEmergente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton buttonAgregar;
	private JButton buttonCancelar;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblAgregarPermiso;
	private JLabel lblTipoDePermiso;
	private JLabel lblDescripcin;
	private JTextField editTipoPermiso;
	private JScrollPane scrollPane;
	private JTextArea editDescripcion;
	private JLabel lblCosto;
	private JTextField editCostoPermiso;
	private JLabel lblFechaDeInicio;
	private RSDateChooser fechaInicio;
	private JLabel lblFechaFin;
	private RSDateChooser fechaFin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevoPermisoEmergente dialog = new NuevoPermisoEmergente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevoPermisoEmergente() {
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setBounds(100, 100, 549, 454);
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
				lblAgregarPermiso = new JLabel("Agregar permiso");
				lblAgregarPermiso.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
				panel.add(lblAgregarPermiso);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			contentPanel.add(panel_1, BorderLayout.CENTER);
			panel_1.setLayout(new GridLayout(10, 2, 0, 0));
			{
				lblTipoDePermiso = new JLabel("Tipo de permiso");
				lblTipoDePermiso.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				lblTipoDePermiso.setHorizontalAlignment(SwingConstants.CENTER);
				panel_1.add(lblTipoDePermiso);
			}
			{
				editTipoPermiso = new JTextField();
				editTipoPermiso.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				panel_1.add(editTipoPermiso);
				editTipoPermiso.setColumns(10);
			}
			{
				lblDescripcin = new JLabel("Descripción");
				lblDescripcin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				lblDescripcin.setHorizontalAlignment(SwingConstants.CENTER);
				panel_1.add(lblDescripcin);
			}
			{
				scrollPane = new JScrollPane();
				panel_1.add(scrollPane);
				{
					editDescripcion = new JTextArea();
					editDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
					editDescripcion.setLineWrap(true);
					scrollPane.setViewportView(editDescripcion);
				}
			}
			{
				lblCosto = new JLabel("Costo");
				lblCosto.setHorizontalAlignment(SwingConstants.CENTER);
				lblCosto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				panel_1.add(lblCosto);
			}
			{
				editCostoPermiso = new JTextField();
				editCostoPermiso.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				editCostoPermiso.setColumns(10);
				panel_1.add(editCostoPermiso);
			}
			{
				lblFechaDeInicio = new JLabel("Fecha de inicio");
				lblFechaDeInicio.setHorizontalAlignment(SwingConstants.CENTER);
				lblFechaDeInicio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				panel_1.add(lblFechaDeInicio);
			}
			{
				fechaInicio = new RSDateChooser();
				panel_1.add(fechaInicio);
			}
			{
				lblFechaFin = new JLabel("Fecha fin");
				lblFechaFin.setHorizontalAlignment(SwingConstants.CENTER);
				lblFechaFin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
				panel_1.add(lblFechaFin);
			}
			{
				fechaFin = new RSDateChooser();
				panel_1.add(fechaFin);
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

	public Permiso nuevoPermiso() {
		Permiso permiso = new Permiso();
		permiso.setTipoPermiso(editTipoPermiso.getText());
		permiso.setDescripcionPermiso(editDescripcion.getText());
		
		return permiso;
	}
	
	public PermisoContrato nuevoPermisoContrato() {
		PermisoContrato permisoCont = new PermisoContrato();
		permisoCont.setCostoPermContrato(Integer.parseInt(editCostoPermiso.getText()));
		permisoCont.setFechaInicioPermContrato(getDateFormat(fechaInicio.getDatoFecha()));
		permisoCont.setFechaFinPermContrato(getDateFormat(fechaFin.getDatoFecha()));
		
		return permisoCont;
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
	
	public JButton getButtonAgregar() {
		return buttonAgregar;
	}
	
	public JButton getButtonCancelar() {
		return buttonCancelar;
	}
}
