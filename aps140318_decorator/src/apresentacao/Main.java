/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import beverage.Beverage;
import cafes.Espresso;
import ingredientes.Milk;
import ingredientes.Soy;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Beverage espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new Soy(espresso);
        System.out.println("Descrição:"+espresso.getDescription());
        System.out.println("Preço final:"+espresso.cost());
        
    }
    
}
