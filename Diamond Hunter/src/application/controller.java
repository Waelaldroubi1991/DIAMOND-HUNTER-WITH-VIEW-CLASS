package application;

import java.awt.Dimension;
import java.awt.Point;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JFrame;

import com.neet.DiamondHunter.TileMap.view;
import com.neet.DiamondHunter.TileMap.viewAB;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class controller implements Initializable {
	
	@Override
	public void initialize ( URL arg0 , ResourceBundle arg1){
		
	}
	
	@FXML
	private Button btnmap;
	
	@FXML
	private Button btnab;
	
	@FXML
	public void map (ActionEvent event){
		//this line to create a screen
				JFrame frame = new JFrame ("MapViewer screen");
				//size of the screen
				frame.setSize(new Dimension (655, 600));
				//starting point of the screen so it won't start at the up left corner of the screen
				frame.setLocation(new Point(200,80));
				//creating the Panel container
				view panel = new view();
				//btnmap.setContentDisplay(panel);
				frame.setContentPane(panel);
				//to close the application when it's finish
				//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
	}
	
	public void ab (ActionEvent event){
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
				//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
	}

	public controller() {
		// TODO Auto-generated constructor stub
	}

}
