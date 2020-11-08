package it.polimi.mer.beans;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateful;

import it.polimi.mer.interfaces.StatefulGreeting_InterfaceOLD;

@Stateful
public class StatefulGreetingBeanOLD implements StatefulGreeting_InterfaceOLD {
	public Integer count=0;

	private final static Logger LOGGER =  
	            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 


		public StatefulGreetingBeanOLD() {
	        LOGGER.log(Level.INFO, "Stateful Constructor is Called"); 

		}
		@Override
		public String greeting() {
			
			
			return ("This Greeting is coming from Stateful Bean!");
		}
		
		@Override
		public Integer increasCount() {
			return count=count +1;
		}
		
		@Override
		public Integer getCount() {
			return count;
		}
		
}