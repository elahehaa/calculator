package calculator_app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;




public class Calculator extends JFrame {
	
	double num , ans ;
	int calculation;
	
	
	
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setType(Type.UTILITY);
		setTitle("calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 259, 320);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(36, 23, 190, 35);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(183, 6, 61, 16);
		contentPane.add(lblNewLabel);
		
		
		JButton btnNewButton = new JButton("<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textArea.getText().length();
				int number = textArea.getText().length() -1;
				String store;
				
				if(length>0)
				{
					StringBuilder back = new StringBuilder(textArea.getText());
					back.deleteCharAt(number);
					store = back.toString();
					textArea.setText(store);
				}
				
			}
		});
		btnNewButton.setBounds(64, 67, 51, 35);
		contentPane.add(btnNewButton);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
			}
		});
		btnC.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnC.setBounds(130, 67, 51, 35);
		contentPane.add(btnC);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textArea.setText(textArea.getText() + "+");
				num = Double.parseDouble(textArea.getText());
				calculation = 1;
				textArea.setText("");
				lblNewLabel.setText(num + "+");
			}
		});
		button.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button.setBounds(193, 67, 51, 35);
		contentPane.add(button);
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "7");
			}
		});
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_1.setBounds(6, 114, 51, 35);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "8");
			}
		});
		button_2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_2.setBounds(64, 114, 51, 35);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "9");
			}
		});
		button_3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_3.setBounds(130, 114, 51, 35);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textArea.setText(textArea.getText() + "-");
				num = Double.parseDouble(textArea.getText());
				calculation = 2;
				textArea.setText("");
				lblNewLabel.setText(num + "-");
			}
		});
		button_4.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_4.setBounds(193, 114, 51, 35);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "4");
			}
		});
		button_5.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_5.setBounds(6, 161, 51, 35);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "5");
			}
		});
		button_6.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_6.setBounds(64, 161, 51, 35);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "6");
			}
		});
		button_7.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_7.setBounds(130, 161, 51, 35);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "1");
			}
		});
		button_8.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_8.setBounds(6, 208, 51, 35);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("2");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "2");
			}
		});
		button_9.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_9.setBounds(64, 208, 51, 35);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("3");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "3");
			}
		});
		button_10.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_10.setBounds(130, 208, 51, 35);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "0");
			}
		});
		button_11.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_11.setBounds(6, 255, 51, 35);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton(".");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + ".");
			}
		});
		button_12.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_12.setBounds(64, 255, 51, 35);
		contentPane.add(button_12);
		
		JButton button_14 = new JButton("*");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textArea.setText(textArea.getText() + "*");
				num = Double.parseDouble(textArea.getText());
				calculation = 3;
				textArea.setText("");
				lblNewLabel.setText(num + "*");
			}
		});
		button_14.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_14.setBounds(193, 161, 51, 35);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textArea.setText(textArea.getText() + "/");
				num = Double.parseDouble(textArea.getText());
				calculation = 4;
				textArea.setText("");
				lblNewLabel.setText(num + "/");
			}
		});
		button_15.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_15.setBounds(193, 208, 51, 35);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("=");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch(calculation)
				{
				case 1: 
					ans = num + Double.parseDouble( textArea.getText());
					textArea.setText(Double.toString(ans));
					break;
					
				case 2: 
					ans = num - Double.parseDouble( textArea.getText());
					textArea.setText(Double.toString(ans));
					break;
					
				case 3: 
					ans = num * Double.parseDouble( textArea.getText());
					textArea.setText(Double.toString(ans));
					break;
					
				case 4: 
					ans = num / Double.parseDouble( textArea.getText());
					textArea.setText(Double.toString(ans));
					break;
				}
				
				lblNewLabel.setText("");
				//textArea.setText(textArea.getText() + "=");
			}
		});
		
		
			
					
			
		
		
		
		
		
		button_16.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		button_16.setBounds(128, 255, 116, 35);
		contentPane.add(button_16);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		//rdbtnOff.setEnabled(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setEnabled(false);
				//rdbtnNewRadioButton.setEnabled(true);
				//rdbtnOff.setEnabled(false);
				button_1.setEnabled(false);
				button_2.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
				button_6.setEnabled(false);
				button_7.setEnabled(false);
				button_8.setEnabled(false);
				button_9.setEnabled(false);
				button_10.setEnabled(false);
				button_11.setEnabled(false);
				button_12.setEnabled(false);
				button_14.setEnabled(false);
				button_15.setEnabled(false);
				button_16.setEnabled(false);
				btnC.setEnabled(false);
				btnNewButton.setEnabled(false);
				button.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBounds(6, 79, 57, 23);
		contentPane.add(rdbtnOff);
		
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setEnabled(true);
				//rdbtnNewRadioButton.setEnabled(false);
				
				button_1.setEnabled(true);
				button_2.setEnabled(true);
				button_3.setEnabled(true);
				button_4.setEnabled(true);
				button_5.setEnabled(true);
				button_6.setEnabled(true);
				button_7.setEnabled(true);
				button_8.setEnabled(true);
				button_9.setEnabled(true);
				button_10.setEnabled(true);
				button_11.setEnabled(true);
				button_12.setEnabled(true);
				button_14.setEnabled(true);
				button_15.setEnabled(true);
				button_16.setEnabled(true);
				btnC.setEnabled(true);
				btnNewButton.setEnabled(true);
				button.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 55, 57, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		
				

		
			    
		
		

		
				
		
	}
	
	
	
	
}


