package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainGUILoader extends Application {
	
	
	

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("mainmenu.fxml"));
		
		

		AnchorPane anchor = (AnchorPane) loader.load();
		stage.setScene(new Scene(anchor));
		stage.show();
		
		
		
		
		
	}
		public static void main (String[] args){
			launch(args);
		}
}
