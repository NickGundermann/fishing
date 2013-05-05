package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import gui.Main;
import javafx.scene.control.Button;

public class CMain extends Main{

	public void invokeBtAdd(){
		((Button) super.getElements().get("Hinzufügen")).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				//hier kommt dann das rein, was passieren soll, wenn du auf den Button klickst
			}
		});
	}

}
