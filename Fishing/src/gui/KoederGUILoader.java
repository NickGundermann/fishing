package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class KoederGUILoader extends Application {
	
	KoederGUIController controller;

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("köder.fxml"));

		AnchorPane anchor = (AnchorPane) loader.load();
		stage.setScene(new Scene(anchor));
		stage.show();
		
		controller = loader.getController();
		controller.setStage(stage);
		
	}
	



public KoederGUILoader(){
	
	
	try {
		start(new Stage());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}












}