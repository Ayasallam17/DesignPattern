 
package factorymethod;
 
public class CheesePizza extends Pizza{  //concrete implementaion of pizza type, client "pizza store" do not know about this
    
    PizzaIngredientFactory ingredientFactory; // each pizza has a ingredient factory mean ref to ingregient
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        setName("cheese pizza");
        System.out.println("prepare "+ getName());
        dough = ingredientFactory.createDough(); // depend upon dough abstraction 
        sauce = ingredientFactory.createSauce();
    }
    
}
