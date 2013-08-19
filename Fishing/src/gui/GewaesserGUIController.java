package gui;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class GewaesserGUIController {
	
	@FXML
	TableView Table;
	private Stage stage;
	
	@FXML
	public void add(){
		
	}
	
	@FXML
	public void zurueck(){
		this.stage.close();
	}

	public void setStage(Stage stage) {
		this.stage=stage;
	}
	
	
	
	
	}
	
	
	
	

