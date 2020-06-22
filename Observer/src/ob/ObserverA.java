package ob;

import javafx.scene.paint.Color;

public class ObserverA implements Observer {
	private principalPane pane;

	public ObserverA (principalPane p) {
		this.pane=p;
		this.pane.addObserver(this); 
		
	}
	
	public void update(Color c, String color){
		
		System.out.println("El codigo del color actual es :"+c);
		System.out.println("El color actual es :"+color);
	}
	
	

}
