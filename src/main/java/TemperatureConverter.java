import java.util.Scanner;

public class TemperatureConverter {

    public TemperatureConverter() {
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9)/ 5 + 32;
    }
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    public static void main(String[] args){
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Scanner input = new Scanner(System.in);
        System.out.println("Input Kelvin");
        double kelvin = input.nextInt();
        double celsius = temperatureConverter.kelvinToCelsius(kelvin);
        System.out.printf("%.0f K is %.2f °C\n", kelvin, celsius);

        System.out.println(temperatureConverter.fahrenheitToCelsius(32));
        System.out.println(temperatureConverter.celsiusToFahrenheit(27));
        System.out.println(temperatureConverter.isExtremeTemperature(27));
    }
}
