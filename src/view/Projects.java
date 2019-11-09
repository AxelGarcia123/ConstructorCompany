package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

@SuppressWarnings("serial")
public class Projects extends JPanel implements ActionListener{
	private JButton buttonAddNewProject;
	private JPanel panel;
	private List<JButton> projectFolders;
	private int counter = 0;
	
	public Projects() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		projectFolders = new ArrayList<JButton>();
		
		panel = new JPanel();
		FlowLayout fl_panel = (FlowLayout) panel.getLayout();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.NORTH);
		
		JLabel lblCategoras = new JLabel("Categorías");
		lblCategoras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCategoras.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblCategoras);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.SOUTH);
		
		buttonAddNewProject = new JButton("Add new project");
		buttonAddNewProject.addActionListener(this);
		panel_2.add(buttonAddNewProject);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonAddNewProject) {
//			JPanel panel_3 = new JPanel();
//			panel_3.setBackground(Color.WHITE);
//			panel.add(panel_3);
//			panel_3.setLayout(new GridLayout(0, 1, 0, 0));
			
			JButton buttonFolders = new JButton("");
			buttonFolders.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_folder_black_18dp.png"));
			buttonFolders.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			buttonFolders.setContentAreaFilled(false);
			buttonFolders.setBorderPainted(false);
			
//			JLabel foldersDescription = new JLabel("Construcciones");
//			foldersDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
//			foldersDescription.setHorizontalAlignment(SwingConstants.CENTER);
//			panel_3.add(foldersDescription);
			
			projectFolders.add(buttonFolders);
			panel.add(buttonFolders);			
//			for (JButton buttons : projectFolders) {
//				buttons.addActionListener(new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						JOptionPane.showMessageDialog(null, "Sí pasa por aquí");
//						counter++;
//						System.out.println(counter);
//					}
//				});
//				panel.add(buttons);
//				panel.setVisible(true);
//			}
		}
	}
	
	public List<JButton> getButtons() {
		return projectFolders;
	}
}
