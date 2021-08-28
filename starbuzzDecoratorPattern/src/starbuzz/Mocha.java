/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzz;

/**
 *
 * @author aya
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage bv) {
        this.beverage = bv;
    }
    @Override
    public String getDescription(){
        //System.out.println(beverage.getDescription());
        return (beverage.getDescription() + " ,Mocha");    
    }

    @Override
    public double cost(){
        cost = beverage.cost();
        beverageSize = beverage.getSize();
        if(beverageSize == beverage.TALL){
            cost += 5;
        }else if(beverageSize == beverage.GRAND){
            cost += 10;
        }else if(beverageSize == beverage.VENTI){
            cost += 20;
        }
    return cost;
    }
    
}
