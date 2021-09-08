package observer;

public class Baidu implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }
    //
    public void display(){
        System.out.println("baidu" + temperature + "==");
        System.out.println("baidu" + pressure + "==");
        System.out.println("baidu" + humidity + "==");

    }

}
