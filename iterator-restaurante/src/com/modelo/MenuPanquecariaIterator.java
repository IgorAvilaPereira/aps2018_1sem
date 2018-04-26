package com.modelo;

import java.util.Iterator;
import java.util.function.Consumer;

public class MenuPanquecariaIterator implements Iterator {

	private int				posAtual;
	private MenuPanquecaria menuPanquecaria;
	
	public MenuPanquecariaIterator(MenuPanquecaria menuPanquecaria) {
		this.posAtual 		 = 0;
		this.menuPanquecaria = menuPanquecaria;
	}
	
	public boolean hasNext() {
		return posAtual < menuPanquecaria.getQuantidadeAtual();
	}

	public Object next() {
		if (hasNext()) {
			MenuItem menuItem = menuPanquecaria.getMenuItems()[posAtual];
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
