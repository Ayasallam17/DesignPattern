/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

public abstract class PizzaStore {  // creator class to mainpulate product and hold the factor method
    
// this class is the client it do not car about creating object it just know the abstract type "pizza"
//    SimplePizzaFactory factory;
//
//    public PizzaStore(SimplePizzaFactory factory) {
//        this.factory = factory;
//    }
    
    Pizza orderPizza(String type){
        Pizza pizza;
        
        pizza = createPizze(type);  // th
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
    protected abstract Pizza createPizze(String item);  // this is an abstract factory method
}
