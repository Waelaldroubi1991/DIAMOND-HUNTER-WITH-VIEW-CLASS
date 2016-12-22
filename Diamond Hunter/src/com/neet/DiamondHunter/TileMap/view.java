//this code made by:
//Wael Aldroubi
//023676
package com.neet.DiamondHunter.TileMap;

import java.awt.Graphics;

import javax.swing.JPanel;

//this class is to control the whole map view application.

public class view extends JPanel{
	
	/**
	 * this is an example of javaDoc
	 * and I already added all comments to all my functions.
	 */
	private static final long serialVersionUID = 1L;
	//object to call draw function from TileMap
	private TileMap tilemap;
	//Constructor to load recourses like map and tiles
	public view(){
		//to load the map.
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map");
		tilemap.loadTiles("/Tilesets/testtileset.gif");	
	}
	//function to call graphics and connect it with draw function from TileMap
	public void paint (Graphics g){
		tilemap.draw(g);
	}
}