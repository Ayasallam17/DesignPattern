/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 *
 * @author aya
 */
public class SimplePizzaFactory {
    
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
