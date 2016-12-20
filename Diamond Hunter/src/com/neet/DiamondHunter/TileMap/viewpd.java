//this code made by:
//Wael Aldroubi
//023676
package com.neet.DiamondHunter.TileMap;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.neet.DiamondHunter.Entity.Diamond;
import com.neet.DiamondHunter.Entity.Player;
import com.neet.DiamondHunter.Manager.Content;

public class viewpd extends JPanel{
	
	private TileMap tilemap;
	private ArrayList<Diamond> diamonds;
	private Player player;
	//private Content p;
	
	public viewpd(){
		//Player player;
		//Player p;
		//player = new Player(tilemap);
		//p = new Content();
		//p = new Player(tilemap);
		diamonds = new ArrayList<Diamond>();
		Content.load("/Sprites/playersprites.gif", 16, 16);
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map");
		tilemap.loadTiles("/Tilesets/testtileset.gif");
		//player.setPosition(17, 17);
		//player.setMapPosition();
		//
		//player.setTilePosition(17, 17);

		//player.setTilePosition(17, 17);
		
		//player.setTotalDiamonds(diamonds.size());
		//player.setTilePosition(17, 17);
		
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
	
	public void paint (Graphics g){
		tilemap.draw(g);
		//player.draw(g);
		for(Diamond d : diamonds) {
			d.draw(g);
		}
	}

}
