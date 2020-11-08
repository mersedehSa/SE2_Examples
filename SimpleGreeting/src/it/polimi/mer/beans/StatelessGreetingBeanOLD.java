package it.polimi.mer.beans;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;

@Stateless
public class StatelessGreetingBeanOLD {
	private final static Logger LOGGER =  
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
public Integer count;

	public StatelessGreetingBeanOLD() {
		setCount(0);
        LOGGER.log(Level.INFO, "Stateless Constructor is Called"); 

	}
	
	public String greeting() {
		Integer currentIntance=getCount();
		currentIntance=currentIntance + 1;
		setCount(currentIntance);
		
		return ("This Greeting from Stateless Bean!");
	}
	
	
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	


}
