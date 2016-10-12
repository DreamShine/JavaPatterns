package JavaUtilObserverExample;

import java.util.Currency;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by DreamShine on 11/10/2016.
 */
public class currentConditionsDisplay implements Observer, Display
{
    Observable observable;
    private float temperature;
    private float humidity;

    public currentConditionsDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg)
    {
        if(observable instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }


    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");
    }
}
