package ob;

import java.util.Calendar;

public aspect Logger {
	
	pointcut buttonAction() : call(void principalPane.notificar(..));
	after():buttonAction(){
		Calendar cal = Calendar.getInstance();
    	int hora=cal.get(cal.HOUR_OF_DAY);
    	int min=cal.get(cal.MINUTE);
    	int seg=cal.get(cal.SECOND);
    	System.out.println("El cambio de color fue hecho a las: "+hora+":"+min+":"+seg);
	}
	
}
