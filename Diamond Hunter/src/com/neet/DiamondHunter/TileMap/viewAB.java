package com.neet.DiamondHunter.TileMap;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.neet.DiamondHunter.Entity.Item;
import com.neet.DiamondHunter.TileMap.*;

//this class is to control the whole map view application
//it's in swing right now and I will change it to javafx as a next step


public class viewAB extends JPanel{
	
	//object to call draw function from TileMap
	private TileMap tilemap;
	private Item item;
	private Item item1;
	private ArrayList<Item> items;
	private ArrayList<Item> items1;
	
	
	
	
	//Constructor to load recourses like map and tiles
	public viewAB(){
		items = new ArrayList<Item>();
		items1 = new ArrayList<Item>();
		
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map");
		tilemap.loadTiles("/Tilesets/testtileset.gif");
		
		//axe();
		item = new Item(tilemap);
		item.setType(Item.AXE);
		item.setTilePosition(26,37);
		items.add(item);
		
		item1 = new Item(tilemap);
		item1.setType(Item.BOAT);
		item1.setTilePosition(12, 4);
		items1.add(item1);
		//boat();
		
	}
	
	/*public void axe(){
		items = new ArrayList<Item>();
		item = new Item(tilemap);
		item.setType(Item.AXE);
		item.setTilePosition(26,37);
		items.add(item);
		
	}
	
	public void boat (){
		items = new ArrayList<Item>();
		item = new Item(tilemap);
		item.setType(Item.BOAT);
		item.setTilePosition(12, 4);
		items.add(item);
	}*/
	
	
	//function to call graphics and connect it with draw function from TileMap
	public void paint (Graphics g){
		tilemap.draw(g);
		item.draw(g);
	}
	
	//Main function to control the flow of the program
	public static void main (String[] args)
	{	
		//this line to create a screen
		JFrame frame = new JFrame ("MapViewer screen");
		//size of the screen
		frame.setSize(new Dimension (655, 600));
		//starting point of the screen so it won't start at the up left corner of the screen
		frame.setLocation(new Point(200,80));
		//creating the Panel container
		viewAB panel = new viewAB();
		frame.setContentPane(panel);
		//to close the application when it's finish
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}