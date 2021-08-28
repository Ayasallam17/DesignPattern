/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzz;

/**
 *
 * @author aya
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }
    
    @Override
    double cost() {
        return 1.99;
    }
    
}
