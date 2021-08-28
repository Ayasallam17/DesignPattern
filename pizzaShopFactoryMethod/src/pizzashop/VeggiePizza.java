/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;
 
public class VeggiePizza extends Pizza{

    @Override
    void prepare() {
         System.out.println("prepare viggie");    }

    @Override
    void bake() {
         System.out.println("bake viggie");    }

    @Override
    void cut() {
         System.out.println("cut viggie");   }
    
}
