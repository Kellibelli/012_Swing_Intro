import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstWindow extends JFrame {

	
	
	public FirstWindow () {
		super ("I'm VERY special and I'm Kellibelli");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.RED);
		
		JPanel p3 = new JPanel (new GridBagLayout() );
		p3.setBackground(Color.YELLOW);
		
		JPanel p4 = new JPanel();
		p4.setBackground(Color.GREEN);
		
		JPanel p5 = new JPanel(new GridBagLayout());
		p5.setBackground(Color.CYAN);
		
		
		
		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.RED);
		
		JButton b2 = new JButton("Button 2");
		b2.setBackground(Color.GRAY);
		
		JButton b3 = new JButton("Button 3");
		b3.setBackground(Color.PINK);
		
		JButton b4 = new JButton("Button 4");
	
		JButton b5 = new JButton("Button 5");
	
		
		JCheckBox cb1 = new JCheckBox("Do you LOVE bacon?");
		cb1.setBackground(Color.ORANGE);
		
		JCheckBox cb2 = new JCheckBox("Do you LOVE Java?");
		Color myNewColor = new Color (150, 100, 250, 100); // creates your new color
		cb2.setBackground(myNewColor);
		
		JCheckBox cb3 = new JCheckBox("Checkbox");
		
		JCheckBox cb4 = new JCheckBox("Wow another Checkbox");
		
		
		JLabel myLabel = new JLabel("Fancy label!");
		JTextArea myTextArea = new JTextArea("Fancy TextArea!");
		JTextField myTextField = new JTextField("Fancy TextField!");
		JRadioButton rb1 = new JRadioButton("Pie");
		JTextField myTextField2 = new JTextField("Checkbox's are cool");
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15, 15, 15, 15);
		
		// East Panel 1 x 3 (vertical 3 on top of each other)
		// Center Panel 3 x 3
		// West Panel 2 x 3 (2 across, 3 deep) 
		
		p1.add(b1);
		p1.add(b2);
		p2.add(cb1);
		p2.add(cb2);
		p4.add(rb1);
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p3.add(myLabel, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p3.add(myTextArea, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		p3.add(myTextField, gbc);
		
		p5.add(cb3);
		gbc.gridx = 3;
		gbc.gridy = 0;
		p5.add(b3, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p5.add(cb4, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p5.add(myTextField2, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		p3.add(b4, gbc);
		gbc.gridx = 0;
		gbc.gridy = -3;
		p3.add(b5, gbc);
		
		
		add(p1, BorderLayout.NORTH);
		add(p3, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		add(p4, BorderLayout.WEST);
		add(p5, BorderLayout.EAST);
		
		
		
		
		setVisible(true);
	}// end of constructor

	
	
	
	
} // end of FirstWindow class
