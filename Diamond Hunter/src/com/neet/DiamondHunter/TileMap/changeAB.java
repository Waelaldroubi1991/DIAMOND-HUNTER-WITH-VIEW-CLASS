//this code made by:
//Wael Aldroubi
//023676
package com.neet.DiamondHunter.TileMap;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import application.*;
import javafx.scene.control.TextField;

import com.neet.DiamondHunter.Entity.Item;
import com.neet.DiamondHunter.TileMap.*;

//this class is to control the whole map view application
//it's in swing right now and I will change it to javafx as a next step


public class changeAB extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	//object to call draw function from TileMap
	private TileMap tilemap;
	private Item item;
	private Item item1;
	private ArrayList<Item> items;
	private ArrayList<Item> items1;
	private controller control;
	private int[][]index=null;
	
	
	//Constructor to load recourses like map and tiles
	public changeAB(){
		items = new ArrayList<Item>();
		items1 = new ArrayList<Item>();
		
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map");
		tilemap.loadTiles("/Tilesets/testtileset.gif");
		
		//control = new controller();
		//control.changeab();
		
		/*try{
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
			for (int i = 0; i < 2; i++) {
	              for (int j = 0; j < 2; j++) {
	            	bw.write(1);
	              }
	              
			}
		}catch (IOException e){
        	System.out.println("Error writting to a txt file");
        }*/
		
		try{

            //BufferedReader br = new BufferedReader(new FileReader("C:/Users/Wael/Desktop/abc.txt"));
			BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
            int row=0;
            int size=0;
            String line;
            while((line=br.readLine())!=null){

                String[] values = line.trim().split("\\s+");
                if(index == null){
                    size = values.length;
                    index = new int[size][size];
                }

                for(int col=0; col<size; col++){
                    index[row][col]=Integer.valueOf(values[col]);
                }
                row++;
            }

        }catch(IOException ex){
            System.err.println(ex);
        }
		item = new Item(tilemap);
		item.setType(Item.AXE);
		item.setTilePosition(index[0][0],index[0][1]);
		items.add(item);
		
		item1 = new Item(tilemap);
		item1.setType(Item.BOAT);
		item1.setTilePosition(index[1][0], index[1][1]);
		items1.add(item1);
		
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
		item1.draw(g);
	}
	
	//Main function to control the flow of the program
	/*public static void main (String[] args)
	{	
		//this line to create a screen
		JFrame frame = new JFrame ("Change Axe & Boat screen");
		//size of the screen
		frame.setSize(new Dimension (655, 600));
		//starting point of the screen so it won't start at the up left corner of the screen
		frame.setLocation(new Point(200,80));
		//creating the Panel container
		changeAB panel = new changeAB();
		frame.setContentPane(panel);
		//to close the application when it's finish
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}*/
}