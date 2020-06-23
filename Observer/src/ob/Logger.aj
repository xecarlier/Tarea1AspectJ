package ob;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public aspect Logger {
	File archivo=new File("log.txt");
	pointcut buttonAction() : call(void principalPane.notificar(..));
	after():buttonAction(){
		Calendar cal = Calendar.getInstance();
    	int hora=cal.get(cal.HOUR_OF_DAY);
    	int min=cal.get(cal.MINUTE);
    	int seg=cal.get(cal.SECOND);
    	System.out.println("El cambio de color fue hecho a las: "+hora+":"+min+":"+seg);
    	try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivo,true))){
    		bw.append("El cambio de color fue hecho a las: "+hora+":"+min+":"+seg+"\n");
    	}catch(IOException ex) {
    		System.out.println(ex.getMessage());
    	}
	}
	
}
