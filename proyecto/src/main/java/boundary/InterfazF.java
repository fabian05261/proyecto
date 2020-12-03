package boundary;
//Profe esta interfaz UNICAMENTE muestra lo que diseñamos
//Ningún elemento tiene funcionamiento, pero si prueba el main
//este tiene todos los metodos de manera correcta
import java.io.File;
import java.net.URL;

// Java Program to create a BorderPane and 
// add Center, top, bottom, left, right 
// components and add it to the stage 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage; 

public class InterfazF extends Application { 
	
	
	// launch the application 
	public void start(Stage stage) 
	{ 
		
	

		try { 
			
			
			URL url = new File("src/main/resources/Ventana.fxml").toURI().toURL();
			
			Parent root = FXMLLoader.load(url);
		    
			
	        Scene scene = new Scene(root, 800, 600);
	    
	        stage.setTitle("FXML Welcome");	
	        stage.setScene(scene);
	        stage.show();
			
			// set title for the stage 
			stage.setTitle("Galeria");
			/*
			Button boton = new Button("Modificar");

			// create a label 
			TabPane label_center = new TabPane(); 
			AnchorPane anchorCompras=new AnchorPane();
			AnchorPane paneldecompra=new AnchorPane();
			
			anchorCompras.getChildren().add(paneldecompra);
			AnchorPane.setTopAnchor(boton, 125.0); 
            AnchorPane.setLeftAnchor(boton, 200.0); 
            AnchorPane.setRightAnchor(boton, 110.0); 
            AnchorPane.setBottomAnchor(boton, 125.0);
			anchorCompras.backgroundProperty();
			Tab tab1 = new Tab("Compras", anchorCompras);
			Tab tab2 = new Tab("Clientes", new Label("Show all cars available"));
			Tab tab3 = new Tab("Obras" , new Label("Show all boats available"));

			label_center.getTabs().add(tab1);
			label_center.getTabs().add(tab2);
			label_center.getTabs().add(tab3);*/

			// create a BorderPane 
			//BorderPane border_pane = new BorderPane(label_center);
			// create a scene 
			
			// set the scene 
			stage.setScene(scene); 


		} 

		catch (Exception e) { 

			e.printStackTrace();
		} 
	} 

	// Main Method 
	public static void main(String args[]) 
	{ 

		// launch the application 
		launch(args); 
	} 
}