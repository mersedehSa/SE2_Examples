package it.polimi.mer.beans;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;

@Stateless
public class StatelessGreetingBean {
	private final static Logger LOGGER =  
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
public Integer count;

	public StatelessGreetingBean() {
		setCount(0);
        LOGGER.log(Level.INFO, "Stateless Constructor is Called"); 

	}
	
	public String greeting() {
		Integer currentIntance=getCount();
		currentIntance=currentIntance + 1;
		setCount(currentIntance);
		
		return ("This message is coming from Stateless Bean an it is Intance:");
	}
	
	
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	


}
