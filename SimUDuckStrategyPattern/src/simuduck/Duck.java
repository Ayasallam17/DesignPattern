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
public abstract class Duck  {
    FlyBehaviors flyBehaviors;    // encapsulate fly behavior
    QuackBehaviors quackBehaviors; // program to interface or supertype
    public abstract void display();
    public void setFlyBehaviors( FlyBehaviors fb ){
        flyBehaviors = fb;
    }
    public void setQuackBehaviors( QuackBehaviors qb ){
        quackBehaviors = qb;
    }
    public void performFly(){
        flyBehaviors.fly();
    }
    public void performQuack(){
        quackBehaviors.quack();
    }
    // any commom behaviors is here like swimming 
}
