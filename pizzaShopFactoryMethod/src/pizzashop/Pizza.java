/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.ArrayList;

/**
 *
 * @author aya
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();
    void prepare(){
        System.out.println("prepare" + name);
        System.out.println("Tossing dough..");
        System.out.println("Adding sauce...");
        System.out.println("Toppings:");
        for(int i=0; i<toppings.size() ; ++i){
            System.out.println("   " + toppings.get(i));
        }
    }
    void bake(){
        System.out.println("Back for 25 minutes at 360");
    }
    void cut(){
        System.out.println("Cutting the pizaa into diagonal slices");
    }
    void box(){
        System.out.println("place pizza in official pizza store box");
    }
    public String getName(){
        return name;
    }
}
