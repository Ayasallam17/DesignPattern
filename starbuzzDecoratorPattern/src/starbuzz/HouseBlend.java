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
public class HouseBlend  extends Beverage{

    public HouseBlend() {
        description = "House blend coffe";
    }
    
    @Override
    double cost() {
        return .89;
    }
    
}
