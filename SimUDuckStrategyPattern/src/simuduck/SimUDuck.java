/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

public class SimUDuck {

     
    public static void main(String[] args) {
        Duck mallard = new Mallared();
        mallard.performFly();
        mallard.setFlyBehaviors(new FlyNoway());
        mallard.performFly();
    }
    
}
