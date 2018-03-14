/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingredientes;

import beverage.Beverage;

/**
 *
 * @author iapereira
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    

    @Override
    public String getDescription() {
        return "Milk \n" + this.beverage.getDescription();
    }

    @Override
    public double cost() {
        return 200 + this.beverage.cost();
    }
    
    
    
}
