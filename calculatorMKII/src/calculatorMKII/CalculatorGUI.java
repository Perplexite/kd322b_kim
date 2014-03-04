package calculatorMKII;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Calculator calc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	
	
	
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 618, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		textField = new JTextField();
		textField.setFont(new Font("Cordia New", Font.PLAIN, 99));
		textField.setBounds(0, 0, 599, 145);
		contentPane.add(textField);
		textField.setColumns(10);
		
		calc = new Calculator();
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.numberButtonPressed(0);
				updateTextField();
				
				
			}
		});
		btnNewButton.setFont(new Font("Cordia New", Font.PLAIN, 99));
		btnNewButton.setBounds(0, 504, 240, 120);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.numberButtonPressed(1);
				updateTextField();
			}
		});
		button.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button.setBounds(-1, 385, 120, 120);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.numberButtonPressed(2);
				updateTextField();
				
				
			}
		});
		button_1.setBounds(119, 385, 120, 120);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.numberButtonPressed(3);
				updateTextField();
				
			}
		});
		button_2.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_2.setBounds(239, 385, 120, 120);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.numberButtonPressed(6);
				updateTextField();
				
			}
		});
		button_3.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_3.setBounds(239, 265, 120, 120);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				calc.numberButtonPressed(4);
				updateTextField();
			}
		});
		button_4.setBounds(-1, 265, 120, 120);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.numberButtonPressed(5);
				updateTextField();
				
			}
		});
		button_5.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_5.setBounds(119, 265, 120, 120);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton(".");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_6.setBounds(239, 504, 120, 120);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.numberButtonPressed(7);
				updateTextField();
					
			}
		});
		button_7.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_7.setBounds(0, 145, 120, 120);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				calc.numberButtonPressed(8);
				updateTextField();
			
			}
		});
		button_8.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_8.setBounds(119, 145, 120, 120);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.numberButtonPressed(9);
				updateTextField();
				
			}
		});
		button_9.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_9.setBounds(239, 145, 120, 120);
		contentPane.add(button_9);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				calc.clear();
				updateTextField();
			
			}
		});
		btnC.setForeground(Color.DARK_GRAY);
		btnC.setFont(new Font("Cordia New", Font.PLAIN, 99));
		btnC.setBounds(359, 145, 240, 120);
		contentPane.add(btnC);
		
		JButton button_11 = new JButton("%");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_11.setForeground(Color.DARK_GRAY);
		button_11.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_11.setBounds(359, 265, 120, 120);
		contentPane.add(button_11);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.mult();
				updateTextField();
				
			}
		});
		btnX.setForeground(Color.DARK_GRAY);
		btnX.setFont(new Font("Cordia New", Font.PLAIN, 99));
		btnX.setBounds(479, 265, 120, 120);
		contentPane.add(btnX);
		
		JButton button_13 = new JButton("+");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.plus();
				updateTextField();
				
			}
		});
		button_13.setForeground(Color.DARK_GRAY);
		button_13.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_13.setBounds(359, 385, 120, 120);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.minus();
				updateTextField();
			}
		});
		button_14.setForeground(Color.DARK_GRAY);
		button_14.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_14.setBounds(359, 504, 120, 120);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.equals();
				updateTextField();
			}
		});
		button_15.setForeground(Color.DARK_GRAY);
		button_15.setFont(new Font("Cordia New", Font.PLAIN, 99));
		button_15.setBounds(479, 385, 120, 240);
		contentPane.add(button_15);
	}

public void updateTextField(){
	textField.validate();
	textField.setText(calc.getResult() + "" + calc.getOperator()+ "" + calc.getOperand());
	
}

}
