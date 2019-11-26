package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.font.TextAttribute;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import baseDeDatos.BaseDeDatos;
import baseDeDatos.TablaActividad;
import baseDeDatos.TablaAutorizacion;
import baseDeDatos.TablaAvance;
import baseDeDatos.TablaClausula;
import baseDeDatos.TablaCliente;
import baseDeDatos.TablaContrato;
import baseDeDatos.TablaContratoTrabajador;
import baseDeDatos.TablaPermiso;
import baseDeDatos.TablaPermisoContrato;
import baseDeDatos.TablaPersona;
import baseDeDatos.TablaStatusContrato;
import baseDeDatos.TablaTrabajadorActividad;
import modelo.Contrato;
import baseDeDatos.BaseDeDatos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener{

	private BaseDeDatos baseDatos;
	private JPanel contentPane;
	private JTextField editUserName;
	private JLabel singUp;
	private JButton buttonSingIn;
	private JPasswordField userPassword;
	private JLabel forgotPassword;
	private int iterator = 0;
	private String carpeta = "";
	private String cliente = "";
	private String nombre = "";
	private String paterno = "";
	private String materno = "";
	private Date fecha = null;
	private int claveCli = 0;
	private Projects projects;
	private LateralMenu menu;
	private Contracts contracts;
	private ProjectDetails details;
	private Activities activities;
	private Authorization autorizacion;
	private Trabajadores trabajadores;
	private Clause clausula;
	private TablaContrato tablaContrato;
	private TablaCliente tablaCliente;
	private TablaStatusContrato tablaStatus;
	private TablaContratoTrabajador tablaTrabajador;
	private TablaActividad tablaActividad;
	private TablaTrabajadorActividad tablaTraAct;
	private TablaPersona tablaPersona;
	private TablaAvance tablaAvance;
	private TablaPermiso tablaPermiso;
	private TablaPermisoContrato tablaPermisoCont;
	private TablaAutorizacion tablaAutorizacion;
	private TablaClausula tablaClausula;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 502);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		baseDatos = new BaseDeDatos("constructorcompany", "root", "17650010");
		baseDatos.setDriver("com.mysql.jdbc.Driver");
		baseDatos.setProtocolo("jdbc:mysql://localhost/");
		baseDatos.hacerConexion();

		tablaContrato = new TablaContrato(baseDatos.getConexion());
		tablaCliente = new TablaCliente(baseDatos.getConexion());
		tablaStatus = new TablaStatusContrato(baseDatos.getConexion());
		tablaTrabajador = new TablaContratoTrabajador(baseDatos.getConexion());
		tablaActividad = new TablaActividad(baseDatos.getConexion());
		tablaTraAct = new TablaTrabajadorActividad(baseDatos.getConexion());
		tablaPersona = new TablaPersona(baseDatos.getConexion());
		tablaAvance = new TablaAvance(baseDatos.getConexion());
		tablaPermiso = new TablaPermiso(baseDatos.getConexion());
		tablaPermisoCont = new TablaPermisoContrato(baseDatos.getConexion());
		tablaAutorizacion = new TablaAutorizacion(baseDatos.getConexion());
		tablaClausula = new TablaClausula(baseDatos.getConexion());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblConstructorCompany = new JLabel("Constructor Company");
		lblConstructorCompany.setFont(new Font("Roboto", Font.PLAIN, 30));
		lblConstructorCompany.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblConstructorCompany);

		JLabel lblNewLabel = new JLabel("A company for the build of anything");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(58, 11, 289, 368);
		panel_3.add(panel_5);
		panel_5.setLayout(null);

		editUserName = new JTextField();
		editUserName.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		editUserName.setHorizontalAlignment(SwingConstants.CENTER);
		editUserName.setFont(new Font("Roboto", Font.PLAIN, 15));
		editUserName.setBounds(10, 64, 269, 31);

		panel_5.add(editUserName);
		editUserName.setColumns(10);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.GRAY);
		lblUsername.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_perm_identity_black_18dp.png"));
		lblUsername.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblUsername.setBounds(10, 11, 269, 31);
		panel_5.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.GRAY);
		lblPassword.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_lock_black_18dp.png"));
		lblPassword.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblPassword.setBounds(10, 118, 269, 36);
		panel_5.add(lblPassword);

		forgotPassword = new JLabel("Forgot your password?");
		forgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
		forgotPassword.setForeground(Color.GRAY);
		forgotPassword.setFont(new Font("Roboto", Font.PLAIN, 13));
		forgotPassword.setBounds(10, 223, 269, 28);
		forgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Font font = forgotPassword.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		forgotPassword.setFont(font.deriveFont(attributes));
		panel_5.add(forgotPassword);

		buttonSingIn = new JButton("Sing In ");
		buttonSingIn.addActionListener(this);
		buttonSingIn.setForeground(Color.WHITE);
		buttonSingIn.setFont(new Font("Roboto", Font.PLAIN, 17));
		buttonSingIn.setBackground(new Color(45, 0, 255));
		buttonSingIn.setBounds(10, 266, 269, 29);
		buttonSingIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_5.add(buttonSingIn);

		singUp = new JLabel("Don't have an account? Sing Up");
		singUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Escuchador funcionando");
			}
		});
		singUp.setHorizontalAlignment(SwingConstants.CENTER);
		singUp.setForeground(Color.GRAY);
		singUp.setFont(new Font("Roboto", Font.PLAIN, 13));
		singUp.setBounds(10, 316, 269, 28);
		singUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Font fontUp = singUp.getFont();
		Map attributesUp = fontUp.getAttributes();
		attributesUp.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		singUp.setFont(font.deriveFont(attributesUp));
		panel_5.add(singUp);

		userPassword = new JPasswordField();
		userPassword.setBounds(10, 175, 269, 30);
		panel_5.add(userPassword);
	}

	//Comienzo con el botón del login
	//AQUÍ ESTÁ TODO EL ESCUCHADOR DE LOS BOTONES
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonSingIn) {
			setExtendedState(MAXIMIZED_BOTH);
			contentPane.removeAll();
			contentPane.setLayout(new BorderLayout(0, 0));
			menuLateral();
			repaint();
		}
	}

	/*MENÚ LATERAL*/
	public void menuLateral() {
		if(menu == null) {
			menu = new LateralMenu();
			/*OPCIÓN DE VER LOS PROYECTOS*/
			menu.getButtonProjects().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					listOfProjects();
				}
			});

			contentPane.add(menu, BorderLayout.WEST);
			setVisible(true);
		}
	}

	/*CREACIÓN DE UN NUEVO USUARIO*/
	public void nuevoUsuario() {

	}

	/*LISTADO DE TODOS LOS PROYECTOS*/
	public void listOfProjects() {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		menuLateral();
		repaint();

		if(projects == null) {
			projects = new Projects();
			projects.showProjectFolders(tablaContrato.getContratos());
			projects.getProyecto().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					iterator = projects.getCounter();
					carpeta = projects.getTipos().get(projects.getTipos().size() - iterator).getText();
					if(iterator != 0) {
						listOfContracts(carpeta.trim());
					}
					else
						JOptionPane.showMessageDialog(null, "Elige una carpeta");
				}
			});
			
			projects.getNuevoProyecto().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
				}
			});

			contentPane.add(projects, BorderLayout.CENTER);
			setVisible(true);
		}
	}

	public void listOfContracts(String carpeta) {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		menuLateral();
		repaint();
		
		if(contracts == null) {
			contracts = new Contracts();

			contracts.showProjectContracts(tablaContrato.getFecha(carpeta), tablaCliente.getCliente(carpeta));
			contracts.getContrato().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					iterator = contracts.getCounter();
					cliente = contracts.getNombres().get(contracts.getNombres().size() - iterator).getText();

					if(iterator != 0 && cliente.length() != 0) {
						nombre = tablaCliente.getCliente(carpeta).get(contracts.getNombres().size() - iterator).getNombrePer();
						paterno = tablaCliente.getCliente(carpeta).get(contracts.getNombres().size() - iterator).getApellidoPaternoPer();
						materno = tablaCliente.getCliente(carpeta).get(contracts.getNombres().size() - iterator).getApellidoMaternoPer();
						fecha = tablaContrato.getFecha(carpeta).get(contracts.getFechas().size() - iterator).getFechaInicioContrato();
						claveCli = tablaCliente.getCliente(carpeta).get(contracts.getNombres().size() - iterator).getClavePer();
						detailsContract(nombre, paterno, materno, fecha, claveCli, cliente);
					}
					else
						JOptionPane.showMessageDialog(null, "Elige una carpeta");
				}
			});
			
			contracts.getBotonRegresar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					listOfProjects();
				}
			});

			contentPane.add(contracts, BorderLayout.CENTER);
			setVisible(true);
		}
	}

	public void detailsContract(String nombre, String paterno, String materno, Date fecha, int clave, String cliente) {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		menuLateral();
		repaint();

		if(details == null) {
			details = new ProjectDetails();

			Contrato contract = tablaContrato.getDetailsProject(nombre, paterno, materno, fecha, clave);
			String arquitecto = String.valueOf(tablaTrabajador.getArquitecto(contract.getClaveTrabajador()));
			details.showDetailsProyect(contract, tablaStatus.getStatus(contract.getClaveContrato()), cliente, arquitecto);
			/*
			 1.- Actividades
			 2.- Trabajadores
			 3.- Autorización
			 4.- Clausulas
			 */
			//ACTIVIDADES
			details.getOpciones().get(0).addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mostrarActividades(contract.getClaveContrato());
				}
			});

			//TRABAJADORES
			details.getOpciones().get(1).addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mostrarTrabajadores(contract.getClaveContrato());
				}
			});

			//AUTORIZACIÓN
			details.getOpciones().get(2).addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					autorizacion(contract.getClaveContrato());
				}
			});

			//CLAUSULAS
			details.getOpciones().get(3).addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					clausulas(contract.getClaveContrato());
				}
			});
			
			details.getBotonRegresar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					listOfContracts(carpeta.trim());
				}
			});

			contentPane.add(details, BorderLayout.CENTER);
			setVisible(true);
		}
	}

	public void mostrarActividades(int clave) {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		menuLateral();
		repaint();
		
		if(activities == null) {
			activities = new Activities();

			activities.showActivities(tablaActividad.getDetailsActivities(clave), tablaTraAct.getDetailsTrabajadorAct(clave));
			
			activities.getBotonRegresar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					detailsContract(nombre, paterno, materno, fecha, claveCli, cliente);
				}
			});

			contentPane.add(activities, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void mostrarTrabajadores(int clave) {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		menuLateral();
		repaint();
		
		if(trabajadores == null) {
			trabajadores = new Trabajadores();
			
			trabajadores.showTrabajadores(tablaActividad.getDetailsActivities(clave), tablaPersona.getDetallesTrabajadorAct(clave), tablaTraAct.getDetailsTrabajadorAct(clave));
			trabajadores.getVerAvance().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int claveTrabajador = trabajadores.getClaveTrabajador();
					if(claveTrabajador != 0)
						trabajadores.verAvance(tablaAvance.getAvance(claveTrabajador));
					else
						JOptionPane.showMessageDialog(null, "¡No ha seleccionado ninguna fila!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
				}
			});
			
			trabajadores.getBotonRegresar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					detailsContract(nombre, paterno, materno, fecha, claveCli, cliente);
				}
			});
			
			contentPane.add(trabajadores, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void autorizacion(int clave) {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		menuLateral();
		repaint();
		
		if(autorizacion == null) {
			autorizacion = new Authorization();
			autorizacion.showAutorizaciones(tablaPermisoCont.getPermisoContrato(clave), tablaPermiso.getPermiso(clave));
			
			autorizacion.getVerStatus().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int clavePermisoCont = autorizacion.getClavePermisoCont();
					if(clavePermisoCont != 0) {
						autorizacion.verAvance(tablaAutorizacion.getAutorizacionStatus(clavePermisoCont));
					}
					else
						JOptionPane.showMessageDialog(null, "¡No ha seleccionado ninguna fila!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
				}
			});
			
			autorizacion.getBotonRegresar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					detailsContract(nombre, paterno, materno, fecha, claveCli, cliente);
				}
			});
			
			contentPane.add(autorizacion, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void clausulas(int clave) {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		menuLateral();
		repaint();
		
		if(clausula == null) {
			clausula = new Clause();
			
			clausula.showClausulas(tablaClausula.getClausulas(clave));
			clausula.getDescripcion().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int bandera = clausula.getClavePermiso();
					if(bandera != 0) 
						clausula.verDescripcion();
					else
						JOptionPane.showMessageDialog(null, "¡No ha seleccionado ninguna fila!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
				}
			});
			
			clausula.getBotonRegresar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					detailsContract(nombre, paterno, materno, fecha, claveCli, cliente);
				}
			});
			
			contentPane.add(clausula, BorderLayout.CENTER);
			setVisible(true);
		}
	}
}
