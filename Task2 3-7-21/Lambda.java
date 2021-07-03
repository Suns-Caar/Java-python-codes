import java.util.Scanner;

interface TemperatureV2 {
    public float temp(float t);
}
//class FahrenheitCelsius implements Temperature {
//
//    @Override
//    public float temp(float t) {
//        t = ((t - 32) * 5) / 9;
//        return t;
//    }
//}

public class lambda {
    public static void main(String[] args) {
        System.out.println("Enter temperature in Fahrenheit");
        Scanner scan = new Scanner(System.in);
//        Temperature conver = new FahrenheitCelsius();
//        float celsius = conver.temp(t);
//        System.out.println("Temp in celsius is:" + celsius);

        TemperatureV2 temperature = (float temp)->{
            System.out.println("Temp in celsius is:" + ((temp-32)*5)/9);
            return 0;
        };
        float celsiusTemp = scan.nextFloat();
        temperature.temp(celsiusTemp);
    }
}
