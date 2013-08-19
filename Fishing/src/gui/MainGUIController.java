package gui;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MainGUIController {
	
	
	
	
	
	
	@FXML
	public void showTables(){
		new TableGUILoader();
	}
	
	@FXML
	public void add(){
		new HinzufuegenGUILoader();
	}
	
	@FXML
	public void showKoeder(){
		new KoederGUILoader();
	}
	
	
	@FXML
	public void showGewaesser(){
		new GewaesserGUILoader();
	}
	
	
	@FXML
	public void showFirma(){
		new FirmaGUILoader();
	}
	
	
	
	
}
