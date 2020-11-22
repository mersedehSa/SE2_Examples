package it.polimi.SE2.mer.beans;

import javax.ejb.Stateless;

@Stateless
public class StatelessGreetingBean {
	public Integer count;

	public StatelessGreetingBean() {
		setCount(0);

	}
	
	public String greeting() {
		Integer currentIntance=getCount();
		currentIntance=currentIntance + 1;
		setCount(currentIntance);
		
		return ("This Greeting came from Stateless Bean!");
	}
	
	
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
}
