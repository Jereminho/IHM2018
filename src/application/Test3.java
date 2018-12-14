package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
	
	

	
	public void recupval3(ActionEvent event) throws IOException{
		
		score=Test2.getscore2();
	if(qs3.isSelected()) {
		
		score++;
		
		};
		System.out.println(score);
		switch(score) {
		case 0:
			System.out.println("You're Bad");
			break;
		case 1:
			System.out.println("Débutant");
			break;
		case 2:
			System.out.println("Intermédiaire");
			break;
		case 3:
			System.out.println("Avancer");
			break;
			
		}
		Test.setscore(0);
	/*test3(event);*/}
	
	

}
