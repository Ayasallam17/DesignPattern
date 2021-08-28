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
public class PizzaShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        SimplePizzaFactory factory = new SimplePizzaFactory();
//        PizzaStore store = new PizzaStore(factory);
//        store.orderPizza("veggie");
          PizzaStore nystore = new NYPizzaStore();  // nystore delegated to order and create the pizza that is nypizza type
          Pizza pizza = nystore.orderPizza("chesse");
          System.out.println("Ethan order a "+ pizza.getName());
    }
    
}
