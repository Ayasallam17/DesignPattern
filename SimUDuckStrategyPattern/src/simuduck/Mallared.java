/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

/**
 *
 * @author aya
 */
public class Mallared extends Duck{
    Mallared(){
        flyBehaviors = new FlyWithWings();
        quackBehaviors = new Quack();
    }
    @Override
    public void display() {
        System.out.println("mallared duck");
        }
    
}
