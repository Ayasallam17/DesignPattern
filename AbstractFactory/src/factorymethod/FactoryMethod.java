 
package factorymethod;
 
public class FactoryMethod {
    public static void main(String[] args) {
        PizzaStore nystore = new NYpizzaStore();
        nystore.orderPizza("cheese");
    }
    
}
