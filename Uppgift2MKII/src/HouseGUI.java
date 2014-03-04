import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;


public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 539);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 12));
		textArea.setBorder(null);
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(10, 333, 299, 97);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(HouseGUI.class.getResource("/images/Untitled-1.jpg")));
		lblNewLabel.setBounds(20, 34, 624, 501);
		contentPane.add(lblNewLabel);
		
		
		House[] aHouse = new House[10]; {
			aHouse[0] = new House(1990, 89);
			aHouse[1] = new House(1948, 134);
			aHouse[2] = new House(1989, 210);
		}
		
		for(int i = 0; i < aHouse.length; i++) {
			
			if (aHouse[i] !=null){
					textArea.append("   This house is built " + aHouse[i].getYear() + ", with an area of " + aHouse[i].getSize() + " m2. \n");
				
			}
		}textArea.append("   There's a total of -" + House.getNbrHouses() + "- houses in the list.");
		
	}
}
