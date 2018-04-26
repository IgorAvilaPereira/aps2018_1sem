package com.modelo;

import java.util.*;


public class Garconete {

	private MenuPanquecaria panquecaria;
	private MenuRestauranteVegano vegano;
	
	public Garconete(MenuPanquecaria panquecaria, MenuRestauranteVegano vegano) {
		this.panquecaria = panquecaria;
		this.vegano = vegano;
	}



	public void printMenu() {
		
		Iterator iteratorVegano = vegano.createIterator();
		while (iteratorVegano.hasNext()){
			MenuItem item = (MenuItem) iteratorVegano.next();
			System.out.println(item);
		}
		
		Iterator iteratorPanquecaria = panquecaria.createIterator();
		while (iteratorPanquecaria.hasNext()){
			MenuItem item = (MenuItem) iteratorPanquecaria.next();
			System.out.println(item);
		}
		
		
//		ArrayList<MenuItem> menuVegano = vegano.getMenuItems();
//		MenuItem[] menuPanquecaria = panquecaria.getMenuItems();
//		
//		for(MenuItem vegano : menuVegano) {
//			System.out.println(vegano);
//		}
//		
//		for(int i = 0; i < panquecaria.getQuantidadeAtual(); i++) {
//			System.out.println(menuPanquecaria[i]);
//		}
	}
	
}
