package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Color;
//import java.awt.;

public class calculatorR {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private JRadioButton rdbtnOff;
	private JRadioButton rdbtnOn;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnPlus;
	private JButton btn0;
	private JButton btnMul;
	private JButton btnSub;
	private JButton btn00;
	private JButton btnDivide;
	private JButton btnDot;
	private JButton btnEqual;
	private JButton btnClear;
	private JButton btnBackspace;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorR window = new calculatorR();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculatorR() {
		initialize();
		rdbtnOn.setEnabled(false);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 61, 342, 84);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn1.getText();
				textField.setText(number);
				
				
				
			}
		});
		btn1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btn1.setBounds(10, 156, 72, 56);
		frame.getContentPane().add(btn1);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btn4.setBounds(10, 214, 72, 56);
		frame.getContentPane().add(btn4);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btn7.setBounds(10, 271, 72, 56);
		frame.getContentPane().add(btn7);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
				
			}
		});
		btnPlus.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnPlus.setBounds(10, 327, 72, 56);
		frame.getContentPane().add(btnPlus);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
				
			}
		});
		btnSub.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnSub.setBounds(10, 384, 72, 56);
		frame.getContentPane().add(btnSub);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			
			}
			
		});
		btn2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btn2.setBounds(104, 156, 72, 56);
		frame.getContentPane().add(btn2);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
				
			}
		});
		btn5.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btn5.setBounds(104, 214, 72, 56);
		frame.getContentPane().add(btn5);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
				
			}
		});
		btn8.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btn8.setBounds(104, 271, 72, 56);
		frame.getContentPane().add(btn8);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			
			}
		});
		btn0.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btn0.setBounds(104, 327, 72, 56);
		frame.getContentPane().add(btn0);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
				
			}
		});
		btn00.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btn00.setBounds(104, 384, 72, 56);
		frame.getContentPane().add(btn00);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
				
			}
		});
		btn3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btn3.setBounds(198, 156, 72, 56);
		frame.getContentPane().add(btn3);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
				
			}
		});
		btn6.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btn6.setBounds(198, 214, 72, 56);
		frame.getContentPane().add(btn6);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
				
			}
		});
		btn9.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btn9.setBounds(198, 271, 72, 56);
		frame.getContentPane().add(btn9);
		
		btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				
			}
		});
		btnMul.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnMul.setBounds(198, 327, 72, 56);
		frame.getContentPane().add(btnMul);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
				
			}
		});
		btnDivide.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnDivide.setBounds(198, 384, 72, 56);
		frame.getContentPane().add(btnDivide);
		
		btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
					
		
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 24));
		btnBackspace.setBounds(280, 156, 72, 56);
		frame.getContentPane().add(btnBackspace);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnClear.setBounds(280, 214, 72, 56);
		frame.getContentPane().add(btnClear);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second= Double.parseDouble(textField.getText());
				if(operation=="+") 
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
					
				}
				else if(operation=="-") 
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if(operation=="*") 
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				
				else if(operation=="/") 
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				
				
			}
		});
		btnEqual.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnEqual.setBounds(280, 271, 72, 56);
		frame.getContentPane().add(btnEqual);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnDot.setBounds(280, 327, 72, 56);
		frame.getContentPane().add(btnDot);
		
		rdbtnOn = new JRadioButton("ON");
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnOn.isSelected())
				{
					rdbtnOff.setSelected(false);
				}
				
				enable();//call enable method
			}
		});
		rdbtnOn.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnOn.setForeground(Color.BLUE);
		rdbtnOn.setBounds(276, 394, 88, 23);
		frame.getContentPane().add(rdbtnOn);
		
		rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnOn.isSelected()) {
					rdbtnOn.setSelected(false);
				}
				
				disbale();//call disable method
			}
			
		});
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnOff.setForeground(Color.RED);
		rdbtnOff.setBounds(276, 420, 88, 23);
		frame.getContentPane().add(rdbtnOff);
		
		//label = new Label("");
		//label.setBackground(Color.BLACK);
		//label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		//label.setForeground(Color.RED);
		//label.setAlignment(Label.RIGHT);
		//label.setBounds(10, 10, 342, 40);
		//frame.getContentPane().add(label);
		frame.setBounds(100, 100, 374, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void disbale()
	{
		textField.setEnabled(false);
		rdbtnOn.setEnabled(true);
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn0.setEnabled(false);
		btn00.setEnabled(false);
		btnPlus.setEnabled(false);
		btnSub.setEnabled(false);
		btnMul.setEnabled(false);
		btnDivide.setEnabled(false);
		btnBackspace.setEnabled(false);
		btnClear.setEnabled(false);
		btnDot.setEnabled(false);
		btnEqual.setEnabled(false);
	}
	
	public void enable()
	{
		textField.setEnabled(true);
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btn0.setEnabled(true);
		btn00.setEnabled(true);
		btnPlus.setEnabled(true);
		btnSub.setEnabled(true);
		btnMul.setEnabled(true);
		btnDivide.setEnabled(true);
		btnBackspace.setEnabled(true);
		btnClear.setEnabled(true);
		btnDot.setEnabled(true);
		btnEqual.setEnabled(true);
	}
}
