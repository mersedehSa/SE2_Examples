package it.polimi.mer.interfaces;

import javax.ejb.Stateful;

import it.polimi.SE2.mer.beans.StatefulGreeting_Interface;
@Stateful
public class StatefulGreetingBean implements StatefulGreeting_Interface {
	public Integer count=0;

		public StatefulGreetingBean() {

		}
		@Override
		public String greeting() {
			
			
			return ("This Greeting came from Stateful Bean!");
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