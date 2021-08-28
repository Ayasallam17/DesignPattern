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
public class Soy extends CondimentDecorator{
    Beverage beverage;
    
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription(){
        return (beverage.getDescription() + " ,Soy");    
    }
    @Override
    double cost() {
        cost = beverage.cost();
        beverageSize = beverage.getSize();
        if(beverageSize == beverage.TALL){
            cost += 10;
        }else if(beverageSize == beverage.GRAND){
            cost += 20;
        }else if(beverageSize == beverage.VENTI){
            cost += 30;
        }
    return cost;
    }
    
}
