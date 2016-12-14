//this code made by:
//Wael Aldroubi
//023676
package com.neet.DiamondHunter.TileMap;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.neet.DiamondHunter.TileMap.*;

//this class is to control the whole map view application
//it's in swing right now and I will change it to javafx as a next step


public class view extends JPanel{
	//object to call draw function from TileMap
	private TileMap tilemap;
	
	//Constructor to load recourses like map and tiles
	public view(){
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map");
		tilemap.loadTiles("/Tilesets/testtileset.gif");
	}
	
	//function to call graphics and connect it with draw function from TileMap
	public void paint (Graphics g){
		tilemap.draw(g);
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
		view panel = new view();
		frame.setContentPane(panel);
		//to close the application when it's finish
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}