 
package starbuzz;
 
public abstract class Beverage {
    String description = "non description no beverage ";
    int beverageSize;
    int TALL = 1,
        GRAND = 2,
        VENTI = 3;
    int count = 1;
    String getDescription(){
        return description;
    }
    void setSize(int size){
        this.beverageSize = size;
    }
    int getSize(){
        return this.beverageSize;
    }
//    void setCount(int count){
//        this.count = count;
//        System.err.println(count);
//    }
//    int getCount(){
//        return this.count;
//    }
    abstract double cost();
}
