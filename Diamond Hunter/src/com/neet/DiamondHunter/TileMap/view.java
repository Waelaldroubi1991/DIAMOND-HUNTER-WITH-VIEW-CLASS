package com.neet.DiamondHunter.TileMap;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.neet.DiamondHunter.TileMap.*;



public class view extends JPanel{
	private TileMap tilemap;
	
	public view(){
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map");
		tilemap.loadTiles("/Tilesets/testtileset.gif");
	}
	
	public void paintComponent (Graphics g){
		
		tilemap.draw(g);
	}
	
	public static void main (String[] args)
	{	
		JFrame frame = new JFrame ("MapViewer screen");
		frame.setSize(new Dimension (800, 600));
		frame.setLocation(new Point(200,80));
		view panel = new view();
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}