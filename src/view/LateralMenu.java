package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class LateralMenu extends JPanel {
	private JButton buttonAddPhoto;
	private JButton buttonProjects;
	private JButton buttonEmployees;
	private JButton buttonClients;
	private JButton buttonAppoiment;
	private JButton buttonMaterials;
	private JButton buttonBuyMoreMaterials;
	private JButton buttonActivities;
	private JButton buttonPay;
	private JButton buttonTime;

	public LateralMenu() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		buttonAddPhoto = new JButton("");
		buttonAddPhoto.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_add_a_photo_black_18dp.png"));
		buttonAddPhoto.setContentAreaFilled(false);
		buttonAddPhoto.setBorderPainted(false);
		buttonAddPhoto.setBackground(Color.WHITE);
		buttonAddPhoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(buttonAddPhoto);
		
		JLabel label_2 = new JLabel("Alejandra Colín Jiménez");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Arquitecta");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.GRAY);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(label_3);
		
		buttonProjects = new JButton("Proyectos");
		buttonProjects.setHorizontalAlignment(SwingConstants.LEFT);
		buttonProjects.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonProjects.setContentAreaFilled(false);
		buttonProjects.setBorderPainted(false);
		buttonProjects.setBackground(Color.WHITE);
		buttonProjects.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_folder_black_18dp.png"));
		buttonProjects.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(buttonProjects);
		
		buttonEmployees = new JButton("Empleados");
		buttonEmployees.setHorizontalAlignment(SwingConstants.LEFT);
		buttonEmployees.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\round_person_black_18dp.png"));
		buttonEmployees.setContentAreaFilled(false);
		buttonEmployees.setBorderPainted(false);
		buttonEmployees.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonEmployees.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(buttonEmployees);
		
		buttonClients = new JButton("Clientes");
		buttonClients.setHorizontalAlignment(SwingConstants.LEFT);
		buttonClients.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_supervisor_account_black_18dp.png"));
		buttonClients.setContentAreaFilled(false);
		buttonClients.setBorderPainted(false);
		buttonClients.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonClients.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(buttonClients);
		
		buttonAppoiment = new JButton("Citas");
		buttonAppoiment.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_calendar_today_black_18dp.png"));
		buttonAppoiment.setHorizontalAlignment(SwingConstants.LEFT);
		buttonAppoiment.setContentAreaFilled(false);
		buttonAppoiment.setBorderPainted(false);
		buttonAppoiment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonAppoiment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(buttonAppoiment);
		
		buttonMaterials = new JButton("Materiales");
		buttonMaterials.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_build_black_18dp.png"));
		buttonMaterials.setContentAreaFilled(false);
		buttonMaterials.setBorderPainted(false);
		buttonMaterials.setHorizontalAlignment(SwingConstants.LEFT);
		buttonMaterials.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonMaterials.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(buttonMaterials);
		
		buttonBuyMoreMaterials = new JButton("Resurtir");
		buttonBuyMoreMaterials.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_add_shopping_cart_black_18dp.png"));
		buttonBuyMoreMaterials.setHorizontalAlignment(SwingConstants.LEFT);
		buttonBuyMoreMaterials.setContentAreaFilled(false);
		buttonBuyMoreMaterials.setBorderPainted(false);
		buttonBuyMoreMaterials.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonBuyMoreMaterials.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(buttonBuyMoreMaterials);
		
		buttonActivities = new JButton("Actividades");
		buttonActivities.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_work_black_18dp.png"));
		buttonActivities.setContentAreaFilled(false);
		buttonActivities.setBorderPainted(false);
		buttonActivities.setHorizontalAlignment(SwingConstants.LEFT);
		buttonActivities.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonActivities.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(buttonActivities);
		
		buttonPay = new JButton("Pagos");
		buttonPay.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_attach_money_black_18dp.png"));
		buttonPay.setContentAreaFilled(false);
		buttonPay.setBorderPainted(false);
		buttonPay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonPay.setHorizontalAlignment(SwingConstants.LEFT);
		buttonPay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(buttonPay);
		
		buttonTime = new JButton("Horarios");
		buttonTime.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_access_time_black_18dp.png"));
		buttonTime.setContentAreaFilled(false);
		buttonTime.setBorderPainted(false);
		buttonTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonTime.setHorizontalAlignment(SwingConstants.LEFT);
		buttonTime.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(buttonTime);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
	}
	
	public JButton getButtonAddPhoto() {
		return buttonAddPhoto;
	}
	
	public JButton getButtonProjects() {
		return buttonProjects;
	}
	
	public JButton getButtonEmployees() {
		return buttonEmployees;
	}
	
	public JButton getButtonClients() {
		return buttonClients;
	}
	
	public JButton getButtonAppoiment() {
		return buttonAppoiment;
	}
	
	public JButton getButtonMaterials() {
		return buttonMaterials;
	}
	
	public JButton getButtonBuyMoreMaterials() {
		return buttonBuyMoreMaterials;
	}
	
	public JButton getButtonActivities() {
		return buttonActivities;
	}
	
	public JButton getButtonPay() {
		return buttonPay;
	}
	
	public JButton getButtonTime() {
		return buttonTime;
	}
}