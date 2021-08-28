 
package pizzashop;
 
public class NYPizzaStore  extends PizzaStore{ //subclass encapsulate the instantiation of products

    @Override
    public Pizza createPizze(String item) {
        if(item.equals("chesse")){
            return new NYPizzaChesse();
        }
        else return null;
    }
    
}
