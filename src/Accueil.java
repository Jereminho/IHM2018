package application;

import javafx.event.ActionEvent;
import java.io.IOException;



import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;



public class Accueil {
	//variable 
	
	
	//Button
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
	
	//Images
	@FXML
	private ImageView imghome;
	
	
	
	// Fonctions pour l'interconnection des pages
	@FXML
	public void test(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Test.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);

}
	
	@FXML
	public void magazine(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Magazine.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);

}
	@FXML
	public void outils(ActionEvent event) throws IOException {
		Parent homeView = FXMLLoader.load(getClass().getResource("Outils.fxml"));
		Scene homeScene = new Scene(homeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);
	}
	
		@FXML
			public void ateliers(ActionEvent event) throws IOException {
			Parent homeView = FXMLLoader.load(getClass().getResource("Cours.fxml"));
			Scene homeScene = new Scene(homeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(homeScene);
		
	}
		
		@FXML
		public void dictionnaires(ActionEvent event) throws IOException {
			Parent homeView = FXMLLoader.load(getClass().getResource("Dictionnaire.fxml"));
			Scene homeScene = new Scene(homeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(homeScene);
		}
		
		@FXML
		public void Accueil(ActionEvent event) throws IOException {
			Parent homeView = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
			Scene homeScene = new Scene(homeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(homeScene);
			}
		
		@FXML
		public void moncompte(ActionEvent event) throws IOException {
			Parent homeView = FXMLLoader.load(getClass().getResource("MonCompte.fxml"));
			Scene homeScene = new Scene(homeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(homeScene);
			}
		
		@FXML
		public void aide(ActionEvent event) throws IOException {
			Parent homeView = FXMLLoader.load(getClass().getResource("Aide.fxml"));
			Scene homeScene = new Scene(homeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(homeScene);
			}
		
		@FXML
		public void parametre(ActionEvent event) throws IOException {
			Parent homeView = FXMLLoader.load(getClass().getResource("Parametre.fxml"));
			Scene homeScene = new Scene(homeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(homeScene);
			}
		
	//Fonctions couleur dynamique btn 
		// Entrée
		@FXML
		public void Effethome(MouseEvent event) throws IOException {
			btnhome.setStyle("-fx-background-color :white;  -fx-text-fill:#05071F");
			/*imghome.setId("../IHM/Accueil.png");*/
		}
		public void Effetmag(MouseEvent event) throws IOException {
			btnmag.setStyle("-fx-background-color :white;  -fx-text-fill:#05071F;");}
		public void Effetate(MouseEvent event) throws IOException {
			btnate.setStyle("-fx-background-color :white;  -fx-text-fill:#05071F;");}
		public void Effetout(MouseEvent event) throws IOException {
			btnout.setStyle("-fx-background-color :white;  -fx-text-fill:#05071F;");}
		public void Effetcompte(MouseEvent event) throws IOException {
			btncompte.setStyle("-fx-background-color :white;  -fx-text-fill:#05071F;");}
		public void Effetdic(MouseEvent event) throws IOException {
			btndic.setStyle("-fx-background-color :white;  -fx-text-fill:#05071F;");}
		public void Effetpara(MouseEvent event) throws IOException {
			btnpara.setStyle("-fx-background-color :white;  -fx-text-fill:#05071F;");}
		public void Effetaide(MouseEvent event) throws IOException {
			btnaide.setStyle("-fx-background-color :white;  -fx-text-fill:#05071F;");}
	
		
		// Sortie
		@FXML
		public void NoEffethome(MouseEvent event) throws IOException {
			btnhome.setStyle("-fx-background-color :#05071F;  -fx-text-fill:white;");
			/*imghome.setId("../IHM/Accueil1.png");*/
			}
		public void NoEffetmag(MouseEvent event) throws IOException {
			btnmag.setStyle("-fx-background-color :#05071F;  -fx-text-fill:white;");}
		public void NoEffetate(MouseEvent event) throws IOException {
			btnate.setStyle("-fx-background-color :#05071F;  -fx-text-fill:white;");}
		public void NoEffetout(MouseEvent event) throws IOException {
			btnout.setStyle("-fx-background-color :#05071F;  -fx-text-fill:white;");}
		public void NoEffetcompte(MouseEvent event) throws IOException {
			btncompte.setStyle("-fx-background-color :#05071F;  -fx-text-fill:white;");}
		public void NoEffetdic(MouseEvent event) throws IOException {
			btndic.setStyle("-fx-background-color :#05071F;  -fx-text-fill:white;");}
		public void NoEffetpara(MouseEvent event) throws IOException {
			btnpara.setStyle("-fx-background-color :#05071F;  -fx-text-fill:white;");}
		public void NoEffetaide(MouseEvent event) throws IOException {
			btnaide.setStyle("-fx-background-color :#05071F;  -fx-text-fill:white;");}
}
