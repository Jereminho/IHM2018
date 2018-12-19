package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class Test3 extends Test2 {
	
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
	private RadioButton qs1;
	@FXML
	private RadioButton qs2;
	@FXML
	private RadioButton qs3;
	@FXML
	private Button bntfintest;
	
	private static int score;
	
	
	public void affichagescore() {

		
	}

	
	public void recupval3(ActionEvent event) throws IOException{
		
		score=Test2.getscore2();
	if(qs3.isSelected()) {
		
		score++;
		
		};
		System.out.println(score);
		switch(score) {
		case 0:
			Alert score0 = new Alert(AlertType.INFORMATION);
			score0.setTitle("Votre Résultat");
			score0.setHeaderText(null);
			score0.setContentText("Votre score est de 0, vous avez besoin de revoir les bases de cette langue :$");
			score0.showAndWait();
			break;
		case 1:
			 Alert score1 = new Alert(AlertType.INFORMATION);
			score1.setTitle("Votre Résultat");
			score1.setHeaderText(null);
			score1.setContentText("Votre score est de 1, vous êtes débutant ne lâcher rien !!");
			score1.showAndWait();
			break;
		case 2:
			 Alert score2 = new Alert(AlertType.INFORMATION);
			 score2.setTitle("Votre Résultat");
			 score2.setHeaderText(null);
			 score2.setContentText("Votre score est de 2, vous êtes dans le niveau intermédiaire, persister !!");
			 score2.showAndWait();
			
			break;
		case 3:
			 Alert score3 = new Alert(AlertType.INFORMATION);
			 score3.setTitle("Votre Résultat");
			 score3.setHeaderText(null);
			 score3.setContentText("Votre score est de 3, vous êtes dans le niveau Avancer, C'est Parfait ;) !!");
			 score3.showAndWait();
			break;
			
			
			
		}
		
		
		
		Test.setscore(0);
	/*test3(event);*/}
	
	

}
