package it.polimi.SE2.mer.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import it.polimi.SE2.mer.entities.AllmyUsers;

@Stateless
public class Mybean {
	
	@PersistenceContext(unitName = "simpleJPA")
    private EntityManager em;
	
	public String beanMethod(String userName, String userEmail, String userPass) {
		
    	AllmyUsers user=new AllmyUsers();
    	user.setFullname(userName);
    	user.setPassword(userEmail);
    	user.setEmail(userPass);
    	em.persist(user);
		return "Registration Successful!"; 
		
		
	}

}
