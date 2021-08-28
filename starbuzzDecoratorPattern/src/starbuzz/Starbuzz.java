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
public class Starbuzz {

    public static void main(String[] args) {
       Beverage beverage = new Espresso();
       beverage.setSize(1);
       beverage = new Soy(beverage);   // wrap beverage
       beverage = new Mocha(beverage);
       //beverage.setCount(2);
       System.out.println(beverage.getDescription() + " price " + beverage.cost()*2);
    }
    
}
