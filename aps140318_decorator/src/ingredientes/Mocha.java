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
public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Mocha " + this.beverage.getDescription();
    }

    @Override
    public double cost() {
        return 3 + this.beverage.cost();
    }
    
}
