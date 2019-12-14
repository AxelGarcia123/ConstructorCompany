package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import modelo.Actividad;
import modelo.ActividadRealizar;
import modelo.Clausula;
import modelo.Contrato;
import modelo.ContratoClausula;
import modelo.Permiso;
import modelo.PermisoContrato;
import modelo.Persona;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rojeru_san.componentes.RSDateChooser;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class NuevoContrato extends JPanel implements ActionListener{
	private JTextField editHonorarios;
	private JTextField editCostoObra;
	private JTextField editMetrosCuadrados;
	private RSDateChooser fechaInicio;
	private RSDateChooser fechaFin;
	private JComboBox<String> editTipoContrato;
	private JComboBox<String> editCliente;
	private JComboBox<String> editArquitecto;
	private JList<String> listPermisosExistentes;
	private JList<String> listPermisosAgregados;
	private JTextField editCostoPermiso;
	private RSDateChooser fechaInicioPermiso;
	private RSDateChooser fechaFinPermiso;
	private JList<String> listClausulasExistentes;
	private JList<String> listClausulasAgregadas;
	private JButton buttonAgregarPermiso;
	private JButton buttonAgregarNuevoPermiso;
	private JButton buttonAgregarClausula;
	private JButton buttonAgregarNuevaClausula;
	private JButton buttonAgregarActividad;
	private JButton buttonAgregarNuevaActividad;
	private JPanel panelBotonesActividad;
	private JPanel panelSeparador;
	private JPanel panelSurAct;
	private JPanel panelTituloAct;
	private JPanel panelActividades;
	private JPanel panelClausulas;
	private JPanel panelCentralCla;
	private JPanel panelTituloCla;
	private JPanel panelSurCla;
	private JPanel panelBotonesCla;
	private JPanel panelSeparadorCla;
	private JLabel labelAgregarPermiso;
	private JPanel panelPermisos;
	private JPanel panelTituloPer;
	private JPanel panelCentralPer;
	private JPanel panelDatosPer;
	private JPanel panelSurPer;
	private JPanel panelBotonesPer;
	private JPanel panelSeparadorPer;
	private JPanel panelContrato;
	private JPanel panelWestAct;
	private JPanel panelEAST;
	private JPanel panelCentral;
	private JLabel lblCantidadARealizar;
	private JTextField editCantidadRealizar;
	private JPanel panelTituloWEST;
	private JLabel lblActividadesExistentes;
	private JScrollPane scrollPane_4;
	private JList<String> listActividadesExistentes;
	private JPanel panelTituloEAST;
	private JLabel lblActividadesAgregadas;
	private JScrollPane scrollPane_6;
	private JList<String> listActividadesAgregadas;
	private JButton buttonGuardar;
	private JButton buttonCancelar;
	private List<Actividad> actividadesAuxiliar;
	private List<Permiso> permisosAuxiliar;
	private List<Clausula> clausulasAuxiliar;
	private List<PermisoContrato> permisosAgregados;
	private List<String> permisosSeleccionados;
	private List<ContratoClausula> clausulasAgregadas;
	private List<String> clausulasSeleccionadas;
	private List<String> nuevasClausulas;
	private List<Actividad> actividadesAgregadas;
	private List<ActividadRealizar> actividadesRealizar;
	private List<Persona> cliente;
	private List<Persona> arquitecto;

	public NuevoContrato() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.SOUTH);

		buttonGuardar = new JButton("Guardar");
		panel.add(buttonGuardar);

		buttonCancelar = new JButton("Cancelar");
		panel.add(buttonCancelar);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.NORTH);

		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_keyboard_backspace_black_24dp.png"));
		button.setContentAreaFilled(false);
		panel_1.add(button);

		JLabel label = new JLabel("                                                                             Nuevo Contrato                                                                                        ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(label);

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(new GridLayout(5, 1, 0, 0));

		panelContrato = new JPanel();
		panelContrato.setBackground(Color.WHITE);
		panel_2.add(panelContrato);
		panelContrato.setLayout(new GridLayout(5, 4, 0, 50));

		JLabel label_1 = new JLabel("Fecha de inicio:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panelContrato.add(label_1);

		fechaInicio = new RSDateChooser();
		fechaInicio.setFuente(new Font("Segoe UI Symbol", Font.BOLD, 17));
		panelContrato.add(fechaInicio);

		JLabel label_2 = new JLabel("Honorarios del Arquitecto:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panelContrato.add(label_2);

		editHonorarios = new JTextField();
		editHonorarios.addActionListener(this);
		editHonorarios.setHorizontalAlignment(SwingConstants.CENTER);
		editHonorarios.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		editHonorarios.setColumns(10);
		panelContrato.add(editHonorarios);

		JLabel label_3 = new JLabel("Fecha de finalización:");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panelContrato.add(label_3);

		fechaFin = new RSDateChooser();
		fechaFin.setFuente(new Font("Segoe UI Symbol", Font.BOLD, 17));
		panelContrato.add(fechaFin);

		JLabel label_4 = new JLabel("Costo de la obra:");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panelContrato.add(label_4);

		editCostoObra = new JTextField();
		editCostoObra.addActionListener(this);
		editCostoObra.setHorizontalAlignment(SwingConstants.CENTER);
		editCostoObra.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		editCostoObra.setColumns(10);
		panelContrato.add(editCostoObra);

		JLabel label_5 = new JLabel("Tipo de contrato:");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panelContrato.add(label_5);

		editTipoContrato = new JComboBox<String>();
		editTipoContrato.addActionListener(this);
		editTipoContrato.setBackground(Color.WHITE);
		editTipoContrato.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panelContrato.add(editTipoContrato);

		JLabel label_6 = new JLabel("Cliente:");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panelContrato.add(label_6);

		editCliente = new JComboBox<String>();
		editCliente.addActionListener(this);
		editCliente.setBackground(Color.WHITE);
		editCliente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panelContrato.add(editCliente);

		JLabel label_7 = new JLabel("Metros cuadrados:");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panelContrato.add(label_7);

		editMetrosCuadrados = new JTextField();
		editMetrosCuadrados.addActionListener(this);
		editMetrosCuadrados.setHorizontalAlignment(SwingConstants.CENTER);
		editMetrosCuadrados.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		editMetrosCuadrados.setColumns(10);
		panelContrato.add(editMetrosCuadrados);

		JLabel label_8 = new JLabel("Arquitecto:");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panelContrato.add(label_8);

		editArquitecto = new JComboBox<String>();
		editArquitecto.addActionListener(this);
		editArquitecto.setBackground(Color.WHITE);
		editArquitecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		panelContrato.add(editArquitecto);

		JSeparator separator = new JSeparator();
		panelContrato.add(separator);

		JSeparator separator_1 = new JSeparator();
		panelContrato.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		panelContrato.add(separator_2);

		JSeparator separator_5 = new JSeparator();
		panelContrato.add(separator_5);

		panelPermisos = new JPanel();
		panelPermisos.setBackground(Color.WHITE);
		panel_2.add(panelPermisos);
		panelPermisos.setLayout(new BorderLayout(0, 0));

		panelTituloPer = new JPanel();
		panelTituloPer.setBackground(Color.WHITE);
		panelPermisos.add(panelTituloPer, BorderLayout.NORTH);

		labelAgregarPermiso = new JLabel("Agregar permisos");
		labelAgregarPermiso.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		panelTituloPer.add(labelAgregarPermiso);

		panelCentralPer = new JPanel();
		panelCentralPer.setBackground(Color.WHITE);
		panelPermisos.add(panelCentralPer, BorderLayout.CENTER);
		panelCentralPer.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_1 = new JScrollPane();
		panelCentralPer.add(scrollPane_1, BorderLayout.WEST);

		listPermisosExistentes = new JList<String>();
		listPermisosExistentes.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		scrollPane_1.setViewportView(listPermisosExistentes);

		panelDatosPer = new JPanel();
		panelDatosPer.setBackground(Color.WHITE);
		panelCentralPer.add(panelDatosPer, BorderLayout.CENTER);
		panelDatosPer.setLayout(new GridLayout(4, 2, 0, 30));

		JLabel lblCostoDelPermiso = new JLabel("Costo del permiso:");
		lblCostoDelPermiso.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		lblCostoDelPermiso.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatosPer.add(lblCostoDelPermiso);

		editCostoPermiso = new JTextField();
		editCostoPermiso.addActionListener(this);
		editCostoPermiso.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		editCostoPermiso.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatosPer.add(editCostoPermiso);
		editCostoPermiso.setColumns(10);

		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio:");
		lblFechaDeInicio.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		lblFechaDeInicio.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatosPer.add(lblFechaDeInicio);

		fechaInicioPermiso = new RSDateChooser();
		fechaInicioPermiso.setFuente(new Font("Segoe UI Semibold", Font.BOLD, 14));
		panelDatosPer.add(fechaInicioPermiso);

		JLabel lblFechaDeFinalizacin = new JLabel("Fecha de finalización:");
		lblFechaDeFinalizacin.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		lblFechaDeFinalizacin.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatosPer.add(lblFechaDeFinalizacin);

		fechaFinPermiso = new RSDateChooser();
		fechaFinPermiso.setFuente(new Font("Segoe UI Semibold", Font.BOLD, 14));
		panelDatosPer.add(fechaFinPermiso);

		JScrollPane scrollPane_2 = new JScrollPane();
		panelCentralPer.add(scrollPane_2, BorderLayout.EAST);

		listPermisosAgregados = new JList<String>();
		listPermisosAgregados.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		scrollPane_2.setViewportView(listPermisosAgregados);

		panelSurPer = new JPanel();
		panelSurPer.setBackground(Color.WHITE);
		panelPermisos.add(panelSurPer, BorderLayout.SOUTH);
		panelSurPer.setLayout(new GridLayout(2, 1, 0, 0));

		panelBotonesPer = new JPanel();
		panelBotonesPer.setBackground(Color.WHITE);
		panelSurPer.add(panelBotonesPer);

		buttonAgregarPermiso = new JButton("Agregar permiso");
		buttonAgregarPermiso.addActionListener(this);
		buttonAgregarPermiso.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		buttonAgregarPermiso.setForeground(Color.WHITE);
		buttonAgregarPermiso.setBackground(new Color(45, 0, 255));
		buttonAgregarPermiso.setBounds(10, 266, 269, 29);
		buttonAgregarPermiso.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBotonesPer.add(buttonAgregarPermiso);

		buttonAgregarNuevoPermiso = new JButton("Agregar nuevo permiso");
		buttonAgregarNuevoPermiso.addActionListener(this);
		buttonAgregarNuevoPermiso.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		buttonAgregarNuevoPermiso.setForeground(Color.WHITE);
		buttonAgregarNuevoPermiso.setBackground(new Color(45, 0, 255));
		buttonAgregarNuevoPermiso.setBounds(10, 266, 269, 29);
		buttonAgregarNuevoPermiso.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBotonesPer.add(buttonAgregarNuevoPermiso);

		panelSeparadorPer = new JPanel();
		panelSeparadorPer.setBackground(Color.WHITE);
		panelSurPer.add(panelSeparadorPer);
		panelSeparadorPer.setLayout(new GridLayout(1, 1, 0, 0));

		JSeparator separator_3 = new JSeparator();
		panelSeparadorPer.add(separator_3);

		panelClausulas = new JPanel();
		panelClausulas.setBackground(Color.WHITE);
		panel_2.add(panelClausulas);
		panelClausulas.setLayout(new BorderLayout(0, 0));

		panelCentralCla = new JPanel();
		panelCentralCla.setBackground(Color.WHITE);
		panelClausulas.add(panelCentralCla, BorderLayout.CENTER);
		panelCentralCla.setLayout(new GridLayout(2, 0, 10, 30));

		JLabel lblClausulasExistentes = new JLabel("Clausulas existentes");
		lblClausulasExistentes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblClausulasExistentes.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentralCla.add(lblClausulasExistentes);

		JLabel lblNewLabel = new JLabel("Clausulas Agregadas");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentralCla.add(lblNewLabel);

		JScrollPane scrollPane_5 = new JScrollPane();
		panelCentralCla.add(scrollPane_5);

		listClausulasExistentes = new JList<String>();
		listClausulasExistentes.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		scrollPane_5.setViewportView(listClausulasExistentes);

		JScrollPane scrollPane_3 = new JScrollPane();
		panelCentralCla.add(scrollPane_3);

		listClausulasAgregadas = new JList<String>();
		listClausulasAgregadas.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		scrollPane_3.setViewportView(listClausulasAgregadas);

		panelTituloCla = new JPanel();
		panelTituloCla.setBackground(Color.WHITE);
		panelClausulas.add(panelTituloCla, BorderLayout.NORTH);

		JLabel lblAgregarClausulas_1 = new JLabel("Agregar clausulas");
		lblAgregarClausulas_1.setBackground(Color.WHITE);
		lblAgregarClausulas_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		panelTituloCla.add(lblAgregarClausulas_1);

		panelSurCla = new JPanel();
		panelSurCla.setBackground(Color.WHITE);
		panelClausulas.add(panelSurCla, BorderLayout.SOUTH);
		panelSurCla.setLayout(new GridLayout(2, 0, 0, 0));

		panelBotonesCla = new JPanel();
		panelBotonesCla.setBackground(Color.WHITE);
		panelSurCla.add(panelBotonesCla);

		buttonAgregarClausula = new JButton("Agregar clausula");
		buttonAgregarClausula.addActionListener(this);
		buttonAgregarClausula.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		buttonAgregarClausula.setForeground(Color.WHITE);
		buttonAgregarClausula.setBackground(new Color(45, 0, 255));
		buttonAgregarClausula.setBounds(10, 266, 269, 29);
		buttonAgregarClausula.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBotonesCla.add(buttonAgregarClausula);

		buttonAgregarNuevaClausula = new JButton("Agregar nueva clausula");
		buttonAgregarNuevaClausula.addActionListener(this);
		buttonAgregarNuevaClausula.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		buttonAgregarNuevaClausula.setForeground(Color.WHITE);
		buttonAgregarNuevaClausula.setBackground(new Color(45, 0, 255));
		buttonAgregarNuevaClausula.setBounds(10, 266, 269, 29);
		buttonAgregarNuevaClausula.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBotonesCla.add(buttonAgregarNuevaClausula);

		panelSeparadorCla = new JPanel();
		panelSeparadorCla.setBackground(Color.WHITE);
		panelSurCla.add(panelSeparadorCla);
		panelSeparadorCla.setLayout(new GridLayout(1, 0, 0, 0));

		JSeparator separator_4 = new JSeparator();
		panelSeparadorCla.add(separator_4);

		panelActividades = new JPanel();
		panelActividades.setBackground(Color.WHITE);
		panel_2.add(panelActividades);
		panelActividades.setLayout(new BorderLayout(0, 0));

		panelTituloAct = new JPanel();
		panelTituloAct.setBackground(Color.WHITE);
		panelActividades.add(panelTituloAct, BorderLayout.NORTH);

		JLabel label_9 = new JLabel("Agregar actividades");
		label_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		panelTituloAct.add(label_9);

		panelSurAct = new JPanel();
		panelActividades.add(panelSurAct, BorderLayout.SOUTH);
		panelSurAct.setLayout(new GridLayout(2, 0, 0, 0));

		panelBotonesActividad = new JPanel();
		panelBotonesActividad.setBackground(Color.WHITE);
		panelSurAct.add(panelBotonesActividad);

		buttonAgregarActividad = new JButton("Agregar actividad");
		buttonAgregarActividad.addActionListener(this);
		buttonAgregarActividad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		buttonAgregarActividad.setForeground(Color.WHITE);
		buttonAgregarActividad.setBackground(new Color(45, 0, 255));
		buttonAgregarActividad.setBounds(10, 266, 269, 29);
		buttonAgregarActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBotonesActividad.add(buttonAgregarActividad);

		buttonAgregarNuevaActividad = new JButton("Agregar nueva actividad");
		buttonAgregarNuevaActividad.addActionListener(this);
		buttonAgregarNuevaActividad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		buttonAgregarNuevaActividad.setForeground(Color.WHITE);
		buttonAgregarNuevaActividad.setBackground(new Color(45, 0, 255));
		buttonAgregarNuevaActividad.setBounds(10, 266, 269, 29);
		buttonAgregarNuevaActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBotonesActividad.add(buttonAgregarNuevaActividad);

		panelSeparador = new JPanel();
		panelSeparador.setBackground(Color.WHITE);
		panelSurAct.add(panelSeparador);
		panelSeparador.setLayout(new GridLayout(1, 0, 0, 0));

		JSeparator separator_6 = new JSeparator();
		panelSeparador.add(separator_6);

		panelWestAct = new JPanel();
		panelWestAct.setBackground(Color.WHITE);
		panelActividades.add(panelWestAct, BorderLayout.WEST);
		panelWestAct.setLayout(new BorderLayout(0, 0));

		panelTituloWEST = new JPanel();
		panelTituloWEST.setBackground(Color.WHITE);
		panelWestAct.add(panelTituloWEST, BorderLayout.NORTH);

		lblActividadesExistentes = new JLabel("Actividades existentes");
		lblActividadesExistentes.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelTituloWEST.add(lblActividadesExistentes);

		scrollPane_4 = new JScrollPane();
		panelWestAct.add(scrollPane_4, BorderLayout.CENTER);

		listActividadesExistentes = new JList<String>();
		listActividadesExistentes.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		scrollPane_4.setViewportView(listActividadesExistentes);

		panelEAST = new JPanel();
		panelEAST.setBackground(Color.WHITE);
		panelActividades.add(panelEAST, BorderLayout.EAST);
		panelEAST.setLayout(new BorderLayout(0, 0));

		panelTituloEAST = new JPanel();
		panelTituloEAST.setBackground(Color.WHITE);
		panelEAST.add(panelTituloEAST, BorderLayout.NORTH);

		lblActividadesAgregadas = new JLabel("Actividades agregadas");
		lblActividadesAgregadas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		panelTituloEAST.add(lblActividadesAgregadas);

		scrollPane_6 = new JScrollPane();
		panelEAST.add(scrollPane_6, BorderLayout.CENTER);

		listActividadesAgregadas = new JList<String>();
		listActividadesAgregadas.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		scrollPane_6.setViewportView(listActividadesAgregadas);

		panelCentral = new JPanel();
		panelCentral.setBackground(Color.WHITE);
		panelActividades.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(3, 1, 10, 50));

		lblCantidadARealizar = new JLabel("Cantidad a realizar");
		lblCantidadARealizar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblCantidadARealizar.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblCantidadARealizar);

		editCantidadRealizar = new JTextField();
		editCantidadRealizar.addActionListener(this);
		panelCentral.add(editCantidadRealizar);
		editCantidadRealizar.setColumns(10);

		permisosAgregados = new ArrayList<PermisoContrato>();
		permisosSeleccionados = new ArrayList<String>();
		clausulasAgregadas = new ArrayList<ContratoClausula>();
		nuevasClausulas = new ArrayList<String>();
		actividadesAgregadas = new ArrayList<Actividad>();
		actividadesRealizar = new ArrayList<ActividadRealizar>();
		clausulasSeleccionadas = new ArrayList<String>();
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource() == editTipoContrato) {
			if(editTipoContrato.getSelectedItem().toString().equals("Otro")) {
				String tipoContrato = JOptionPane.showInputDialog(null, "Agrega el nuevo tipo de obra:");
				editTipoContrato.addItem(tipoContrato);
				editTipoContrato.setSelectedItem(tipoContrato);
				editMetrosCuadrados.requestFocus();
			}
			else
				editMetrosCuadrados.requestFocus();
		}
		
		if(e.getSource() == editMetrosCuadrados) {
			if(editMetrosCuadrados.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo no puede quedar vacio", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editHonorarios.requestFocus();
		}
		
		if(e.getSource() == editCostoObra) {
			if(editCostoObra.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "El campo no puede quedar vacio", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
			else
				editCliente.requestFocus();
		}
		
		if(e.getSource() == editCliente) {
			editArquitecto.requestFocus();
		}
		
		if(e.getSource() == editArquitecto) {
			
		}
		
		if(e.getSource() == buttonAgregarPermiso) {
			agregarPermiso();
		}
		
		if(e.getSource() == buttonAgregarClausula) {
			agregarClausula();
		}
		
		if(e.getSource() == buttonAgregarActividad) {
			agregarActividad();
		}
	}
	
	public Contrato crearNuevoContrato() {
		Contrato contract = new Contrato();
		contract.setFechaInicioContrato(getDateFormat(fechaInicio.getDatoFecha()));
		contract.setFechaFinContrato(getDateFormat(fechaFin.getDatoFecha()));
		contract.setTipoContrato(editTipoContrato.getSelectedItem().toString());
		contract.setMetrosCuadradosContrato(Integer.parseInt(editMetrosCuadrados.getText()));
		contract.setHonorariosArquitectoContrato(Integer.parseInt(editHonorarios.getText()));
		contract.setCostoObraContrato(Integer.parseInt(editCostoObra.getText()));
		
		for (Persona arquitect : arquitecto) {
			StringBuilder nombreArq = new StringBuilder(arquitect.getApellidoPaternoPer() + " " + arquitect.getApellidoMaternoPer() + " "+ arquitect.getNombrePer());
			if(editArquitecto.getSelectedItem().toString().equals(nombreArq.toString())) {
				contract.setClaveTrabajador(arquitect.getClavePer());
				break;
			}
		}
		
		for (Persona clientes : cliente) {
			StringBuilder nombreCli = new StringBuilder(clientes.getApellidoPaternoPer() + " " + clientes.getApellidoMaternoPer() + " "+ clientes.getNombrePer());
			if(editCliente.getSelectedItem().toString().equals(nombreCli.toString())) {
				contract.setClaveCliente(clientes.getClavePer());
				break;
			}
		}
		
		return contract;
	}
	
	public void agregarPermiso() {
		PermisoContrato permCont = new PermisoContrato();
		permCont.setCostoPermContrato(Integer.parseInt(editCostoPermiso.getText()));
		permCont.setFechaInicioPermContrato(getDateFormat(fechaInicioPermiso.getDatoFecha()));
		permCont.setFechaFinPermContrato(getDateFormat(fechaFinPermiso.getDatoFecha()));
		
		for (Permiso permiso : permisosAuxiliar) {
			if(listPermisosExistentes.getSelectedValue().toString().equals(permiso.getTipoPermiso())) {
				permCont.setClavePermiso(permiso.getClavePermiso());
				break;
			}
			else
				System.out.println("No encuentra el permiso");
		}
		
		permisosSeleccionados.add(listPermisosExistentes.getSelectedValue().toString());
		llenarPermisosAgregados(permisosSeleccionados);
		
		permisosAgregados.add(permCont);
	}
	
	public void agregarClausula() {
		ContratoClausula cla = new ContratoClausula();
		
		for (Clausula clausula : clausulasAuxiliar) {
			if(listClausulasExistentes.getSelectedValue().toString().equals(clausula.getDescripcionClausula().substring(0, 80))) {
				cla.setClaveClausula(clausula.getClaveClausula());
				break;
			}
		}
		
		clausulasSeleccionadas.add(listClausulasExistentes.getSelectedValue().toString());
		clausulasAgregadas.add(cla);
		llenarClausulasAgregadas(clausulasSeleccionadas);
	}
	
	public void agregarActividad() {
		Actividad act = new Actividad();
		ActividadRealizar actrea = new ActividadRealizar();
		
		act.setName(listActividadesExistentes.getSelectedValue().toString());
		actividadesAgregadas.add(act);
		
		for (Actividad actividad : actividadesAuxiliar) {
			if(listActividadesExistentes.getSelectedValue().toString().equals(actividad.getName())) {
				actrea.setActivityKey(actividad.getKey());
				break;
			}
		}
		
		actrea.setCantidad(Integer.parseInt(editCantidadRealizar.getText()));
		actividadesRealizar.add(actrea);
		
		llenarActividadesAg(actividadesAgregadas);
	}

	/*AGREGANDO DATOS AL JLIST DE ACTIVIDADES*/
	public void llenarActividades(List<Actividad> actividades) {
		actividadesAuxiliar = actividades;
		listActividadesExistentes.setModel(modelListAct(actividades));
	}

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	private DefaultListModel modelListAct(List<Actividad> actividades){
		DefaultListModel model = new DefaultListModel<>();

		for (Actividad actividad : actividades) {
			model.addElement(actividad.getName());
		}

		return model;
	}

	/*AGREGANDO DATOS AL JLIST DE PERMISOS*/
	public void llenarPermisos(List<Permiso> permisos) {
		permisosAuxiliar = permisos;
		listPermisosExistentes.setModel(modelListPerm(permisos));
	}

	private DefaultListModel modelListPerm(List<Permiso> permisos){
		DefaultListModel model = new DefaultListModel<>();

		for (Permiso permiso : permisos) {
			model.addElement(permiso.getTipoPermiso());
		}

		return model;
	}

	/*AGREGANDO DATOS AL JLIST DE CLAUSULAS*/
	public void llenarClausulas(List<Clausula> clausulas) {
		clausulasAuxiliar = clausulas;
		listClausulasExistentes.setModel(modelListCla(clausulas));
	}

	private DefaultListModel modelListCla(List<Clausula> clausulas){
		DefaultListModel model = new DefaultListModel<>();

		for (Clausula clausula : clausulas) {
			String clausulaExistente = clausula.getDescripcionClausula().substring(0, 80);
			model.addElement(clausulaExistente);
		}

		return model;
	}
	
	/*CLAUSULAS AGREGADAS*/
	public void llenarClausulasAgregadas(List<String> clausulas) {
		listClausulasAgregadas.setModel(modelListClaAg(clausulas));
	}

	private DefaultListModel modelListClaAg(List<String> clausulas){
		DefaultListModel model = new DefaultListModel<>();

		for (String string : clausulas) {
			model.addElement(string);
		}

		return model;
	}
	
	public void llenarPermisosAgregados(List<String> permisos) {
		listPermisosAgregados.setModel(modelListPerAg(permisos));
	}

	private DefaultListModel modelListPerAg(List<String> permisos){
		DefaultListModel model = new DefaultListModel<>();
		for (String string : permisos) {
			model.addElement(string);
		}

		return model;
	}
	
	public void llenarActividadesAg(List<Actividad> actividades) {
		listActividadesAgregadas.setModel(modelListActAg(actividades));
	}

	private DefaultListModel modelListActAg(List<Actividad> actividades){
		DefaultListModel model = new DefaultListModel<>();
		for (Actividad actividad : actividades) {
			model.addElement(actividad.getName());
		}

		return model;
	}

	public void llenarTipoContrato(List<Contrato> contratos) {
		for (Contrato contrato : contratos) {
			editTipoContrato.addItem(contrato.getTipoContrato());
		}
		editTipoContrato.addItem("Otro");
	}

	public void llenarCliente(List<Persona> clientes) {
		cliente = clientes;
		for (Persona persona : clientes) {
			StringBuilder names = new StringBuilder(persona.getApellidoPaternoPer() + " " + persona.getApellidoMaternoPer() + " "+ persona.getNombrePer());
			editCliente.addItem(names.toString());
		}
		editCliente.addItem("Otro");
	}

	public void llenarArquitecto(List<Persona> arquitectos) {
		arquitecto = arquitectos;
		for (Persona arquitecto : arquitectos) {
			StringBuilder names = new StringBuilder(arquitecto.getApellidoPaternoPer() + " " + arquitecto.getApellidoMaternoPer() + " "+ arquitecto.getNombrePer());
			editArquitecto.addItem(names.toString());
		}
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

	public JComboBox<String> getCampoArquitecto() {
		return editArquitecto;
	}

	public JComboBox<String> getCampoCliente() {
		return editCliente;
	}

	public JComboBox<String> getCampoContrato() {
		return editTipoContrato;
	}
	
	/*SON LOS PERMISOS PARA LA TABLA PEMISOCONTRATO (YA EXISTENTES)*/
	public List<PermisoContrato> getPermisosAgregados() {
		return permisosAgregados;
	}
	
	public List<String> getPermisosSeleccionados() {
		return permisosSeleccionados;
	}
	
	/*SON LAS CLAUSULAS PARA LA TABLA CONTRATOCLAUSULA (YA EXISTENTES)*/
	public List<ContratoClausula> getClausulasSeleccionadas() {
		return clausulasAgregadas;
	}
	
	/*SON LAS ACTIVIDADES PARA LA TABLA ACTREALIZAR (YA EXISTENTES)*/
	public List<ActividadRealizar> getActividadesAgregadas() {
		return actividadesRealizar;
	}
	
	public JButton getButtonGuardar() {
		return buttonGuardar;
	}
	
	public JButton getButtonCancelar() {
		return buttonCancelar;
	}
	
	public JButton getButtonAgregarNuevaActividad() {
		return buttonAgregarNuevaActividad;
	}
}