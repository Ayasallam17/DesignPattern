 
package factorymethod;
 
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{ // this factory know how to create each product

    @Override
    public Sauce createSauce() {  // each factory produce differnt implementaion for family of products
        return new MarinaraSauce();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }
    
}
