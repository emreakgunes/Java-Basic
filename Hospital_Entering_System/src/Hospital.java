import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;








public class Hospital extends JFrame implements ActionListener{
	
	// In this step we initialize what we use in our frame
	
	private JLabel lb1 , lb2 , lb3;
	private JButton btn;
	private JTextField txt1;
	private JTextField txt2;
	private JPanel pnl , pnlTwo; 
	private JRadioButton c1, c2, c3;
	private ButtonGroup grp;
	private JComboBox combo;
	
	String[] hospital_dept = {"Neurology" , "Dermatology" , "Cardiology" , "Radiology" , "Pathology" , "Pediatry"};
	
	// We created the constructor method, where we specify the properties of the frame.
	public Hospital() {
		initialize();
		setTitle("Hospital");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400); 
		setLayout(new GridLayout());
		setLocationRelativeTo(null);  // opens our frame in the middle of the screen
		setVisible(true);
		setResizable(false);
		
		
	}

	private void initialize() {
		// we add a panel 
		pnl = new JPanel(new GridLayout(3,2));
		add(pnl);
		
		// we add our buttons labels and textfields to the panel
		lb1 = new JLabel("Enter Your Name: ");
		pnl.add(lb1);
		
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Calibri" , Font.BOLD ,15));
		
		pnl.add(txt1);
		
		lb2 = new JLabel("Enter Your Department: ");
		pnl.add(lb2);
		
		
		combo = new JComboBox(hospital_dept);
		pnl.add(combo);
		

		// for the radiobuttons we create our second panel
		pnlTwo = new JPanel();
		pnl.add(pnlTwo);
		
		
		grp = new ButtonGroup();
		
		c1 = new JRadioButton("Prof Dr.");
		pnlTwo.add(c1);
		
		c2 = new JRadioButton("Associate Prof");
		pnlTwo.add(c2);
		
		c3 = new JRadioButton("Specialist");
		pnlTwo.add(c3);
		
		
		// For the choose one of our radiobuttons we make them group by ButtonGroup
		grp.add(c1);
		grp.add(c2);
		grp.add(c3);
		
		
	
		
		
		
		
		btn = new JButton("Submit");
		pnl.add(btn);	
		
		
		// we added functionality to our buttons
		btn.addActionListener(this);
		
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		
		combo.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hospital();  // We call our object in the main to see in the screen
	}
	
	
	// This part is the part of determining which button will do what.
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		if(e.getSource() == btn) {
			lb1.setText(txt1.getText());
		
			lb2.setText((String) combo.getSelectedItem());
			
			
			String selc = null;
			if(c1.isSelected()) {
				selc = "Proffessor";
			}else if (c2.isSelected()) {
				selc = "Associate Prof";
			}else if (c3.isSelected()) {
				selc = "Specialist";
			}
			
			// This is the welcoming message when we click the submit button 
			JOptionPane.showMessageDialog(null, "Hello Dear "  + selc + " " +txt1.getText() + "\nWelcome to the " + combo.getSelectedItem() + " Department", "Doctor Entering Screen", 2);
			
		}
		
		
	}
		
	}
