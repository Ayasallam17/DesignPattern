 
package factorymethod;

 
public class NYpizzaStore extends PizzaStore{ // concrete factories implement factory method to produce the product

 
    @Override
    protected Pizza createPizza(String item){  // override the factory method to create the product
        Pizza pizza = null;  // depend upon abstract type this type is pizza
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory(); //each 
        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);  // produce the product
        }
        return pizza;
    }
}
