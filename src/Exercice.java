package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Alert.AlertType;
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
	
	//btn exercice
	private static int scoreex=0;
	
	
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
	//fonction exercices 
	
	public static void setscoreex(int aux) {
		scoreex=aux;
	}
	
	// exo 1
	public void recupex1(ActionEvent event) throws IOException{
		
		if(qt3.isSelected()) {
			scoreex++;
		
					
		};
		System.out.println(scoreex);
		exocouleurs(event);
			
}
	//exo2
	
	public void recupex2(ActionEvent event) throws IOException{
		
		if(qx3.isSelected()) {
			scoreex++;
		
					
		};
		System.out.println(scoreex);
		exocouleurs2(event);
	}
	
	//exo3
public void recupex3(ActionEvent event) throws IOException{
		
		if(qs1.isSelected()) {
			scoreex++;
		
					
		};
		System.out.println(scoreex);
		exocouleurs3(event);
	}
	//exo4

public void recupex4(ActionEvent event) throws IOException{
	
	
if(qv2.isSelected()) {
	
	scoreex++;
	
	};
	System.out.println(scoreex);
	switch(scoreex) {
	case 0:
		Alert score0 = new Alert(AlertType.INFORMATION);
		score0.setTitle("Votre Résultat");
		score0.setHeaderText(null);
		score0.setContentText("Votre score est de 0, vous avez besoin de revoir l'integralite de la leçon :$");
		score0.showAndWait();
		break;
	case 1:
		 Alert score1 = new Alert(AlertType.INFORMATION);
		score1.setTitle("Votre Résultat");
		score1.setHeaderText(null);
		score1.setContentText("Votre score est de 1, vous devriez revoir votre leçon !!");
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
		 score3.setContentText("Votre score est de 3, C'est  pressque parfait =), une erreur d'inattention ?");
		 score3.showAndWait();
		break;
		
	case 4:
		 Alert score4 = new Alert(AlertType.INFORMATION);
		 score4.setTitle("Votre Résultat");
		 score4.setHeaderText(null);
		 score4.setContentText("Votre score est de 4, C'est Parfait ;) vous pouvez passer à la leçon suivante ;) !!");
		 score4.showAndWait();
		break;
		
		
		
	}
	
	
	
	setscoreex(0);
}
	
}
