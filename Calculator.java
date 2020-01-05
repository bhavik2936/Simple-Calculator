package advJavaPract1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	private double answer;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		answer = 0;

		initialize();
	}

	private double evaluateEquation() {
		String eq = textField_2.getText();
		double num3 = 0;

		if (!eq.equals("")) {

			double num1 = Double.parseDouble(textField_1.getText());
			double num2 = Double.parseDouble(textField.getText());

			switch (eq) {
			case "+":
				num3 = num1 + num2;
				break;
			case "-":
				num3 = num1 - num2;
				break;
			case "×":
				num3 = num1 * num2;
				break;
			case "÷":
				num3 = num1 / num2;
				break;
			case "=":
				num3 = num2;
//			default:
//				break;
			}
		}
		return num3;
	}

	private void initialize() {
		frame = new JFrame("Simple Calculator");
		frame.setBounds(100, 100, 340, 310);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField_2 = new JTextField();
		textField_2.setDisabledTextColor(SystemColor.infoText);
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setBorder(null);
		textField_2.setBackground(SystemColor.textHighlightText);
		textField_2.setBounds(15, 38, 304, 36);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBackground(SystemColor.textHighlightText);
		textField_1.setEditable(false);
		textField_1.setBorder(null);
		textField_1.setBounds(15, 16, 304, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField = new JTextField();
		textField.setText("0");
		textField.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBorder(null);
		textField.setBounds(15, 70, 304, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPane.setEditable(false);
		editorPane.setBounds(10, 11, 314, 95);
		frame.getContentPane().add(editorPane);

		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = null;
				if (textField.getText().equals("0") || textField.getText().equals("0.0"))
					str = "9";
				else
					str = textField.getText() + "9";
				textField.setText(str);
			}
		});
		button_3.setBounds(176, 124, 63, 28);
		frame.getContentPane().add(button_3);

		JButton button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = null;
				if (textField.getText().equals("0") || textField.getText().equals("0.0"))
					str = "8";
				else
					str = textField.getText() + "8";
				textField.setText(str);
			}
		});
		button_1.setBounds(93, 124, 63, 28);
		frame.getContentPane().add(button_1);

		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = null;
				if (textField.getText().equals("0") || textField.getText().equals("0.0"))
					str = "7";
				else
					str = textField.getText() + "7";
				textField.setText(str);
			}
		});
		button.setBounds(10, 124, 63, 28);
		frame.getContentPane().add(button);

		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = null;
				if (textField.getText().equals("0") || textField.getText().equals("0.0"))
					str = "6";
				else
					str = textField.getText() + "6";
				textField.setText(str);
			}
		});
		button_5.setBounds(176, 163, 63, 28);
		frame.getContentPane().add(button_5);

		JButton button_2 = new JButton("5");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = null;
				if (textField.getText().equals("0") || textField.getText().equals("0.0"))
					str = "5";
				else
					str = textField.getText() + "5";
				textField.setText(str);
			}
		});
		button_2.setBounds(93, 163, 63, 28);
		frame.getContentPane().add(button_2);

		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = null;
				if (textField.getText().equals("0") || textField.getText().equals("0.0"))
					str = "4";
				else
					str = textField.getText() + "4";
				textField.setText(str);
			}
		});
		button_4.setBounds(10, 163, 63, 28);
		frame.getContentPane().add(button_4);

		JButton button_12 = new JButton("3");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = null;
				if (textField.getText().equals("0") || textField.getText().equals("0.0"))
					str = "3";
				else
					str = textField.getText() + "3";
				textField.setText(str);
			}
		});
		button_12.setBounds(176, 202, 63, 28);
		frame.getContentPane().add(button_12);

		JButton button_10 = new JButton("2");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = null;
				if (textField.getText().equals("0") || textField.getText().equals("0.0"))
					str = "2";
				else
					str = textField.getText() + "2";
				textField.setText(str);
			}
		});
		button_10.setBounds(93, 202, 63, 28);
		frame.getContentPane().add(button_10);

		JButton button_8 = new JButton("1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = null;
				if (textField.getText().equals("0") || textField.getText().equals("0.0"))
					str = "1";
				else
					str = textField.getText() + "1";
				textField.setText(str);
			}
		});
		button_8.setBounds(10, 202, 63, 28);
		frame.getContentPane().add(button_8);

		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("0")) {
					textField.setText(textField.getText() + "0");
				}
			}
		});
		button_11.setBounds(93, 241, 63, 28);
		frame.getContentPane().add(button_11);

		JButton button_6 = new JButton("\u00F7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField_1.getText().equals("") && !textField.getText().equals("0")) {
					textField_1.setText(textField.getText());
					textField.setText("0");
				} else if (!textField.getText().equals("0")) {
					Double num = evaluateEquation();
					textField_1.setText(new Double(num).toString());
					textField.setText("0");
				}
				textField_2.setText("\u00F7");
			}
		});
		button_6.setBounds(259, 124, 63, 28);
		frame.getContentPane().add(button_6);

		JButton button_7 = new JButton("\u00D7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField_1.getText().equals("") && !textField.getText().equals("0")) {
					textField_1.setText(textField.getText());
					textField.setText("0");
				} else if (!textField.getText().equals("0")) {
					Double num = evaluateEquation();
					textField_1.setText(new Double(num).toString());
					textField.setText("0");
				}
				textField_2.setText("\u00D7");
			}
		});
		button_7.setBounds(259, 163, 63, 28);
		frame.getContentPane().add(button_7);

		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField_1.getText().equals("") && !textField.getText().equals("0")) {
					textField_1.setText(textField.getText());
					textField.setText("0");
				} else if (!textField.getText().equals("0")) {
					Double num = evaluateEquation();
					textField_1.setText(new Double(num).toString());
					textField.setText("0");
				}
				textField_2.setText("-");
			}
		});
		button_14.setBounds(259, 202, 63, 28);
		frame.getContentPane().add(button_14);

		JButton button_15 = new JButton("+");
		button_15.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (textField_1.getText().equals("") && !textField.getText().equals("0")) {
					textField_1.setText(textField.getText());
					textField.setText("0");
				} else if (!textField.getText().equals("0")) {
					Double num = evaluateEquation();
					textField_1.setText(new Double(num).toString());
					textField.setText("0");
				}
				textField_2.setText("+");
			}
		});
		button_15.setBounds(259, 241, 63, 28);
		frame.getContentPane().add(button_15);

		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals("")) {
					Double num = evaluateEquation();
					textField_1.setText(textField.getText());
					textField_2.setText("=");
					textField.setText(Double.toString(num));
				}
			}
		});
		button_13.setBounds(176, 241, 63, 28);
		frame.getContentPane().add(button_13);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				textField_2.setText(null);
				textField_1.setText(null);
			}
		});
		btnC.setBounds(10, 241, 63, 28);
		frame.getContentPane().add(btnC);
	}
}
