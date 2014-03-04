package globoGym;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.ImageIcon;

public class mainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
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
	public mainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 541);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);

		JMenuItem mntmSkrivUt = new JMenuItem("Skriv Ut");
		mnArkiv.add(mntmSkrivUt);

		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);

		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);

		JMenuItem mntmNyMedlem = new JMenuItem("Ny Medlem");
		mnMedlem.add(mntmNyMedlem);

		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta Medlem");
		mnMedlem.add(mntmHittaMedlem);

		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);

		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);

		JMenuItem mntmOmProgrammet = new JMenuItem("Om Programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 0, 153));
		panel.setBounds(0, 0, 800, 115);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(mainWindow.class.getResource("/imageFIle/logo.png")));
		lblNewLabel_1.setBounds(0, 0, 794, 109);
		panel.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 0, 102));
		panel_1.setBounds(0, 123, 800, 10);
		contentPane.add(panel_1);

		textField = new JTextField();
		textField.setBounds(384, 330, 154, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(384, 360, 154, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(384, 388, 154, 20);
		contentPane.add(textField_2);

		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setBounds(322, 333, 46, 14);
		contentPane.add(lblNamn);

		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(322, 363, 60, 14);
		contentPane.add(lblAdress);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(384, 417, 154, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(620, 330, 154, 20);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(620, 360, 154, 20);
		contentPane.add(textField_5);

		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setBounds(550, 333, 70, 14);
		contentPane.add(lblTelefon);

		JLabel lblEpost = new JLabel("Epost:");
		lblEpost.setBounds(564, 363, 46, 14);
		contentPane.add(lblEpost);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(564, 417, 122, 20);
		contentPane.add(textField_6);

		JLabel lblLaddaUppBild = new JLabel("Ladda upp bild...");
		lblLaddaUppBild.setBounds(564, 401, 122, 14);
		contentPane.add(lblLaddaUppBild);

		JButton btnNewButton = new JButton("Leta...");
		btnNewButton.setBounds(696, 416, 78, 23);
		contentPane.add(btnNewButton);

		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(642, 448, 132, 23);
		contentPane.add(btnSpara);

		JButton btnAvbryt = new JButton("Avbryt");
		btnAvbryt.setBounds(500, 448, 132, 23);
		contentPane.add(btnAvbryt);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(mainWindow.class.getResource("/imageFIle/whiteTrans.png")));
		lblNewLabel.setBounds(0, 133, 372, 394);
		contentPane.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(322, 145, 449, 179);
		contentPane.add(scrollPane);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(mainWindow.class.getResource("/imageFIle/list.png")));
		scrollPane.setViewportView(lblNewLabel_2);


	}
}
