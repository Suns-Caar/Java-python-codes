// subtract using lambda expression
import java.util.Scanner;

interface Subtract{
    int sub(int num1,int num2);
}

public class Lambda2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two numbers needed to subtract");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        Subtract subtract = (int num3,int num4)->{
            System.out.println(Math.subtractExact(num3,num4));
            return 0;
        };
        subtract.sub(num1,num2);
    }
}
