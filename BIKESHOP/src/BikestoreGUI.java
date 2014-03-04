import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class BikestoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Bikestore store;
	private JTextArea textArea;
	private JButton btnAddBike;
	private JLabel lblColor;
	private JLabel lblSize;
	private JLabel lblPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikestoreGUI frame = new BikestoreGUI();
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
	public BikestoreGUI() {
		store = new Bikestore();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	  
		
		textField = new JTextField();
		textField.setBounds(66, 25, 194, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(66, 52, 194, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(66, 81, 194, 28);
		contentPane.add(textField_2);
		
		textArea = new JTextArea();
		textArea.setBounds(66, 119, 317, 138);
		contentPane.add(textArea);
		
		
		/**JButton adds colour, size and price to textArea*/
		  btnAddBike = new JButton("Add Bike");
			btnAddBike.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					store.addBikes(textField.getText(),Integer.parseInt(textField_1.getText()),Integer.parseInt(textField_2.getText()));
					textArea.setText(store.getAllBikes());
				}
			});
			
			btnAddBike.setBounds(266, 82, 117, 29);
			contentPane.add(btnAddBike);
			
			lblColor = new JLabel("Color:");
			lblColor.setBounds(16, 31, 61, 16);
			contentPane.add(lblColor);
			
			lblSize = new JLabel("Size:");
			lblSize.setBounds(6, 58, 61, 16);
			contentPane.add(lblSize);
			
			lblPrice = new JLabel("Price:");
			lblPrice.setBounds(6, 87, 61, 16);
			contentPane.add(lblPrice);
	}
}
