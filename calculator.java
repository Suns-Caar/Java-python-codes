// calculator
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operator");
        System.out.println("1.addition.");
        System.out.println("2.subtraction.");
        System.out.println("3.multiplication.");
        System.out.println("4.sin.");
        System.out.println("5.cos.");
        System.out.println("6.tan.");
        System.out.println("7.exponential.");
        int nmbr = sc.nextInt();

        if (nmbr == 1) {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            int add = (a + b);
            System.out.println("The addition of " +a+ " and " +b+ " is " +add+ "." );
        }

        else if (nmbr == 2) {
            System.out.print("Enter the first number: ");
            int c = sc.nextInt();
            System.out.print("Enter the second number: ");
            int d = sc.nextInt();
            int sub = (c - d);
            System.out.println("Subtracting " +d+ " from " +c+ " gives " +sub+ "." );
        }

        else if (nmbr == 3) {
            System.out.print("Enter the first number: ");
            int e = sc.nextInt();
            System.out.print("Enter the second number: ");
            int f = sc.nextInt();
            int mult = (e * f);
            System.out.println("The multipication of " +e+ " and " +f+ " is " +mult+ "." );
        }

        else if (nmbr == 4) {
            System.out.print("Enter the angle in degrees: ");
            double degree1 = sc.nextDouble();
            double radian1 = Math.toRadians(degree1);
            System.out.println("The sin of " +degree1+ " degrees is " +Math.sin(radian1)+ "." );
        }

        else if (nmbr == 5) {
            System.out.print("Enter the angle in degrees: ");
            double degree2 = sc.nextDouble();
            double radian2 = Math.toRadians(degree2);
            System.out.println("The cos of " +degree2+ " degrees is " +Math.cos(radian2)+ "." );
        }

        else if (nmbr == 6) {
            System.out.print("Enter the angle in degrees: ");
            double degree3 = sc.nextDouble();
            double radian3 = Math.toRadians(degree3);
            System.out.println("The tan of " +degree3+ " degrees is " +Math.tan(radian3)+ "." );
        }

        else if (nmbr == 7) {
            System.out.print("Enter the first number: ");
            double g = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double h = sc.nextDouble();
            double result4 = (Math.pow(g,h));
            System.out.println(+ g + " to the power of " + h + " equals " + result4 + ".");
        }

        else
            System.out.println("invalid");

    }
}
