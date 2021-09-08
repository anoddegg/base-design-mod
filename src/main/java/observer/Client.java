package observer;

public class Client {
    public static void main(String[] args) {
        //创建weatherdata
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions();
        Baidu baidu = new Baidu();
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baidu);
        System.out.println("----------");
        weatherData.setData(10,10,10);
    }
}
