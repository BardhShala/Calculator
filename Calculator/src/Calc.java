import java.awt.event.*;
import javax.swing.*;


public class Calc extends JFrame implements ActionListener {

	static String number;			//perdoret per te shfaqur numrin ne ekran
	static double result = 0;		//perdoret per te ruajtur numrin me te cilin operojme
	static int lastOperator = -1;	//perdoret per te mbajtur mend operatorin e fundit te perdorur (+,-,*,/)
	
	/*
	 * Butonat prej 1 deri 9
	 */
	JButton Button0 = new JButton("0");
	JButton Button1 = new JButton("1");
	JButton Button2 = new JButton("2");
	JButton Button3 = new JButton("3");
	JButton Button4 = new JButton("4");
	JButton Button5 = new JButton("5");
	JButton Button6 = new JButton("6");
	JButton Button7 = new JButton("7");
	JButton Button8 = new JButton("8");
	JButton Button9 = new JButton("9");
	
	/*
	 * Butonat per operatoret
	 */
	JButton plusButton = new JButton("+");
	JButton minusButton = new JButton("-");
	JButton multiButton = new JButton("*");
	JButton divButton = new JButton("/");
	JButton equalButton = new JButton("=");
	
	/*
	 * TextField ku shihet numri qe e shenojme
	 */
	JTextField numText = new JTextField("");
	
	/*
	 * Konstruktori qe nderton dritaren
	 */
	public Calc() {
		
		/*
		 * Konfigurimi i panelit dhe frame-it
		 */
		JPanel myPanel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(myPanel);
		myPanel.setLayout(null);
		
		/*
		 * Shtimi i ActionListeners ne butona
		 */
		Button0.addActionListener(this);
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		Button3.addActionListener(this);
		Button4.addActionListener(this);
		Button5.addActionListener(this);
		Button6.addActionListener(this);
		Button7.addActionListener(this);
		Button8.addActionListener(this);
		Button9.addActionListener(this);
		plusButton.addActionListener(this);
		minusButton.addActionListener(this);
		multiButton.addActionListener(this);
		divButton.addActionListener(this);
		equalButton.addActionListener(this);
		
		/*
		 * Vendosja e Textfield
		 */
		numText.setBounds(10,20, 260, 50 );
		
		/*
		 * Rendi i pare i butonave
		 */
		Button7.setBounds(10, 80, 65, 65);
		Button8.setBounds(75, 80, 65, 65);
		Button9.setBounds(140, 80, 65, 65);
		plusButton.setBounds(205, 80, 65, 65);
		
		/*
		 * Rendi i dyte i butonave
		 */
		Button4.setBounds(10, 145, 65, 65);
		Button5.setBounds(75, 145, 65, 65);
		Button6.setBounds(140, 145, 65, 65);
		minusButton.setBounds(205, 145, 65, 65);
		
		/*
		 * Rendi i trete i butonave
		 */
		Button1.setBounds(10, 210, 65, 65);
		Button2.setBounds(75, 210, 65, 65);
		Button3.setBounds(140, 210, 65, 65);
		multiButton.setBounds(205, 210, 65, 65);
		
		/*
		 * Rendi i katert i butonave
		 */
		Button0.setBounds(10, 275, 130, 65);
		divButton.setBounds(140, 275, 65, 65);
		equalButton.setBounds(205, 275, 65, 65);
		
		/*
		 * Shtimi i butonave ne panel
		 */
		myPanel.add(numText);
		myPanel.add(Button1);
		myPanel.add(Button2);
		myPanel.add(Button3);
		myPanel.add(Button4);
		myPanel.add(Button5);
		myPanel.add(Button6);
		myPanel.add(Button7);
		myPanel.add(Button8);
		myPanel.add(Button9);
		myPanel.add(Button0);
		myPanel.add(plusButton);
		myPanel.add(minusButton);
		myPanel.add(multiButton);
		myPanel.add(divButton);
		myPanel.add(equalButton);
	}
	
	/*
	 * Metoda qe kontrollon se cilin buton kemi shtypur
	 */
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == Button0)
			Button0Pressed();
		else if(source == Button1)
			Button1Pressed();
		else if(source == Button2)
			Button2Pressed();
		else if(source == Button3)
			Button3Pressed();
		else if(source == Button4)
			Button4Pressed();
		else if(source == Button5)
			Button5Pressed();
		else if(source == Button6)
			Button6Pressed();
		else if(source == Button7)
			Button7Pressed();
		else if(source == Button8)
			Button8Pressed();
		else if(source == Button9)
			Button9Pressed();
		else if(source == plusButton)
			PlusButtonPressed();
		else if(source == minusButton)
			MinusButtonPressed();
		else if(source == multiButton)
			MultiButtonPressed();
		else if(source == divButton)
			DivButtonPressed();
		else if(source == equalButton)
			EqualButtonPressed();
	}
	
	/*
	 * Metoda kur shtypet butoni Button0
	 */
	public void Button0Pressed() {
		number = numText.getText();
		numText.setText(number+"0");
	}

	/*
	 * Metoda kur shtypet butoni Button1
	 */
	public void Button1Pressed() {
		number = numText.getText();
		numText.setText(number+"1");
	}
	
	/*
	 * Metoda kur shtypet butoni Button2
	 */
	public void Button2Pressed() {
		number = numText.getText();
		numText.setText(number+"2");
	}
	
	/*
	 * Metoda kur shtypet butoni Button3
	 */
	public void Button3Pressed() {
		number = numText.getText();
		numText.setText(number+"3");
	}
	
	/*
	 * Metoda kur shtypet butoni Button4
	 */
	public void Button4Pressed() {
		number = numText.getText();
		numText.setText(number+"4");
	}
	
	/*
	 * Metoda kur shtypet butoni Button5
	 */
	public void Button5Pressed() {
		number = numText.getText();
		numText.setText(number+"5");
	}
	
	/*
	 * Metoda kur shtypet butoni Button6
	 */
	public void Button6Pressed() {
		number = numText.getText();
		numText.setText(number+"6");
	}
	
	/*
	 * Metoda kur shtypet butoni Button7
	 */
	public void Button7Pressed() {
		number = numText.getText();
		numText.setText(number+"7");
	}
	
	/*
	 * Metoda kur shtypet butoni Button8
	 */
	public void Button8Pressed() {
		number = numText.getText();
		numText.setText(number+"8");
	}
	
	/*
	 * Metoda kur shtypet butoni Button9
	 */
	public void Button9Pressed() {
		number = numText.getText();
		numText.setText(number+"9");
	}
	
	/*
	 * Metoda kur shtypet butoni plusButton
	 */
	public void PlusButtonPressed() {
		if(lastOperator == -1)
			result = new Double(numText.getText()).doubleValue();
		else if ((new Double(numText.getText()).doubleValue() == 0) && lastOperator == 3) {
			JOptionPane.showMessageDialog(null, "Pjesetimi me zero nuk lejohet!");
			result = 0;
			numText.setText("");
			lastOperator = -1;
		}
		else {
			switch (lastOperator) {
				case 0: {
					result = result + (new Double(numText.getText()).doubleValue());
					break;
				}
				case 1: {
					result = result - (new Double(numText.getText()).doubleValue());
					break;
				}
				case 2: {
					result = result * (new Double(numText.getText()).doubleValue());
					break;
				}
				case 3: {
					result = result / (new Double(numText.getText()).doubleValue());
					break;
				}
			}
		}
	numText.setText("");
	lastOperator = 0;
	}
	
	/*
	 * Metoda kur shtypet butoni minusButton
	 */
	public void MinusButtonPressed() {
		if(lastOperator == -1)
			result = new Double(numText.getText()).doubleValue();
		else if ((new Double(numText.getText()).doubleValue() == 0) && lastOperator == 3) {
			JOptionPane.showMessageDialog(null, "Pjesetimi me zero nuk lejohet!");
			result = 0;
			numText.setText("");
			lastOperator = -1;
		}
		else {
			switch (lastOperator) {
				case 0: {
					result = result + (new Double(numText.getText()).doubleValue());
					break;
				}
				case 1: {
					result = result - (new Double(numText.getText()).doubleValue());
					break;
				}
				case 2: {
					result = result * (new Double(numText.getText()).doubleValue());
					break;
				}
				case 3: {
					result = result / (new Double(numText.getText()).doubleValue());
					break;
				}
			}
		}
	numText.setText("");
	lastOperator = 1;
	}
	
	/*
	 * Metoda kur shtypet butoni multiButton
	 */
	public void MultiButtonPressed() {
		if(lastOperator == -1)
			result = new Double(numText.getText()).doubleValue();
		else if ((new Double(numText.getText()).doubleValue() == 0) && lastOperator == 3) {
			JOptionPane.showMessageDialog(null, "Pjesetimi me zero nuk lejohet!");
			result = 0;
			numText.setText("");
			lastOperator = -1;
		}
		else {
			switch (lastOperator) {
				case 0: {
					result = result + (new Double(numText.getText()).doubleValue());
					break;
				}
				case 1: {
					result = result - (new Double(numText.getText()).doubleValue());
					break;
				}
				case 2: {
					result = result * (new Double(numText.getText()).doubleValue());
					break;
				}
				case 3: {
					result = result / (new Double(numText.getText()).doubleValue());
					break;
				}
			}
		}
	numText.setText("");
	lastOperator = 2;
	}
	
	/*
	 * Metoda kur shtypet butoni divButton
	 */
	public void DivButtonPressed() {
		if(lastOperator == -1)
			result = new Double(numText.getText()).doubleValue();
		else if ((new Double(numText.getText()).doubleValue() == 0) && lastOperator == 3) {
			JOptionPane.showMessageDialog(null, "Pjesetimi me zero nuk lejohet!");
			result = 0;
			numText.setText("");
			lastOperator = -1;
		}
		else {
			switch (lastOperator) {
				case 0: {
					result = result + (new Double(numText.getText()).doubleValue());
					break;
				}
				case 1: {
					result = result - (new Double(numText.getText()).doubleValue());
					break;
				}
				case 2: {
					result = result * (new Double(numText.getText()).doubleValue());
					break;
				}
				case 3: {
					result = result / (new Double(numText.getText()).doubleValue());
					break;
				}
			}
		}
	numText.setText("");
	lastOperator = 3;
	}
	
	/*
	 * Metoda kur shtypet butoni equalButton
	 */
	public void EqualButtonPressed() {
		if ((new Double(numText.getText()).doubleValue() == 0) && lastOperator == 3) {
			JOptionPane.showMessageDialog(null, "Pjesetimi me zero nuk lejohet!");
			result = 0;
			numText.setText("");
			lastOperator = -1;
		}
		else {
			switch (lastOperator) {
				case -1: {
					result = new Double(numText.getText()).doubleValue();
					break;
				}
				case 0: {
					result = result + (new Double(numText.getText()).doubleValue());
					break;
				}
				case 1: {
					result = result - (new Double(numText.getText()).doubleValue());
					break;
				}
				case 2: {
					result = result * (new Double(numText.getText()).doubleValue());
					break;
				}
				case 3: {
					result = result / (new Double(numText.getText()).doubleValue());
					break;
				}
			}
			JOptionPane.showMessageDialog(null, "rezultati eshte: " + result);
		}
		result = 0;
		numText.setText("");
		lastOperator = -1;
	}
}
