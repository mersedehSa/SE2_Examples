package it.polimi.SE2.mer.interfaces;

import javax.ejb.Remote;

@Remote
public interface StatefulGreeting_Interface {
	
String greeting();
	
	Integer increasCount();
	
	Integer getCount();

}
