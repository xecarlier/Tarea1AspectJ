package ob;

import javafx.scene.paint.Color;

public class ObserverA implements Observer {
	private principalPane pane;

	public ObserverA (principalPane p) {
		this.pane=p;
		this.pane.addObserver(this); 
		
	}
	
	public void update(Color c){
		
		System.out.println("El codigo del color actual es :"+c);
		
	}
	
	

}
