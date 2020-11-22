package it.polimi.SE2.mer.interfaces;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ShoppingList_Interface {
	
	public void addNewProduct(String p); 
	
	public void removeProducts(String p);

	public List<String> getProducts();
}
