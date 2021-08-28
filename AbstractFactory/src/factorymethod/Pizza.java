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
public  abstract class Pizza {  //this is the client use abstract factory and product inerface
    String name= "no pizza";
    Sauce sauce;
    Dough dough;
    abstract void prepare();
    void bake() {
    System.out.println("Bake for 25 minutes at 350");
    }
    void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
    }
    void box() {
    System.out.println("Place pizza in official PizzaStore box");
    }
    void setName(String name) {
    this.name = name;
    }
    String getName() {
    return name;
 }

}
