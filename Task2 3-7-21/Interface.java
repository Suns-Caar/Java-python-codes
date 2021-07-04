import java.util.Scanner;


interface Temperature {
    public float temp(float t);
}
 class FahrenheitCelsius implements Temperature {

    @Override
    public float temp(float t) {
        t = ((t - 32) * 5) / 9;
        return t;
    }
}

public class Interface {
    public static void main(String[] args) {
        System.out.println("Enter temperature in Fahrenheit");
        Scanner scan = new Scanner(System.in);
        float t = scan.nextFloat();

        Temperature conver = new FahrenheitCelsius();
        float celsius = conver.temp(t);
        System.out.println("Temp in celsius is:" + celsius);
    }
}
