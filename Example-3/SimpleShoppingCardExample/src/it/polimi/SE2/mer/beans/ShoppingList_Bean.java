package it.polimi.SE2.mer.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

import it.polimi.SE2.mer.interfaces.ShoppingList_Interface;

@Stateful
public class ShoppingList_Bean implements ShoppingList_Interface {
	
	List<String> products= new ArrayList();

	@Override
	public void addNewProduct(String p) {
		products.add(p);
	}

	@Override
	public void removeProducts(String p) {
		products.remove(p);	
	}

	@Override
	public List<String> getProducts() {
		return products;
	}
	

}
