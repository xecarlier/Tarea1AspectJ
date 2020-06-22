package ob;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	
    public static void main(String[] args) {
    	launch(args);

    }
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		 	
	        principalPane panel = new principalPane(); 
	        new ObserverA(panel); // se agrega observador	        
	        Scene scene = new Scene(panel.getPane(), 300, 250);
	        primaryStage.setTitle("Observer");
	        primaryStage.setScene(scene);
	        primaryStage.show();

	}


	
	
}


	


