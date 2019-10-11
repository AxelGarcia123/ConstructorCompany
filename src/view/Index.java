package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Index extends JPanel {
	private JButton buttonAddPhoto;
	private JButton buttonEmployees;
	private JButton buttonClients;
	private JButton buttonContracts;
	private JButton buttonScheduleAppointment;
	private JButton buttonAppoiment;
	private JButton buttonMaterials;
	private JButton buttonBuyMoreMaterials;
	private JButton buttonActivities;
	private JButton buttonPay;
	private JButton buttonTime;
	private JButton buttonProjects;

	public Index() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(45, 0, 255));
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblMenu = new JLabel("");
		lblMenu.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_menu_white_18dp.png"));
		panel.add(lblMenu);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		buttonAddPhoto = new JButton("");
		buttonAddPhoto.setBackground(Color.WHITE);
		buttonAddPhoto.setContentAreaFilled(false);
		buttonAddPhoto.setBorderPainted(false);
		buttonAddPhoto.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_add_a_photo_black_18dp.png"));
		buttonAddPhoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_3.add(buttonAddPhoto);
		
		JLabel lblNewLabel = new JLabel("Alejandra Colín Jiménez");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel);
		
		JLabel lblArquitecta = new JLabel("Arquitecta");
		lblArquitecta.setForeground(Color.GRAY);
		lblArquitecta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblArquitecta.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblArquitecta);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		buttonProjects = new JButton("Proyectos");
		buttonProjects.setHorizontalAlignment(SwingConstants.LEFT);
		buttonProjects.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonProjects.setContentAreaFilled(false);
		buttonProjects.setBorderPainted(false);
		buttonProjects.setBackground(Color.WHITE);
		buttonProjects.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_folder_black_18dp.png"));
		buttonProjects.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonProjects);
		
		buttonEmployees = new JButton("Empleados");
		buttonEmployees.setHorizontalAlignment(SwingConstants.LEFT);
		buttonEmployees.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\round_person_black_18dp.png"));
		buttonEmployees.setContentAreaFilled(false);
		buttonEmployees.setBorderPainted(false);
		buttonEmployees.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonEmployees.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonEmployees);
		
		buttonClients = new JButton("Clientes");
		buttonClients.setHorizontalAlignment(SwingConstants.LEFT);
		buttonClients.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_supervisor_account_black_18dp.png"));
		buttonClients.setContentAreaFilled(false);
		buttonClients.setBorderPainted(false);
		buttonClients.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonClients.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonClients);
		
		buttonContracts = new JButton("Contratos");
		buttonContracts.setHorizontalAlignment(SwingConstants.LEFT);
		buttonContracts.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_description_black_18dp.png"));
		buttonContracts.setContentAreaFilled(false);
		buttonContracts.setBorderPainted(false);
		buttonContracts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(buttonContracts);
		
		buttonScheduleAppointment = new JButton("Agendar cita");
		buttonScheduleAppointment.setHorizontalAlignment(SwingConstants.LEFT);
		buttonScheduleAppointment.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_post_add_black_18dp.png"));
		buttonScheduleAppointment.setContentAreaFilled(false);
		buttonScheduleAppointment.setBorderPainted(false);
		buttonScheduleAppointment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonScheduleAppointment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonScheduleAppointment);
		
		buttonAppoiment = new JButton("Citas");
		buttonAppoiment.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_calendar_today_black_18dp.png"));
		buttonAppoiment.setHorizontalAlignment(SwingConstants.LEFT);
		buttonAppoiment.setContentAreaFilled(false);
		buttonAppoiment.setBorderPainted(false);
		buttonAppoiment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(buttonAppoiment);
		
		buttonMaterials = new JButton("Materiales");
		buttonMaterials.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_build_black_18dp.png"));
		buttonMaterials.setContentAreaFilled(false);
		buttonMaterials.setBorderPainted(false);
		buttonMaterials.setHorizontalAlignment(SwingConstants.LEFT);
		buttonMaterials.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonMaterials.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonMaterials);
		
		buttonBuyMoreMaterials = new JButton("Resurtir");
		buttonBuyMoreMaterials.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_add_shopping_cart_black_18dp.png"));
		buttonBuyMoreMaterials.setHorizontalAlignment(SwingConstants.LEFT);
		buttonBuyMoreMaterials.setContentAreaFilled(false);
		buttonBuyMoreMaterials.setBorderPainted(false);
		buttonBuyMoreMaterials.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonBuyMoreMaterials.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonBuyMoreMaterials);
		
		buttonActivities = new JButton("Actividades");
		buttonActivities.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_work_black_18dp.png"));
		buttonActivities.setContentAreaFilled(false);
		buttonActivities.setBorderPainted(false);
		buttonActivities.setHorizontalAlignment(SwingConstants.LEFT);
		buttonActivities.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonActivities.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonActivities);
		
		buttonPay = new JButton("Pagos");
		buttonPay.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_attach_money_black_18dp.png"));
		buttonPay.setContentAreaFilled(false);
		buttonPay.setBorderPainted(false);
		buttonPay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonPay.setHorizontalAlignment(SwingConstants.LEFT);
		buttonPay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonPay);
		
		buttonTime = new JButton("Horarios");
		buttonTime.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_access_time_black_18dp.png"));
		buttonTime.setContentAreaFilled(false);
		buttonTime.setBorderPainted(false);
		buttonTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonTime.setHorizontalAlignment(SwingConstants.LEFT);
		buttonTime.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.add(buttonTime);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.CENTER);
		
	}
}