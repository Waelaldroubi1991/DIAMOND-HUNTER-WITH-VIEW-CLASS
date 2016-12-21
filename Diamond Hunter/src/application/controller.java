//this code made by:
//Wael Aldroubi
//023676
package application;

import com.neet.DiamondHunter.Entity.Item;
import com.neet.DiamondHunter.TileMap.*;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;


import java.util.ResourceBundle;

import javax.swing.JFrame;


import com.neet.DiamondHunter.Main.GamePanel;

import com.neet.DiamondHunter.TileMap.TileMap;
import com.neet.DiamondHunter.TileMap.view;
import com.neet.DiamondHunter.TileMap.viewAB;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class controller implements Initializable {
	
	private TileMap tilemap;
	private Item item;
	private Item item1;
	
	
	@Override
	public void initialize ( URL arg0 , ResourceBundle arg1){
		
	}
	
	@FXML
	private Button btnmap;
	
	@FXML
	private Button pd;
	
	@FXML
	private Button btnab;
	
	@FXML
	private Button pg;
	
	@FXML
	private TextField axeX;
	
	@FXML
	private TextField axeY;
	
	@FXML
	private TextField boatX;
	
	@FXML
	private TextField boatY;
	
	@FXML
	private Button submit;
	
	@FXML
	private Label label;
	
	@FXML
	private Label DH;
	
	@FXML
	private Label thegame;
	
	/*public class NumberTextField extends TextField
	{

	    @Override
	    public void replaceText(int start, int end, String text)
	    {
	        if (text.matches("[0-9]*"))
	        {
	            super.replaceText(start, end, text);
	        }
	    }

	    @Override
	    public void replaceSelection(String text)
	    {
	        if (validate(text))
	        {
	            super.replaceSelection(text);
	        }
	    }

	    private boolean validate(String text)
	    {
	        return text.matches("[0-9]*");
	    }
	}*/
	
	
	@FXML
	public void map (ActionEvent event){
		//this line to create a screen
				JFrame frame = new JFrame ("MapViewer screen");
				//size of the screen
				frame.setSize(new Dimension (656, 679));
				//starting point of the screen so it won't start at the up left corner of the screen
				frame.setLocation(new Point(350,60));
				//creating the Panel container
				view panel = new view();
				//btnmap.setContentDisplay(panel);
				frame.setContentPane(panel);
				//to close the application when it's finish
				//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
	}
	@FXML
	public void ab (ActionEvent event){
		//this line to create a screen
				JFrame frame = new JFrame ("AXE & BOAT screen");
				//size of the screen
				frame.setSize(new Dimension (656, 679));
				//starting point of the screen so it won't start at the up left corner of the screen
				frame.setLocation(new Point(350,60));
				//creating the Panel container
				viewAB panel = new viewAB();
				frame.setContentPane(panel);
				//to close the application when it's finish
				//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
	}
	//function to show the main game
	@FXML
	public void pg (ActionEvent event){
JFrame window = new JFrame("Diamond Hunter");
		
		window.add(new GamePanel());
		
		window.setResizable(false);
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@FXML
	public void pd (ActionEvent event){
		//this line to create a screen
				JFrame frame = new JFrame ("Player and Diamonds");
				//size of the screen
				frame.setSize(new Dimension (656, 679));
				//starting point of the screen so it won't start at the up left corner of the screen
				frame.setLocation(new Point(350,60));
				//creating the Panel container
				viewpd panel = new viewpd();
				frame.setContentPane(panel);
				//to close the application when it's finish
				//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
	}
	
	@FXML
	public void gettingab (ActionEvent event){
		
		int x1 = Integer.parseInt(axeX.getText());
		int x2 = Integer.parseInt(axeY.getText());
		int b1 = Integer.parseInt(boatX.getText());
		int b2 = Integer.parseInt(boatY.getText());
		
		try{
        	
			 
			 
			 
        	PrintWriter output= new PrintWriter("abc.txt","UTF-8");
        	
        	output.println(x1);
        	output.println(x2);
        	output.println(b1);
        	output.println(b2);
        	output.close();}
		
		catch (IOException e){
        	System.out.println("Error writting to a txt file");
        }
        	
		
		
		JFrame frame = new JFrame ("AXE & BOAT after change");
		//size of the screen
		frame.setSize(new Dimension (656, 679));
		//starting point of the screen so it won't start at the up left corner of the screen
		frame.setLocation(new Point(350,60));

		//creating the Panel container
		changeAB panel = new changeAB();
		//Container panel1 = new Container();
		//gettingab ();
		frame.setContentPane(panel);
		//to close the application when it's finish
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
	/*public void writetofile(){
		 try{
	        	
	        	//PrintWriter output= new PrintWriter(file);
	        	
	            //int[] array = new int[]{x1,x2};
	            //int[] array1 = new int[]{b1,b2};
	            //BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Wael/Desktop/abc.txt"));
	            BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
	            for (int i = 0; i < 2; i++) {
	              for (int j = 0; j < 2; j++) {
	            
	            	 // System.out.println("Idiot");
		              
	             //bw.write("hi");
	           
	           bw.write(index[i][j] + " ");
	            	  //output.write(index[i][j] + " ");
	           // System.out.println("Idiot");
	            
	               }
	              bw.close();
	              //output.close();
	              //bw.newLine();
	         }
	       // bw.flush();
	        //
	            //System.out.println("Save Coordinate File value="+index[0][1]);
	           
	        }
	        catch (IOException e){
	        	System.out.println("Error writting to a txt file");
	        }
	}*/
	
	
	
	//added just in case the one at changeAB not reading
	public void paint (Graphics g){
		tilemap.draw(g);
		item.draw(g);
		item1.draw(g);
	}
	
	
	
	

	public controller() {
		
	}

}
