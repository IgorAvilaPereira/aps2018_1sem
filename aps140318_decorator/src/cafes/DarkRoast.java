/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafes;

import beverage.Beverage;

/**
 *
 * @author iapereira
 */
public class DarkRoast extends Beverage {
    
    public DarkRoast(){
        super.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 4;
    }
    
}
