/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

public  abstract class PizzaStore { // factory type 
    void orderPizza(String item){
        Pizza pizza = createPizza(item);  // encapsulate creating object, pizza store depend on pizza abstract class
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
    
    protected abstract Pizza createPizza(String item); // factory method
 
}
