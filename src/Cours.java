package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Cours extends Accueil {
	//Menu gauche btn
	@FXML
	private Button btntest;
	@FXML
	private Button btnmag;
	@FXML
	private Button btnate;
	@FXML
	private Button btnout;
	@FXML
	private Button btndic;
	@FXML
	private Button btncompte;
	@FXML
	private Button btnaide;
	@FXML
	private Button btnhome;
	@FXML
	private Button btnpara;
	
	// btn navigation cours
	
	@FXML
	private Button btnretourcours;
	@FXML
	private Button btnexocouleurs;
	@FXML
	private Button btnccouleurs;
	@FXML
	private Button btncchiffres;
	
	
	//fonction navigation
	
	@FXML
	public void ccouleurs(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Ccouleurs.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);

}
	@FXML
	public void retourcours(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Cours.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);

}

	@FXML
	public void exocouleurs(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Exocouleurs.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);

}
	
	@FXML
	public void cchiffres(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Cchiffres.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);

	}
	//Fonction exercices
}
