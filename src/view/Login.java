package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import java.awt.Color;

import baseDeDatos.BaseDeDatos;
import baseDeDatos.TablaActividad;
import baseDeDatos.TablaAutorizacion;
import baseDeDatos.TablaAvance;
import baseDeDatos.TablaCita;
import baseDeDatos.TablaCiudad;
import baseDeDatos.TablaClausula;
import baseDeDatos.TablaCliente;
import baseDeDatos.TablaCodigo;
import baseDeDatos.TablaColonia;
import baseDeDatos.TablaContrato;
import baseDeDatos.TablaContratoTrabajador;
import baseDeDatos.TablaDiaHora;
import baseDeDatos.TablaMaterial;
import baseDeDatos.TablaPermiso;
import baseDeDatos.TablaPermisoContrato;
import baseDeDatos.TablaPersona;
import baseDeDatos.TablaResurtir;
import baseDeDatos.TablaStatusCita;
import baseDeDatos.TablaStatusContrato;
import baseDeDatos.TablaTrabajadorActividad;
import modelo.Contrato;
import modelo.DiaHora;
import modelo.Material;
import modelo.PermisoContrato;
import modelo.ActividadRealizar;
import modelo.AutoCompletion;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class Login extends JFrame {

	private BaseDeDatos baseDatos;
	private JPanel contentPane;
	private List<ActividadRealizar> addActRea;
	private List<PermisoContrato> permCont;
	private List<Material> materialesAux;
	private int iterator = 0;
	private boolean bandera = false;
	private String cliente = "";
	private String nombre = "";
	private String paterno = "";
	private String materno = "";
	private String colonia = "";
	private int codigo = 0;
	private Date fecha = null;
	private int claveCli = 0;
	private LateralMenu menu;
	private Contracts contracts;
	private ProjectDetails details;
	private Activities activities;
	private Authorization autorizacion;
	private Trabajadores trabajadores;
	private Clause clausula;
	private NewClause nuevaClausula;
	private AddNewClause addClause;
	private NewEmployee nuevoEmpleado;
	private EmployeeCategory categoriaEmpleados;
	private SearchZipCode buscarCodigo;
	private NuevoContrato nuevoContrato;
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
	private TablaMaterial tablaMaterial;
	private TablaResurtir tablaResurtir;
	private TablaStatusCita tablaStatusCita;
	private TablaCita tablaCita;
	private NuevaActividadEmergente actividadEmergente;
	private NuevaClausulaEmergente clausulaEmergente;
	private NuevoPermisoEmergente permisoEmergente;
	private NuevoCliente nuevoCliente;
	private Clientes clientes;
	private CategoriaMateriales categoriaMaterial;
	private MaterialView materials;
	private RegistrarMaterial registraMaterial;
	private ResurtirMaterial resurtir;
	private RegistrarMaterialEmergente registroEmergente;
	private CategoriaCita categoriaCit;
	private AgendarCita agendaCita;
	private ShowActividad showActivity;
	private NuevaActividad nuevaAct;
	private ShowMateriales showMaterials;
	
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
		tablaMaterial = new TablaMaterial(baseDatos.getConexion());
		tablaResurtir = new TablaResurtir(baseDatos.getConexion());
		tablaStatusCita = new TablaStatusCita(baseDatos.getConexion());
		tablaCita = new TablaCita(baseDatos.getConexion());
		
		contentPane.setLayout(new BorderLayout(0, 0));
		menuLateral();
		addActRea = new ArrayList<ActividadRealizar>();
		permCont = new ArrayList<PermisoContrato>();
		materialesAux = new ArrayList<Material>();
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

			menu.getButtonClients().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					cliente();
				}
			});

			menu.getButtonMaterials().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					categoriaMateriales();
				}
			});
			
			menu.getButtonBuyMoreMaterials().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					resurtirMaterial();
				}
			});
			
			menu.getButtonAppoiment().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					categoriaCita();
				}
			});
			
			menu.getButtonActivities().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					mostrarActividades();
				}
			});

			contentPane.add(menu, BorderLayout.WEST);
			setVisible(true);
		}
	}

	/*NUEVO CONTRATO*/
	public void nuevoContrato() {
		contentPane.removeAll();
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
		menuLateral();
		repaint();

		if(!addActRea.isEmpty())
			addActRea.clear();
		if(!permCont.isEmpty())
			permCont.clear();

		if(nuevoContrato == null) {
			nuevoContrato = new NuevoContrato();

			nuevoContrato.llenarTipoContrato(tablaContrato.getContratos());
			AutoCompletion.enable(nuevoContrato.getCampoContrato());

			nuevoContrato.llenarCliente(tablaPersona.getFiltroCliente());
			AutoCompletion.enable(nuevoContrato.getCampoCliente());

			nuevoContrato.llenarArquitecto(tablaPersona.getArquitectosDisponibles(tablaTrabajador.getClavesArquitectos()));
			AutoCompletion.enable(nuevoContrato.getCampoArquitecto());

			nuevoContrato.llenarActividades(tablaActividad.getActividades());
			nuevoContrato.llenarPermisos(tablaPermiso.getTipoPermisos());
			nuevoContrato.llenarClausulas(tablaClausula.getTodasClausulas());

			nuevoContrato.getButtonAgregarNuevaActividad().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					showActivity();
				}
			});

			nuevoContrato.getButtonAgregarNuevaClausula().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					showClause();
				}
			});

			nuevoContrato.getButtonAgregarNuevoPermiso().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					showPermission();
				}
			});

			nuevoContrato.getButtonGuardar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						tablaContrato.guardarNuevoContrato(nuevoContrato.getActividadesAgregadas(), 
								nuevoContrato.getClausulasSeleccionadas(), nuevoContrato.getPermisosAgregados(), 
								nuevoContrato.crearNuevoContrato(), nuevoContrato.getNuevasActividades(),
								nuevoContrato.getNuevasClausulas(), nuevoContrato.getNuevosPermisos(),
								permCont, addActRea);
						JOptionPane.showMessageDialog(null, "Contrato creado exitósamente");
						listOfContracts();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});

			nuevoContrato.getButtonCancelar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					listOfContracts();
				}
			});

			contentPane.add(nuevoContrato, BorderLayout.CENTER);
			setVisible(true);
		}
	}

	public void nuevoCliente() {
		contentPane.removeAll();
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
		menuLateral();
		repaint();

		if(nuevoCliente == null) {
			nuevoCliente = new NuevoCliente();


			nuevoCliente.getButtonCodigoPostal().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					buscarCodigo(1);
				}
			});

			nuevoCliente.getButtonGuardar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if(!nuevoCliente.camposVacios()) {
						try {
							tablaCliente.guardarNuevoCliente(nuevoCliente.getNewPerson(), tablaColonia.getClaveColonia(codigo, colonia));
							JOptionPane.showMessageDialog(null, "El cliente ha sido registrado exitósamente");
							cliente();

						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					else
						JOptionPane.showMessageDialog(null, "¡Hay campos que no pueden quedar vacios!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
				}
			});

			nuevoCliente.getButtonCancelar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					cliente();
				}
			});

			contentPane.add(nuevoCliente, BorderLayout.CENTER);
			setVisible(true);
		}
	}

	public void listOfContracts() {
		contentPane.removeAll();
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
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

			contracts.getButtonNuevoContrato().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					nuevoContrato();
				}
			});

			contentPane.add(contracts, BorderLayout.CENTER);
			setVisible(true);
		}
	}

	public void detailsContract(String nombre, String paterno, String materno, Date fecha, int clave, String cliente) {
		contentPane.removeAll();
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		nuevaAct = null;
		showActivity = null;
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		nuevaAct = null;
		showActivity = null;
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		nuevaAct = null;
		showActivity = null;
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

	public void newClause() {
		contentPane.removeAll();
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
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
					buscarCodigo(0);
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

	public void buscarCodigo(int bandera) {
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
					if(bandera == 0) {
						nuevoEmpleado.getTextColonia().setText(colonia);
						nuevoEmpleado.getTextCiudad().setText(String.valueOf(tablaCiudad.getCiudad(codigo).getNombreCiudad()));
						buscarCodigo.dispose();
						buscarCodigo = null;
					}
					else if(bandera == 3) {
						agendaCita.getColonia().setText(colonia);
						buscarCodigo.dispose();
						buscarCodigo = null;
					}
					else {
						nuevoCliente.getTextColonia().setText(colonia);
						nuevoCliente.getTextCiudad().setText(String.valueOf(tablaCiudad.getCiudad(codigo).getNombreCiudad()));
						buscarCodigo.dispose();
						buscarCodigo = null;
					}
				}
			});

			buscarCodigo.getButtoCancelar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
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

	public void showActivity() {
		if(actividadEmergente == null) {
			actividadEmergente = new NuevaActividadEmergente();

			actividadEmergente.llenarUnidadMedida(tablaActividad.getUnidadesDeMedida());
			AutoCompletion.enable(actividadEmergente.getUnidadMedida());

			actividadEmergente.getButtonAgregar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					nuevoContrato.getNuevasActividades().add(actividadEmergente.nuevaActividad());
					nuevoContrato.llenarActividadesNuevas();
					addActRea.add(actividadEmergente.nuevaActividadRealizar());
					actividadEmergente.dispose();
					actividadEmergente= null;
				}
			});

			actividadEmergente.getButtonCancelar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					actividadEmergente.dispose();
					actividadEmergente= null;
				}
			});

			actividadEmergente.addWindowListener(new WindowListener() {

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
					actividadEmergente = null;					
				}

				@Override
				public void windowClosed(WindowEvent e) {
					actividadEmergente = null;
				}

				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub

				}
			});

			actividadEmergente.setVisible(true);
		}
	}

	public void showClause() {
		if(clausulaEmergente == null) {
			clausulaEmergente = new NuevaClausulaEmergente();

			clausulaEmergente.getButtonAgregar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					nuevoContrato.getNuevasClausulas().add(clausulaEmergente.getNuevaClausula());
					nuevoContrato.llenarClausulasNuevas();
					clausulaEmergente.dispose();
					clausulaEmergente = null;
				}
			});

			clausulaEmergente.getButtonCancelar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					clausulaEmergente.dispose();
					clausulaEmergente = null;
				}
			});

			clausulaEmergente.addWindowListener(new WindowListener() {

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
					clausulaEmergente = null;					
				}

				@Override
				public void windowClosed(WindowEvent e) {
					clausulaEmergente = null;
				}

				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub

				}
			});

			clausulaEmergente.setVisible(true);
		}
	}

	public void showPermission() {
		if(permisoEmergente == null) {
			permisoEmergente = new NuevoPermisoEmergente();

			permisoEmergente.getButtonAgregar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					nuevoContrato.getNuevosPermisos().add(permisoEmergente.nuevoPermiso());
					nuevoContrato.llenarPermisosNuevos();
					permCont.add(permisoEmergente.nuevoPermisoContrato());
					permisoEmergente.dispose();
					permisoEmergente = null;
				}
			});

			permisoEmergente.getButtonCancelar().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					permisoEmergente.dispose();
					permisoEmergente = null;
				}
			});

			permisoEmergente.addWindowListener(new WindowListener() {

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
					permisoEmergente = null;					
				}

				@Override
				public void windowClosed(WindowEvent e) {
					permisoEmergente = null;
				}

				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub

				}
			});

			permisoEmergente.setVisible(true);
		}
	}

	public void cliente() {
		contentPane.removeAll();
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		menuLateral();
		repaint();

		if(clientes == null) {
			clientes = new Clientes();

			clientes.showClientes(tablaCliente.getClientesCli(), tablaCliente.getClientesPer());

			clientes.getButtonNuevoCliente().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					nuevoCliente();
				}
			});

			contentPane.add(clientes, BorderLayout.CENTER);
			setVisible(true);
		}
	}

	public void categoriaMateriales() {
		contentPane.removeAll();
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
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		showActivity = null;
		categoriaCit = null;
		agendaCita = null;
		nuevaAct = null;
		menuLateral();
		repaint();

		if(categoriaMaterial == null) {
			categoriaMaterial = new CategoriaMateriales();

			categoriaMaterial.showTipoMaterial(tablaMaterial.getTiposMateriales());
			categoriaMaterial.getButtonVerCategoria().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					iterator = categoriaMaterial.getCounter();
					String categoria = categoriaMaterial.getTipos().get(categoriaMaterial.getTipos().size() - iterator).getText();
					if(iterator != 0 && categoria.length() != 0) {
						tipoDeMateriales(categoria);
					}
					else
						JOptionPane.showMessageDialog(null, "Elige una carpeta");
				}
			});
			
			categoriaMaterial.getButtonRegistrarMaterial().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					registroMaterial();
				}
			});

			contentPane.add(categoriaMaterial, BorderLayout.CENTER);
			setVisible(true);
		}
	}

	public void tipoDeMateriales(String categorias) {
		contentPane.removeAll();
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		showActivity = null;
		agendaCita = null;
		nuevaAct = null;
		menuLateral();
		repaint();
		
		if(materials == null) {
			materials = new MaterialView();
			
			materials.showMaterials(tablaMaterial.getNombreMateriales(categorias.trim()));
			
			materials.getButtonVerMaterial().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					iterator = materials.getCounter();
					String categoria = materials.getNombres().get(materials.getNombres().size() - iterator).getText();
					if(iterator != 0 && categoria.length() != 0) {
						showMateriales(categoria, categorias);
					}
					else
						JOptionPane.showMessageDialog(null, "Elige una carpeta");
				}
			});
			
			materials.getButtonRegistrarMaterial().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					registroMaterial();
				}
			});
			
			materials.getButtonRegresar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					categoriaMateriales();
				}
			});
			contentPane.add(materials, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void registroMaterial() {
		contentPane.removeAll();
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
		menuLateral();
		repaint();
		
		if(registraMaterial == null) {
			registraMaterial = new RegistrarMaterial();
			
			registraMaterial.llenarTipoMaterial(tablaMaterial.getTiposMateriales());
			AutoCompletion.enable(registraMaterial.tipoMaterial());
			
			registraMaterial.llenarMarcaMaterial(tablaMaterial.getMarcaMateriales());
			AutoCompletion.enable(registraMaterial.marca());
			
			registraMaterial.llenarUnidadMedida(tablaMaterial.getUnidadMedida());
			AutoCompletion.enable(registraMaterial.unidadMedida());
			
			registraMaterial.getButtonRegistrar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					tablaMaterial.registrarMaterial(registraMaterial.nuevoMaterial());
					categoriaMateriales();
				}
			});
			
			registraMaterial.getButtonCancelar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					categoriaMateriales();
				}
			});
			
			contentPane.add(registraMaterial, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void resurtirMaterial() {
		contentPane.removeAll();
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
		menuLateral();
		repaint();
		
		if(resurtir == null) {
			resurtir = new ResurtirMaterial();
			
			resurtir.buscarProducto(tablaMaterial.getNombreParaResurtir());
			AutoCompletion.enable(resurtir.getCampoMaterial());
			
			resurtir.mostrarResurtidos(tablaResurtir.getDatosResurtidos(), tablaResurtir);
			resurtir.getBotonResurtir().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(bandera) {
						try {
							tablaResurtir.resurtirMaterialNuevo(resurtir.registrarResurtir(), materialesAux);
							resurtir.mostrarResurtidos(tablaResurtir.getDatosResurtidos(), tablaResurtir);
							resurtir.buscarProducto(tablaMaterial.getNombreParaResurtir());
							AutoCompletion.enable(resurtir.getCampoMaterial());
							bandera = false;
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						materialesAux.clear();
					}
					else {
						tablaResurtir.resurtirMaterial(resurtir.registrarResurtir());
						resurtir.mostrarResurtidos(tablaResurtir.getDatosResurtidos(), tablaResurtir);
					}
				}
			});
			
			resurtir.getBotonRegistrarMaterial().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					registroEmergente = new RegistrarMaterialEmergente();
					
					registroEmergente.llenarTipoMaterial(tablaMaterial.getTiposMateriales());
					AutoCompletion.enable(registroEmergente.getTipoMaterial());
					
					registroEmergente.llenarMarcaMaterial(tablaMaterial.getMarcaMateriales());
					AutoCompletion.enable(registroEmergente.getMarca());
					
					registroEmergente.llenarUnidadMedida(tablaMaterial.getUnidadMedida());
					AutoCompletion.enable(registroEmergente.getUnidadMedida());
					
					registroEmergente.getButtonRegistrar().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							resurtir.getCampoMaterial().addItem(registroEmergente.registrarNuevoMaterial().getNombreMaterial());
							resurtir.getCampoMaterial().setSelectedItem(registroEmergente.registrarNuevoMaterial().getNombreMaterial());
							materialesAux.add(registroEmergente.registrarNuevoMaterial());
							bandera = true;
							registroEmergente.limpiarVentana();
						}
					});
					registroEmergente.setVisible(true);
				}
			});
			
			resurtir.getBotonCancelar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					resurtir = null;
					menu = null;
					menuLateral();
					repaint();
				}
			});
			
			contentPane.add(resurtir, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void categoriaCita() {
		contentPane.removeAll();
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
		menuLateral();
		repaint();
		
		if(categoriaCit == null) {
			categoriaCit = new CategoriaCita();
			
			categoriaCit.showCategoriaCita();
			
			categoriaCit.getButtonAgendarCita().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					agendarCita();
				}
			});
			
			contentPane.add(categoriaCit, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void agendarCita() {
		contentPane.removeAll();
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		showActivity = null;
		nuevaAct = null;
		menuLateral();
		repaint();
		
		if(agendaCita == null) {
			agendaCita = new AgendarCita();
			
			agendaCita.llenarCliente(tablaPersona.getFiltroCliente());
			AutoCompletion.enable(agendaCita.getCampoCliente());

			agendaCita.llenarArquitecto(tablaPersona.getArquitectosDisponibles(tablaTrabajador.getClavesArquitectos()));
			AutoCompletion.enable(agendaCita.getCampoArquitecto());
			AutoCompletion.enable(agendaCita.getOrientacion());
			
			agendaCita.getButtonBuscarColonia().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					buscarCodigo(3);
				}
			});
			
			agendaCita.getButtonAgendaCita().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					tablaCita.agendarCita(agendaCita.getNuevaCita(), agendaCita.getStatusCita(), agendaCita.getColonia().getText());
					JOptionPane.showMessageDialog(null, "Cita agendada con éxito");
				}
			});
			
			agendaCita.getButtonCancelar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					categoriaCita();
				}
			});
			
			contentPane.add(agendaCita, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void mostrarActividades() {
		contentPane.removeAll();
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
		menuLateral();
		repaint();
		
		if(showActivity == null) {
			showActivity = new ShowActividad();
			
			showActivity.showActividades(tablaActividad.getActividades());
			showActivity.getButtonNuevaActividad().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					nuevaActividad();
				}
			});
			contentPane.add(showActivity, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void nuevaActividad() {
		contentPane.removeAll();
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
		showMaterials = null;
		menuLateral();
		repaint();
		
		if(nuevaAct == null) {
			nuevaAct = new NuevaActividad();
			
			nuevaAct.llenarUnidadMedida(tablaActividad.getUnidadesDeMedida());
			AutoCompletion.enable(nuevaAct.getUnidadMedida());
			
			nuevaAct.getButtonGuardarActividad().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					tablaActividad.guardarActividad(nuevaAct.nuevaActividad());
					JOptionPane.showMessageDialog(null, "Actividad registrada");
					mostrarActividades();
				}
			});
			
			nuevaAct.getButtonCancelar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					mostrarActividades();
				}
			});
			
			contentPane.add(nuevaAct, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void showMateriales(String nombre, String categoria) {
		contentPane.removeAll();
		menu = null;
		contracts = null;
		details = null;
		activities = null;
		trabajadores = null;
		autorizacion = null;
		clausula = null;
		nuevaClausula = null;
		addClause = null;
		nuevoEmpleado = null;
		categoriaEmpleados = null;
		nuevoContrato = null;
		nuevoCliente = null;
		clientes = null;
		categoriaMaterial = null;
		materials = null;
		registraMaterial = null;
		resurtir = null;
		categoriaCit = null;
		agendaCita = null;
		showActivity = null;
		nuevaAct = null;
		showMaterials = null;
		menuLateral();
		repaint();
		
		if(showMaterials == null) {
			showMaterials = new ShowMateriales();
			
			showMaterials.llenarMateriales(tablaMaterial.getDetallesMaterial(nombre.trim()));
			showMaterials.getButtonRegresar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					tipoDeMateriales(categoria.trim());
				}
			});
			
			contentPane.add(showMaterials, BorderLayout.CENTER);
			setVisible(true);
		}
	}
}
