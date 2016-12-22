//this code made by:
//Wael Aldroubi
//023676
package com.neet.DiamondHunter.TileMap;

import java.awt.Graphics;

import java.util.ArrayList;


import javax.swing.JPanel;

import com.neet.DiamondHunter.Entity.Item;

//this class is to control the View axe and boat.

public class viewAB extends JPanel{
	
	private static final long serialVersionUID = 1L;
	//objects to call my other functions from the game.
	private TileMap tilemap;
	private Item item;
	private Item item1;
	private ArrayList<Item> items;
	private ArrayList<Item> items1;
	
	//Constructor to load recourses like map, tiles and Items. 
	public viewAB(){
		//objects to load the Items
		items = new ArrayList<Item>();
		items1 = new ArrayList<Item>();
		
		//to load the map.
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map");
		tilemap.loadTiles("/Tilesets/testtileset.gif");
		
		//to load axe position
		item = new Item(tilemap);
		item.setType(Item.AXE);
		item.setTilePosition(26,37);
		items.add(item);
		
		//to load boat position
		item1 = new Item(tilemap);
		item1.setType(Item.BOAT);
		item1.setTilePosition(12, 4);
		items1.add(item1);
	}
	
	//function to call graphics
	public void paint (Graphics g){
		tilemap.draw(g);
		item.draw(g);
		item1.draw(g);
	}
}