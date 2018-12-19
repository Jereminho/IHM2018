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
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class Test extends Accueil {
	//variables
	public int cmpttest=0;
	
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
	
	//BtnduTest
	@FXML
	private RadioButton qt1;
	@FXML
	private RadioButton qt2;
	@FXML
	private RadioButton qt3;
	@FXML
	private Button continuez;

private static int score=0;
	
public static void setscore(int aux) {
	score=aux;
}
public static int getscore() {
	
	return score;
}
	@FXML
	public void test2(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Test2.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);
		}
	
	
	public void recupval1(ActionEvent event) throws IOException{
		
	if(qt1.isSelected()) {
		score++;
	
				
	};
	System.out.println(score);
	test2(event);
	

	
}




}
