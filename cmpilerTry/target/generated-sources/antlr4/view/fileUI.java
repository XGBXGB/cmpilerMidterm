package view;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;  

public class fileUI implements ActionListener{

	JFileChooser fileChooser;
	JFrame frame;
	JButton btn_ChooseFile;
	
	public fileUI()
	{
		frame = new JFrame();
		frame.setBounds(0, 0, 500, 500);
		frame.setTitle("INTEGER CALCULATOR");
		frame.setLayout(null);
		
		btn_ChooseFile = new JButton();
		btn_ChooseFile.setBounds(0, 0, 500, 30);
		btn_ChooseFile.setLocation(0, 0);
		btn_ChooseFile.setText("Choose your file");
		btn_ChooseFile.addActionListener(this);
		btn_ChooseFile.setVisible(true);
		
		//fileChooser = new JFileChooser();
		//fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		//fileChooser.setDialogTitle("Choose your file");
		//fileChooser.setBounds(0, 0, 250, 250);
		//frame.add(fileChooser);	
		
	//	fileChooser.setVisible(true);
		
		frame.add(btn_ChooseFile);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn_ChooseFile)
		{
			fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
			fileChooser.setDialogTitle("Choose your file");
			fileChooser.setBounds(0, 0, 250, 250);
			
			frame.add(fileChooser);
			fileChooser.setVisible(true);
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		new fileUI();
	
	}
	
}
