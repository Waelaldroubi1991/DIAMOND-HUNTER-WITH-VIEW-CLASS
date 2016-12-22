//this code made by:
//Wael Aldroubi
//023676
package com.neet.DiamondHunter.TileMap;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.neet.DiamondHunter.Entity.Diamond;

//this class is to view diamods in the map.

public class viewpd extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	//objects to call my other functions from the game.
	private TileMap tilemap;
	private ArrayList<Diamond> diamonds;
	
	public viewpd(){
		//objects to call my other functions from the game.
		diamonds = new ArrayList<Diamond>();
		
		//to load the map.
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map");
		tilemap.loadTiles("/Tilesets/testtileset.gif");
		
		//to load the Diamonds.
		Diamond d;
		d = new Diamond(tilemap);
		d.setTilePosition(20, 20);
		d.addChange(new int[] { 23, 19, 1 });
		d.addChange(new int[] { 23, 20, 1 });
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(12, 36);
		d.addChange(new int[] { 31, 17, 1 });
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(28, 4);
		d.addChange(new int[] {27, 7, 1});
		d.addChange(new int[] {28, 7, 1});
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(4, 34);
		d.addChange(new int[] { 31, 21, 1 });
		diamonds.add(d);
		
		d = new Diamond(tilemap);
		d.setTilePosition(28, 19);
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(35, 26);
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(38, 36);
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(27, 28);
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(20, 30);
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(14, 25);
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(4, 21);
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(9, 14);
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(4, 3);
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(20, 14);
		diamonds.add(d);
		d = new Diamond(tilemap);
		d.setTilePosition(13, 20);
		diamonds.add(d);
	}
	
	//function to call graphics
	public void paint (Graphics g){
		tilemap.draw(g);
		for(Diamond d : diamonds) {
			d.draw(g);
		}
	}
}
