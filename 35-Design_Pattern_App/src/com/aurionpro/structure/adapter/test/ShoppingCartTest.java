package com.aurionpro.structure.adapter.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.structure.adapter.model.Biscuit;
import com.aurionpro.structure.adapter.model.Hat;
import com.aurionpro.structure.adapter.model.HatAdapter;
import com.aurionpro.structure.adapter.model.IItems;
import com.aurionpro.structure.adapter.model.ShoppingCart;

public class ShoppingCartTest {
	public static void main(String[] args) {
		IItems biscuit = new Biscuit("bourbon" , 40);
		Hat hat= new Hat("hat " , "hat" , 50, 500);
		IItems hat1 = new HatAdapter(hat);
		
		List<IItems> itemList = new ArrayList<>();
		itemList.add(biscuit);
		itemList.add(hat1);
		
		ShoppingCart shoppingCart = new ShoppingCart(itemList);
		
		
		System.out.println(shoppingCart.getCartPrice());
		
		
		
		
		
	}
}