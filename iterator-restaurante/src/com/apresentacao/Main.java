package com.apresentacao;

import com.modelo.Garconete;
import com.modelo.MenuPanquecaria;
import com.modelo.MenuRestauranteVegano;

public class Main {

	public static void main(String [] args) {
		
		MenuPanquecaria menuPanquecaria  = new MenuPanquecaria();
		MenuRestauranteVegano menuVegano = new MenuRestauranteVegano();
		
		Garconete garconete = new Garconete(menuPanquecaria, menuVegano);
		
		garconete.printMenu();
	}
	
}
