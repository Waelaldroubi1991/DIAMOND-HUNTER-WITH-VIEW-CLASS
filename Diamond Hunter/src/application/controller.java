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

//this class is to control all of tilemap classes and connect them to the User Interface

public class controller implements Initializable {
	//my objects to call the functions or constractors in my Tilemap classes
	private TileMap tilemap;
	private Item item;
	private Item item1;
	
	
	@Override
	public void initialize ( URL arg0 , ResourceBundle arg1){
		
	}
	//my Interface buttons,labels, and text fields.
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
	

	//function to view the map connected to view diamond hunter button
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
				frame.setVisible(true);
	}
	
	//function to view the axe and boat original position connected to view axe and boat button
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
				frame.setVisible(true);
	}
	
	//function to show the main game connected to play game button.
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
	
	//function to view Diamonds in the map connected to view diamonds button.
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
				frame.setVisible(true);
	}
	
	//function to change axe and boat position using txt file connected to 4 text fields
	@FXML
	public void gettingab (ActionEvent event){
		//to store the text fields values in int variabels.
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
		frame.setVisible(true);
		
		
	}

	//added just in case the one at changeAB not reading
	public void paint (Graphics g){
		tilemap.draw(g);
		item.draw(g);
		item1.draw(g);
	}
	//my constractor, but it has no job, auto generated.
	public controller() {
		
	}

}
