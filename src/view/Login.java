package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.font.TextAttribute;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
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
import baseDeDatos.TablaCiudad;
import baseDeDatos.TablaClausula;
import baseDeDatos.TablaCliente;
import baseDeDatos.TablaCodigo;
import baseDeDatos.TablaColonia;
import baseDeDatos.TablaContrato;
import baseDeDatos.TablaContratoTrabajador;
import baseDeDatos.TablaDiaHora;
import baseDeDatos.TablaPermiso;
import baseDeDatos.TablaPermisoContrato;
import baseDeDatos.TablaPersona;
import baseDeDatos.TablaStatusContrato;
import baseDeDatos.TablaTrabajadorActividad;
import modelo.Contrato;
import modelo.DiaHora;
import baseDeDatos.BaseDeDatos;
import modelo.AutoCompletion;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class Login extends JFrame {

	private BaseDeDatos baseDatos;
	private JPanel contentPane;
	private int iterator = 0;
	private String cliente = "";
	private String nombre = "";
	private String paterno = "";
	private String materno = "";
	private String colonia = "";
	private int codigo = 0;
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
	private NewContract nuevoContrato;
	private NewClause nuevaClausula;
	private AddNewClause addClause;
	private NewEmployee nuevoEmpleado;
	private EmployeeCategory categoriaEmpleados;
	private SearchZipCode buscarCodigo;
	private Contrato contrato;
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
	private TablaCodigo tablaCodigo;
	private TablaColonia tablaColonia;
	private TablaCiudad tablaCiudad;
	private TablaDiaHora tablaDiaHora;

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
		setBounds(100, 100, 1132, 609);
		setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

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
		tablaCodigo = new TablaCodigo(baseDatos.getConexion());
		tablaColonia = new TablaColonia(baseDatos.getConexion());
		tablaCiudad = new TablaCiudad(baseDatos.getConexion());
		tablaDiaHora = new TablaDiaHora(baseDatos.getConexion());
		contentPane.setLayout(new BorderLayout(0, 0));
		menuLateral();
	}

	/*MENÚ LATERAL*/
	public void menuLateral() {
		if(menu == null) {
			menu = new LateralMenu();
			/*OPCIÓN DE VER LOS PROYECTOS*/
			menu.getButtonProjects().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					listOfContracts();
				}
			});
			
			menu.getButtonEmployees().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					categoriaEmpleado();
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
		nuevoContrato = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		menuLateral();
		repaint();

		if(projects == null) {
			projects = new Projects();
			projects.showProjectFolders(tablaContrato.getContratos());
			projects.getProyecto().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					iterator = projects.getCounter();
					if(iterator != 0) {
						listOfContracts();
					}
					else
						JOptionPane.showMessageDialog(null, "Elige una carpeta");
				}
			});
			
			projects.getNuevoProyecto().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					nuevoContrato();
				}
			});

			contentPane.add(projects, BorderLayout.CENTER);
			setVisible(true);
		}
	}

	public void listOfContracts() {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevoContrato = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		menuLateral();
		repaint();
		
		if(contracts == null) {
			contracts = new Contracts();

			contracts.showProjectContracts(tablaContrato.getFecha(), tablaCliente.getCliente());
			contracts.getContrato().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					iterator = contracts.getCounter();
					cliente = contracts.getNombres().get(contracts.getNombres().size() - iterator).getText();

					if(iterator != 0 && cliente.length() != 0) {
						nombre = tablaCliente.getCliente().get(contracts.getNombres().size() - iterator).getNombrePer();
						paterno = tablaCliente.getCliente().get(contracts.getNombres().size() - iterator).getApellidoPaternoPer();
						materno = tablaCliente.getCliente().get(contracts.getNombres().size() - iterator).getApellidoMaternoPer();
						fecha = tablaContrato.getFecha().get(contracts.getFechas().size() - iterator).getFechaInicioContrato();
						claveCli = tablaCliente.getCliente().get(contracts.getNombres().size() - iterator).getClavePer();
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
		nuevoContrato = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
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
					listOfContracts();
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
		nuevoContrato = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
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
		nuevoContrato = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		menuLateral();
		repaint();
		
		if(trabajadores == null) {
			trabajadores = new Trabajadores();
			
			trabajadores.showTrabajadores(tablaActividad.getDetailsActivities(clave), tablaPersona.getDetallesTrabajadorAct(clave), tablaTraAct.getDetailsTrabajadorAct(clave));
			trabajadores.getVerAvance().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int claveTrabajador = trabajadores.getClaveTrabajador();
					if(claveTrabajador != 0) {
						trabajadores.verAvance(tablaAvance.getAvance(claveTrabajador));
					}
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
		nuevoContrato = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
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
		nuevoContrato = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
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
	
	public void nuevoContrato() {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevoContrato = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		menuLateral();
		repaint();
		
		if(nuevoContrato == null) {
			nuevoContrato = new NewContract();
			nuevoContrato.llenarTipoContrato(tablaContrato.getContratos());
			nuevoContrato.llenarCliente(tablaPersona.getFiltroCliente());
			nuevoContrato.llenarArquitecto(tablaPersona.getFiltroArquitecto());
			AutoCompletion.enable(nuevoContrato.getCampoCliente());
			AutoCompletion.enable(nuevoContrato.getCampoArquitecto());
			
			nuevoContrato.getButtonSiguiente().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					contrato = nuevoContrato.getNuevoContrato(nuevoContrato.getCampoCliente().getSelectedIndex() + 1, nuevoContrato.getCampoArquitecto().getSelectedIndex() + 1);
					newClause();
				}
			});
			
			
			contentPane.add(nuevoContrato, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void newClause() {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevoContrato = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		menuLateral();
		repaint();
		
		if(nuevaClausula == null) {
			nuevaClausula = new NewClause();
			nuevaClausula.showClausulas(tablaClausula.getTodasClausulas());
			nuevaClausula.getBotonAgregarClausula().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					nuevaClausula.showNuevasClausulas(Integer.parseInt(nuevaClausula.getClaveClausula()));
				}
			});
			
			nuevaClausula.getBotonAgregarNuevaClausula().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					addClause = new AddNewClause();
					
					addClause.setVisible(true);
				}
			});
			
			contentPane.add(nuevaClausula, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void categoriaEmpleado() {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevoContrato = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		menuLateral();
		repaint();
		
		if(categoriaEmpleados == null) {
			categoriaEmpleados = new EmployeeCategory();
			
			categoriaEmpleados.showTypesOfEmployees(tablaTrabajador.getPuestoTrabajador());
			
			categoriaEmpleados.getNuevoEmpleado().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					nuevoEmpleado();
				}
			});
			
			contentPane.add(categoriaEmpleados, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void nuevoEmpleado() {
		contentPane.removeAll();
		projects = null;
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevoContrato = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		menuLateral();
		repaint();
		
		if(nuevoEmpleado == null) {
			nuevoEmpleado = new NewEmployee();
			
			nuevoEmpleado.llenarPuestos(tablaTrabajador.getPuestoTrabajador());
			AutoCompletion.enable(nuevoEmpleado.getPuesto());
			
			nuevoEmpleado.llenarDiaHora(tablaDiaHora.getTipoDiaHora());
			AutoCompletion.enable(nuevoEmpleado.getDiaHora());
			
			nuevoEmpleado.getButtonCodigoPostal().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					buscarCodigo();
				}
			});
			
			nuevoEmpleado.getButtonGuardar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(!nuevoEmpleado.camposVacios()) {
						List<DiaHora> horario = new ArrayList<DiaHora>();
						for(int i = 0; i < 6; i++) {
							horario.add(nuevoEmpleado.getTime(i + 1));
						}
						try {
							tablaTrabajador.guardarNuevoEmpleado(nuevoEmpleado.getNewPerson(), nuevoEmpleado.getNewEmployee(), tablaColonia.getClaveColonia(codigo, colonia), horario);
							JOptionPane.showMessageDialog(null, "Empleado registrado");
						} catch (SQLException e1) {
							System.out.println(e.toString() + " Del código Java");
							e1.printStackTrace();
						}
						nuevoEmpleado.limpiarCampos();
					}
					else
						JOptionPane.showMessageDialog(null, "¡Hay campos que no pueden quedar vacios!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
				}
			});
			
			nuevoEmpleado.getButtonRegresar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					categoriaEmpleado();
				}
			});
			
			nuevoEmpleado.getButtonCancelar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					categoriaEmpleado();
				}
			});
			
			contentPane.add(nuevoEmpleado, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void buscarCodigo() {
		if(buscarCodigo == null) {
			buscarCodigo = new SearchZipCode();
			buscarCodigo.cargarCodigosPostales(tablaCodigo.getCodigosPostales());
			AutoCompletion.enable(buscarCodigo.getCodigosPostales());
			buscarCodigo.getCodigosPostales().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					codigo = Integer.parseInt(buscarCodigo.getCodigosPostales().getSelectedItem().toString());
					buscarCodigo.cargarColonias(tablaColonia.getColonias(codigo));
					AutoCompletion.enable(buscarCodigo.getColonias());
				}
			});
			
			buscarCodigo.getColonias().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					colonia = buscarCodigo.getColonias().getSelectedItem().toString();
				}
			});
			
			buscarCodigo.getButtonSeleccionar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					nuevoEmpleado.getTextColonia().setText(colonia);
					nuevoEmpleado.getTextCiudad().setText(String.valueOf(tablaCiudad.getCiudad(codigo).getNombreCiudad()));
					buscarCodigo.dispose();
					buscarCodigo = null;
				}
			});
			
			buscarCodigo.addWindowListener(new WindowListener() {
				
				@Override
				public void windowOpened(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					buscarCodigo = null;					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					buscarCodigo = null;
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			buscarCodigo.setVisible(true);
		}
	}
}
