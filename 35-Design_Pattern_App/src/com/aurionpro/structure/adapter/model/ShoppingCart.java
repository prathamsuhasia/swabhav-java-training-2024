
package com.aurionpro.structure.adapter.model;

import java.util.List;

public class ShoppingCart {
	List<IItems>  cartItems ;
	
	
	
	public ShoppingCart(List<IItems> cartItems) {
		super();
		this.cartItems = cartItems;
	}

	public void addItemToCart(IItems item) {
		cartItems.add(item);
		
	}
	
	public List<IItems> getCartItems() {
		
		return cartItems;
		
	}
	public double getCartPrice() {
		 double cartPrice = cartItems.stream()
		 		.map((cartItem)->cartItem.getItemPrice())
		 		.reduce(0.0,(number1,number2)->number1+number2);
		 return cartPrice;
	}

}
