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

public class Test2 extends Accueil {
	
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
	private RadioButton qx1;
	@FXML
	private RadioButton qx2;
	@FXML
	private RadioButton qx3;
	@FXML
	private Button continuez2;
	
	 private static int score;
	

	//fct affichage test local
	 
		public static int getscore2() {
			
			return score;
		}
	@FXML
	public void test3(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Test3.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);
		}
	
	public void recupval2(ActionEvent event) throws IOException{
	
	score=Test.getscore();
	
	if(qx1.isSelected()) {
		score++;
		
		
	};
	System.out.println(score);
	test3(event);
}
	

	

}
