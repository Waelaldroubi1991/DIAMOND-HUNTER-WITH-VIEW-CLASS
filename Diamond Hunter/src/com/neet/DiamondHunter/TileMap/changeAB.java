//this code made by:
//Wael Aldroubi
//023676
package com.neet.DiamondHunter.TileMap;

import java.awt.Graphics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JPanel;



import com.neet.DiamondHunter.Entity.Item;

//this class is to change axe and boat position by reading the new coordinates from a file.

public class changeAB extends JPanel{
	
	private static final long serialVersionUID = 1L;
	//object to call draw function from the game.
	private TileMap tilemap;
	private Item item;
	private Item item1;
	private ArrayList<Item> items;
	private ArrayList<Item> items1;
	List<Integer> index = new ArrayList<>();
	
	
	//Constructor to load recourses like map and tiles
	public changeAB(){
		//objects to call the items.
		items = new ArrayList<Item>();
		items1 = new ArrayList<Item>();
		// to load the map
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map");
		tilemap.loadTiles("/Tilesets/testtileset.gif");
		
			try {
				for (String line : Files.readAllLines(Paths.get("abc.txt"))){
					Integer i = Integer.valueOf(line);
				    index.add(i);
				}
			}  catch (IOException e)
			{
				e.printStackTrace();
			}
		
	//to store the text field values in the new axe and boat coordinates.
	item = new Item(tilemap);
	item.setType(Item.AXE);
	item.setTilePosition(index.get(1),index.get(0));
	items.add(item);
	
	item1 = new Item(tilemap);
	item1.setType(Item.BOAT);
	item1.setTilePosition(index.get(3),index.get(2));
	items1.add(item1);
	}
   
	//function to call graphics and connect it with draw function from TileMap
	public void paint (Graphics g){
		tilemap.draw(g);
		item.draw(g);
		item1.draw(g);
	}
}