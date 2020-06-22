package ob;
import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class principalPane {
	
	private final ArrayList<Observer> observers;
	private StackPane pane;
	
	public principalPane() {
		this.observers = new ArrayList<Observer>();
		this.pane = new StackPane();
		makePane();
		
	}
	
	public StackPane makePane() {
		HBox cont = new HBox(30);
		cont.setAlignment(Pos.CENTER);
		cont.setPadding(new Insets(15, 12, 15, 12));
	    cont.setSpacing(10);
	    
		Button btn1 = new Button("Verde");
		btn1.setStyle("-fx-background-color: #008000");
		
		Button btn2 = new Button("Rojo");	
		btn2.setStyle("-fx-background-color: #FF0000");
		
		Button btn3 = new Button("Amarillo");	
		btn3.setStyle("-fx-background-color: #FFFF00");
		
		cont.getChildren().addAll(btn1,btn2,btn3);
			
		btn1.setOnAction(e ->{
			Color color = Color.GREEN;
			this.pane.setStyle("-fx-background-color: #008000"); 
			notificar(color, btn1.getText());
			
			
		});
		btn2.setOnAction(e ->{
			Color color = Color.RED;
			this.pane.setStyle("-fx-background-color: #FF0000"); 
			notificar(color, btn2.getText());
			
			
		});
		btn3.setOnAction(e ->{
			Color color = Color.YELLOW;			
			this.pane.setStyle("-fx-background-color: #FFFF00"); 
			notificar(color, btn3.getText());
			
		});
		
		
		this.pane.getChildren().add(cont);
				
		return this.pane;
	}
	
	
	
	public StackPane getPane() {
		return this.pane;
		
	}
	
	public void deleteObserver(Observer o) {
		observers.remove(o);
		
	}

	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void setPane(StackPane paneN) {		
		this.pane= paneN;	
		
	}
	
	public ArrayList<Observer> getObservers(){
		return observers;
	}
	
	public void notificar(Color c, String color) {
		for (Observer o : observers) {
			o.update(c, color);
			
		}
		
	}
	

}
	



