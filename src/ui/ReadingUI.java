package ui;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ReadingUI extends JPanel {

	String path;
	JPanel TextPanel;
	public ReadingUI(){
		path="source.txt";
		
		try {
			BufferedReader br=new BufferedReader(new FileReader(new File(path)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public ReadingUI(String toPath){
		path=toPath;
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ReadingUI rui=new ReadingUI();
		
		frame.setSize(500,500);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("test");
		
		Container c=frame.getContentPane();
		c.add(rui);
		
		frame.setVisible(true);
	}
}
