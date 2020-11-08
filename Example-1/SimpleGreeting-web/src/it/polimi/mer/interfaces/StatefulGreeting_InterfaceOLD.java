package it.polimi.mer.interfaces;

import javax.ejb.Remote;

@Remote
public interface StatefulGreeting_InterfaceOLD {
	
String greeting();
	
	Integer increasCount();
	
	Integer getCount();

}
