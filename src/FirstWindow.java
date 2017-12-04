import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstWindow extends JFrame {

	
	
	public FirstWindow () {
		super ("I'm VERY special and I'm Kellibelli");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.RED);
		
		JPanel p3 = new JPanel (new GridBagLayout() );
		p3.setBackground(Color.YELLOW);
		
		JPanel p4 = new JPanel();
		p4.setBackground(Color.GREEN);
		
		JPanel p5 = new JPanel();
		p5.setBackground(Color.CYAN);
		
		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.RED);
		
		JButton b2 = new JButton("Button 2");
		b2.setBackground(Color.GRAY);
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15, 15, 15, 15);
		
		p1.add(b1);
		p1.add(b2);
		
		
		add(p1, BorderLayout.NORTH);
		add(p3, BorderLayout.CENTER);
		add(p2, BorderLayout.EAST);
		add(p4, BorderLayout.WEST);
		add(p5, BorderLayout.SOUTH);
		
		
		
		setVisible(true);
	}// end of constructor

	
	
	
	
} // end of FirstWindow class
