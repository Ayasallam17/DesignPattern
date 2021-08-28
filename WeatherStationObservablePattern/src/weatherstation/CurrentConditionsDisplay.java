/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author aya
 */
public class CurrentConditionsDisplay implements Observer , display{
    private float temperature;
    private float humidity;
    private final Subject weatherData;  // programing to interface not implementation if subject has another class it easy to reach it

    public CurrentConditionsDisplay(Subject wd){
        this.weatherData = wd;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("current condition: " + temperature + "F degree and " + humidity + "% humidity");
    }
    
}
