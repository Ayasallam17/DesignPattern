/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author aya
 */
public interface PizzaIngredientFactory { // abstract factory type to create a family of product
    Sauce createSauce();  // factory method to produce product one 
    Dough createDough();  
    // there are another products
    
}
