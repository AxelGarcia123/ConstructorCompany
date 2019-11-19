package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.font.TextAttribute;
import java.sql.Date;
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
import baseDeDatos.TablaCliente;
import baseDeDatos.TablaContrato;
import baseDeDatos.TablaContratoTrabajador;
import baseDeDatos.TablaStatusContrato;
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
	private Projects projects;
	private LateralMenu menu;
	private Contracts contracts;
	private ProjectDetails details;
	private int iterator = 0;
	private JLabel forgotPassword;
	private TablaContrato tablaContrato;
	private TablaCliente tablaCliente;
	private TablaStatusContrato tablaStatus;
	private TablaContratoTrabajador tablaTrabajador;

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
		menuLateral();
		repaint();
		
		if(projects == null) {
			projects = new Projects();
			projects.showProjectFolders(tablaContrato.getContratos());
			projects.getProyecto().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					iterator = projects.getCounter();
					String carpeta = projects.getTipos().get(projects.getTipos().size() - iterator).getText();
					if(iterator != 0) {
						listOfContracts(carpeta.trim());
					}
					else
						JOptionPane.showMessageDialog(null, "Elige una carpeta");
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
		menuLateral();
		repaint();
		if(contracts == null) {
			contracts = new Contracts();

			contracts.showProjectContracts(tablaContrato.getFecha(carpeta), tablaCliente.getCliente(carpeta));
			contracts.getContrato().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					iterator = contracts.getCounter();
					String cliente = contracts.getNombres().get(contracts.getNombres().size() - iterator).getText();
					
					if(iterator != 0 && cliente.length() != 0) {
						String nombre = tablaCliente.getCliente(carpeta).get(contracts.getNombres().size() - iterator).getNombrePer();
						String paterno = tablaCliente.getCliente(carpeta).get(contracts.getNombres().size() - iterator).getApellidoPaternoPer();
						String materno = tablaCliente.getCliente(carpeta).get(contracts.getNombres().size() - iterator).getApellidoMaternoPer();
						Date fecha = tablaContrato.getFecha(carpeta).get(contracts.getFechas().size() - iterator).getFechaInicioContrato();
						int clave = tablaCliente.getCliente(carpeta).get(contracts.getNombres().size() - iterator).getClavePer();
						detailsContract(nombre, paterno, materno, fecha, clave, cliente);
					}
					else
						JOptionPane.showMessageDialog(null, "Elige una carpeta");
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
		menuLateral();
		repaint();
		
		if(details == null) {
			details = new ProjectDetails();

			Contrato contract = tablaContrato.getDetailsProject(nombre, paterno, materno, fecha, clave);
			String arquitecto = String.valueOf(tablaTrabajador.getArquitecto(contract.getClaveTrabajador()));
			details.showDetailsProyect(contract, tablaStatus.getStatus(contract.getClaveContrato()), cliente, arquitecto);

			contentPane.add(details, BorderLayout.CENTER);
			setVisible(true);
		}
	}
}
