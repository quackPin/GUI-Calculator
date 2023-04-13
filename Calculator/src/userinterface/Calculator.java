package userinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	Double firstNum;
	Double secondNum;
	Double calResult;
	String operator;
	String answer;

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
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField.setColumns(10);
		
		JPanel buttonPanel = new JPanel();
		
		JButton button = new JButton("New button");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(buttonPanel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 354, Short.MAX_VALUE)
						.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(buttonPanel, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(button)
							.addGap(35))))
		);
		buttonPanel.setLayout(new GridLayout(5, 4, 0, 0));
		
		JButton allErase = new JButton("E");
		allErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		buttonPanel.add(allErase);
		
		JButton delete = new JButton("DEL");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String deleteString = null;
				
				if(textField.getText().length() >0) {
					
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					
					deleteString = str.toString();
					textField.setText(deleteString);
				}
			}
		});
		buttonPanel.add(delete);
		
		JButton erase = new JButton("C");
		erase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		buttonPanel.add(erase);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		buttonPanel.add(plus);
		
		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+num1.getText();
				textField.setText(number);
			}
		});
		buttonPanel.add(num1);
		
		JButton num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+num2.getText();
				textField.setText(number);
			}
		});
		buttonPanel.add(num2);
		
		JButton num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+num3.getText();
				textField.setText(number);
			}
		});
		buttonPanel.add(num3);
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		buttonPanel.add(sub);
		
		JButton num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+num4.getText();
				textField.setText(number);
			}
		});
		buttonPanel.add(num4);
		
		JButton num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+num5.getText();
				textField.setText(number);
			}
		});
		buttonPanel.add(num5);
		
		JButton num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+num6.getText();
				textField.setText(number);
			}
		});
		buttonPanel.add(num6);
		
		JButton multi = new JButton("*");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		buttonPanel.add(multi);
		
		JButton num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+num7.getText();
				textField.setText(number);
			}
		});
		buttonPanel.add(num7);
		
		JButton num8 = new JButton("8");
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+num8.getText();
				textField.setText(number);
			}
		});
		buttonPanel.add(num8);
		
		JButton num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+num9.getText();
				textField.setText(number);
			}
		});
		buttonPanel.add(num9);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		buttonPanel.add(div);
		
		JButton point = new JButton(".");
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+point.getText();
				textField.setText(number);
			}
		});
		buttonPanel.add(point);
		
		JButton num0 = new JButton("0");
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+num0.getText();
				textField.setText(number);
			}
		});
		buttonPanel.add(num0);
		
		JButton result = new JButton("=");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(textField.getText());
				
				if(operator == "+") {
					calResult = firstNum + secondNum ;
					answer = String.format("%.2f", calResult); // return with 2 digit decimal number (2+3 = 5.00)
					
				// if there has not any decimal number then it will return value without decimal number. (2+3 = 5,2.1+3.1 = 5.2)
					String answerStr = answer.substring(answer.lastIndexOf(".")+1);
					int newAnswer = Integer.parseInt(answerStr);
					if(newAnswer > 0) {
						textField.setText(answer);
					}else {
						String[] nextAnswer = answer.split("\\.");
						textField.setText(nextAnswer[0]);
					}
					
				}else if(operator == "-") {
					calResult = firstNum - secondNum ;
					answer = String.format("%.2f", calResult);
					
					// if there has not any decimal number then it will return value without decimal number.
					String answerStr = answer.substring(answer.lastIndexOf(".")+1);
					int newAnswer = Integer.parseInt(answerStr);
					if(newAnswer > 0) {
						textField.setText(answer);
					}else {
						String[] nextAnswer = answer.split("\\.");
						textField.setText(nextAnswer[0]);
					}
				}else if(operator == "*") {
					calResult = firstNum * secondNum ;
					answer = String.format("%.2f", calResult);
					
					// if there has not any decimal number then it will return value without decimal number.
					String answerStr = answer.substring(answer.lastIndexOf(".")+1);
					int newAnswer = Integer.parseInt(answerStr);
					if(newAnswer > 0) {
						textField.setText(answer);
					}else {
						String[] nextAnswer = answer.split("\\.");
						textField.setText(nextAnswer[0]);
					}
				}else if(operator == "/") {
					calResult = firstNum / secondNum ;
					answer = String.format("%.2f", calResult);
					
					// if there has not any decimal number then it will return value without decimal number.
					String answerStr = answer.substring(answer.lastIndexOf(".")+1);
					int newAnswer = Integer.parseInt(answerStr);
					if(newAnswer > 0) {
						textField.setText(answer);
					}else {
						String[] nextAnswer = answer.split("\\.");
						textField.setText(nextAnswer[0]);
					}
				}else if(operator == "%") {
					calResult = firstNum * secondNum / 100 ;
					answer = String.format("%.2f", calResult);
					
					// if there has not any decimal number then it will return value without decimal number.
					String answerStr = answer.substring(answer.lastIndexOf(".")+1);
					int newAnswer = Integer.parseInt(answerStr);
					if(newAnswer > 0) {
						textField.setText(answer);
					}else {
						String[] nextAnswer = answer.split("\\.");
						textField.setText(nextAnswer[0]);
					}
				}
				
			}
		});
		buttonPanel.add(result);
		
		JButton percent = new JButton("%");
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		buttonPanel.add(percent);
		contentPane.setLayout(gl_contentPane);
	}
}
