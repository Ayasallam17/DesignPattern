 
package weatherstation;

import java.util.ArrayList;

/**
 *
 * @author aya
 */
public class WeatherData implements Subject{
    private float temperture;
    private float humidity;
    private float pressure;
    private final ArrayList observers;

    public WeatherData() {
        observers = new ArrayList();
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       int i = observers.indexOf(o);
       if(i >= 0){
           observers.remove(i);
       }
    }
    public void measurmentsChanged(){
        notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for(int i = 0 ; i< observers.size() ; ++i){
            Observer observer =(Observer)observers.get(i);
            observer.update(temperture, humidity ,pressure);
        }
    }
     
    public void setMeasurements(float temp , float humidity , float pressure){
        this.temperture = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurmentsChanged();
    }
    
    
}
