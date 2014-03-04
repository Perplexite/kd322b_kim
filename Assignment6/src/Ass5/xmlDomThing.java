package Ass5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;

public class xmlDomThing extends JFrame {

	private JPanel contentPane;
	public JLabel getNameLabel;
	public JLabel codeLabel;
	private JComboBox comboBox_1;
	
	org.w3c.dom.Node node;
	private ArrayList<program> programList = new ArrayList<program>();
	private Document doc;
	private bargraph graph;
	

	/** Parse the XML-file as a DOM */
	private Document openXmlFile(String fileName){
		
		Document doc = null;
		try {
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
		} catch (Exception e){
			e.printStackTrace();
		}
		return doc;
	}
	
	private ArrayList<program> loadAllPrograms(){
		ArrayList<program> output = new ArrayList<program>();
		
	
		NodeList programs = doc.getElementsByTagName("Program");
		for (int i = 0; i< programs.getLength(); i++){
			node = programs.item(i); //Re do every nod in the list to one element
			Element elm = (Element) node;
			
			String name =elm.getElementsByTagName("name").item(0).getTextContent();
			String code = elm.getElementsByTagName("code").item(0).getTextContent();
			int woman = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
			int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
				
			

			program program = new program(name, code, woman ,men);
			output.add(program);

		}
		return output;
	}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xmlDomThing frame = new xmlDomThing();
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
	
	public xmlDomThing() {
		doc = openXmlFile("ht2013_antagning.xml");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//	getNameLabel = new JLabel();
		
		graph = new bargraph();
		graph.setBounds(198, 89, 364, 253);
		contentPane.add(graph);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 39, 568, 12);
		contentPane.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBounds(0, 0, 568, 45);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Stapeldiagram Antagning HT13");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Avenir Next", Font.PLAIN, 25));
		
		programList = loadAllPrograms();
	   comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				program pSelected = (program)comboBox_1.getSelectedItem();
				graph.updateValues(pSelected.getWomen(), pSelected.getMen());
			
			//getNameLabel.setText("Namn: " + pSelected.getName());
			//codeLabel.setText("Kod: " + pSelected.getCode());
				
			}
		});
		comboBox_1.setBounds(10, 52, 558, 40);
		contentPane.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(programList.toArray()));
		
		JLabel lblDetails = new JLabel("Detaljer");
		lblDetails.setFont(new Font("Avenir Next", Font.PLAIN, 13));
		lblDetails.setBounds(20, 104, 292, 16);
		contentPane.add(lblDetails);
		
		final JLabel nameLabel = new JLabel("Namn:");
		nameLabel.setFont(new Font("Avenir Next", Font.PLAIN, 13));
		nameLabel.setBounds(20, 131, 45, 16);
		contentPane.add(nameLabel);
		
		final JLabel codeLabel = new JLabel("Kod:");
		codeLabel.setFont(new Font("Avenir Next", Font.PLAIN, 13));
		codeLabel.setBounds(20, 159, 45, 16);
		contentPane.add(codeLabel);
		
		JLabel getNameLabel = new JLabel("");
		getNameLabel.setBounds(77, 130, 82, 16);
		contentPane.add(getNameLabel);
	
	}
}
