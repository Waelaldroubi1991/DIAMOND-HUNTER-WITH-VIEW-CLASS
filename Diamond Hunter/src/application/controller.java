package application;

import com.neet.DiamondHunter.Entity.Item;
import com.neet.DiamondHunter.TileMap.*;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JFrame;

import com.neet.DiamondHunter.Entity.Item;
import com.neet.DiamondHunter.Main.GamePanel;
import com.neet.DiamondHunter.TileMap.TileMap;
import com.neet.DiamondHunter.TileMap.view;
import com.neet.DiamondHunter.TileMap.viewAB;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class controller implements Initializable {
	
	private TileMap tilemap;
	private Item item;
	private Item item1;
	private ArrayList<Item> items;
	private ArrayList<Item> items1;
	
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
				frame.setSize(new Dimension (655, 600));
				//starting point of the screen so it won't start at the up left corner of the screen
				frame.setLocation(new Point(350,80));
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
				frame.setSize(new Dimension (655, 600));
				//starting point of the screen so it won't start at the up left corner of the screen
				frame.setLocation(new Point(350,80));
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
				frame.setSize(new Dimension (655, 600));
				//starting point of the screen so it won't start at the up left corner of the screen
				frame.setLocation(new Point(350,80));
				//creating the Panel container
				viewpd panel = new viewpd();
				frame.setContentPane(panel);
				//to close the application when it's finish
				//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
	}
	
	@FXML
	public void gettingab (ActionEvent event){
		JFrame frame = new JFrame ("AXE & BOAT after change");
		//size of the screen
		frame.setSize(new Dimension (655, 600));
		//starting point of the screen so it won't start at the up left corner of the screen
		frame.setLocation(new Point(350,80));
		//creating the Panel container
		changeAB panel = new changeAB();
		//Container panel1 = new Container();
		//gettingab ();
		frame.setContentPane(panel);
		//to close the application when it's finish
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	@FXML
	public void changeab(){
		final TextField axeX = new TextField ();
		//String axe1 = axeX.getText();
		final TextField boatX = new TextField ();
		//String boat1= boatX.getText();
		//String boat1= boatX.getText();
		final TextField axeY = new TextField ();
		//String axe2 = axeY.getText();
		final TextField boatY = new TextField ();
		//String boat2= boatY.getText();
		//Integer x1 = Integer.valueOf(axe1);
		//Integer x1 = Integer.parseInt(axe1);
		//Integer x2 = Integer.valueOf(axe2);
		//Integer x2 = Integer.parseInt(axe2);
		//Integer b1 = Integer.valueOf(boat1);
		//Integer b1 = Integer.parseInt(boat1);
		//Integer b2 = Integer.valueOf(boat2);
		//Integer b2 = Integer.parseInt(boat2);
		int x1 = Integer.parseInt(axeX.getText());
		int x2 = Integer.parseInt(axeY.getText());
		int b1 = Integer.parseInt(boatX.getText());
		int b2 = Integer.parseInt(boatY.getText());
		
		try{
			FileWriter fw = new FileWriter("/Maps/change position.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(x1);
			pw.println(x2);
			pw.println(b1);
			pw.println(b2);
			
			pw.close();
		}
		catch (IOException e){
			System.out.println("error writting to a field");
		}
		
		try{
			FileReader fr = new FileReader("/Maps/change position.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while ((str = br.readLine())!=null){
				System.out.println(str + "\n");
			}
		}
		catch (IOException e){
			System.out.println("error reading to a field");
		}
		//String axe=new axe.getText();
				//String boat= boat.getText();
				items = new ArrayList<Item>();
				items1 = new ArrayList<Item>();
				
				tilemap = new TileMap(16);
				tilemap.loadMap("/Maps/testmap.map");
				tilemap.loadTiles("/Tilesets/testtileset.gif");
				
				//axe();
				item = new Item(tilemap);
				item.setType(Item.AXE);
				item.setTilePosition(x1,x2);
				items.add(item);
				
				item1 = new Item(tilemap);
				item1.setType(Item.BOAT);
				item1.setTilePosition(b1, b2);
				items1.add(item1);
				//boat();	
				//return item;
				//return item1;
				
				
	}
	//added just in case the one at changeAB not reading
	public void paint (Graphics g){
		tilemap.draw(g);
		item.draw(g);
		item1.draw(g);
	}
	
	
	
	

	public void controller() {
		
	}

}
