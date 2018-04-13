import java.util.*;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;


    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.format("Current conditions: %.1fF degrees and %.1f%% humidity\n",temperature,humidity);
    }
}
