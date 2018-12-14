package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class Exercice extends Accueil {
	
	//menu gauche
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
	
	//BtnExocouleurs
	@FXML
	private RadioButton qt1;
	@FXML
	private RadioButton qt2;
	@FXML
	private RadioButton qt3;
	@FXML
	private Button continuez;
	
	//BtnExocouleurs2
	@FXML
	private RadioButton qx1;
	@FXML
	private RadioButton qx2;
	@FXML
	private RadioButton qx3;
	@FXML
	private Button continuez2;
	
	//BtnExocouleurs3
	@FXML
	private RadioButton qs1;
	@FXML
	private RadioButton qs2;
	@FXML
	private RadioButton qs3;
	@FXML
	private Button continuez3;
		
	//BtnExocouleurs4
	@FXML
	private RadioButton qv1;
	@FXML
	private RadioButton qv2;
	@FXML
	private RadioButton qv3;
	@FXML
	private Button finirexocouleurs;
	
	
	//fonctions navigation exercices
	
	@FXML
	public void exocouleurs(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Exocouleurs2.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);

}

	@FXML
	public void exocouleurs2(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Exocouleurs3.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);

}

	@FXML
	public void exocouleurs3(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Exocouleurs4.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);

}
	
	
}
