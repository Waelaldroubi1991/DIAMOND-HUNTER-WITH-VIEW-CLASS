//this code made by:
//Wael Aldroubi
//023676
package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	//main class is just to start the stage and then the functions inside the scenes.
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//to load the FXML (User Interface sheet)
			Parent root = FXMLLoader.load(getClass().getResource("/application/mapUI.FXML"));
			//starting new scene
			Scene scene = new Scene(root,400,500);
			//styling sheet
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//main function.
	public static void main(String[] args) {
		launch(args);
	}
}
