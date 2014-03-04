import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class djur extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					djur frame = new djur();
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
	
	static Human human;
	
	public djur() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(77, 6, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(77, 34, 134, 28);
		contentPane.add(textField_1);
		
		JButton btnHuman = new JButton("Human");
		btnHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() < 4 ) {
					textField_3.setText("Not enough letters in name.");
				} else {
				human = new Human(textField.getText());
				}
				}
			
		});
		btnHuman.setBounds(209, 7, 117, 29);
		contentPane.add(btnHuman);
		
		JButton btnDog = new JButton("Dog");
		btnDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(human == null) {
					textField.setText("You can't get a dog you whore.");
				} else {
					Dog bucky = new Dog(textField_1.getText());
					human.buyDog(bucky);
				}
			}
		});
		btnDog.setBounds(209, 35, 117, 29);
		contentPane.add(btnDog);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(human.getInfo());
			}
		});
		btnNewButton.setBounds(209, 65, 117, 29);
		contentPane.add(btnNewButton);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(77, 106, 249, 63);
		contentPane.add(horizontalBox);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBounds(77, 189, 249, 63);
		contentPane.add(horizontalBox_1);
		
		textField_3 = new JTextField();
		horizontalBox_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Information");
		lblNewLabel.setBounds(77, 92, 134, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Error message");
		lblNewLabel_1.setBounds(77, 173, 134, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(77, 106, 249, 63);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(6, 12, 61, 16);
		contentPane.add(lblName);
		
		JLabel lblDog = new JLabel("Dog:");
		lblDog.setBounds(6, 40, 61, 16);
		contentPane.add(lblDog);
	}
}
