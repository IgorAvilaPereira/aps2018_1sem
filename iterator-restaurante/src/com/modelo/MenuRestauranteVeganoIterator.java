package com.modelo;

import java.util.Iterator;
import java.util.function.Consumer;

public class MenuRestauranteVeganoIterator implements Iterator {

	private MenuRestauranteVegano vegano;
	private int posAtual;
	
	public MenuRestauranteVeganoIterator(MenuRestauranteVegano vegano){
		this.posAtual = 0;
		this.vegano = vegano;
	}
	
	public boolean hasNext() {		
		return posAtual < vegano.getMenuItems().size();
	}

	public Object next() {
		// TODO Auto-generated method stub
		if (hasNext()){
			MenuItem menuItem = vegano.getMenuItems().get(posAtual);
			posAtual++;
			return menuItem;
		}
		return null;
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

	public void forEachRemaining(Consumer action) {
		// TODO Auto-generated method stub
		
	}

}
