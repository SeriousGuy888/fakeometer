import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI {
	public static void main() {
		gui();
	}
	
	private static void gui() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		
		int windowWidth = 390;
		int windowHeight = 300;
		
		JFrame f = new JFrame("Fakeometer v" + Fakeometer.VERSION);
			f.setSize(windowWidth, windowHeight);
			f.setMinimumSize(new Dimension(windowWidth, windowHeight));
			f.setLocation((screenWidth / 2) - (windowWidth / 2), (screenHeight / 2) - (windowHeight / 2));
		   
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JFrame.setDefaultLookAndFeelDecorated(true);
		   
			JLabel msg = new JLabel(Fakeometer.inputMessage);
			msg.setBounds(50, 50, 300, 30);
		   
			JTextField objectInput = new JTextField();
			objectInput.setBounds(50, 100, 200, 30);
			
			JButton submitButton = new JButton("Calculate!");
			submitButton.setBounds(50, 150, 150, 40);
			
			JButton noguiButton = new JButton("No GUI Version");
			noguiButton.setBounds(50, 200, 150, 25);
		   
			f.add(msg);
			f.add(objectInput);
			f.add(submitButton);
			f.add(noguiButton);
			
			f.setLayout(null);
			f.setVisible(true);
			
			submitButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String object = objectInput.getText();
					msg.setText(object + " is " + Fakeometer.calc() + "% fake.");
				}
			});
			
			noguiButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showInputDialog(null, 
						"To execute this with no GUI, execute this command in your terminal.\nMake sure you are in the directory in which this JAR file is stored.", 
						"How to Use NoGUI Version of the Fakeometer",
						1,
						null, 
						null, 
						"java -classpath fakeometer-v" + Fakeometer.VERSION + ".jar NoGUI"
					);
				}
			});
	}
}
