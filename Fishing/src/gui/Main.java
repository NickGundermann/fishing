package gui;


import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application{

	HashMap<String, Node> elements = new HashMap<String, Node>();

	private BorderPane initMainPane() {
		BorderPane pane = new BorderPane();
		
		pane.setTop(initHeadline());
		pane.setCenter(initControlPane());
		
		return pane;
	}

	/**
	 * Initialisiert das Pane für die GUI-Kontrolle
	 * @return
	 */
	private Node initControlPane() {
		GridPane grid  = new GridPane();
		elements.put("Hinzufügen", new Button("Hinzufügen"));
		elements.put("Liste", new Button("Liste"));
		
		grid.add(elements.get("Liste"), 0, 0);
		grid.add(elements.get("Hinzufügen"), 0, 1);
		return grid;
	}



	@Override
	public void start(Stage primeStage) throws Exception {
		Group group = new Group();
		Scene scene = new Scene(group, 500, 800);
		
		BorderPane mainPane = initMainPane();
		group.getChildren().add(mainPane);
		
		primeStage.setScene(scene);
		primeStage.show();
	}



	/**
	 * Initialisiert die Überschrift
	 * @return Label
	 */
	private Node initHeadline() {
		Label headline =  new Label("Hauptmenü");
		return headline;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	
	public HashMap getElements(){
		return elements;
	}
}
