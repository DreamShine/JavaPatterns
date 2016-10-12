package JavaUtilObserverExample;

/**
 * Created by DreamShine on 11/10/2016.
 */
public class WeatherStation
{
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        currentConditionsDisplay currentDisplay  = new currentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(25F,60F,80F);
        weatherData.setMeasurements(30F,40F,50F);
    }



}
