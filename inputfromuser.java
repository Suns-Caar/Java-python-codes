//Take a string, integer, char, double input from user and print it using (for input)
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer char string double ");
         int nmbr = input.nextInt();
         String cha = input.nextLine();
         String str = input.nextLine();
         double dub = input.nextDouble();

                            System.out.println("integer- " + nmbr);
                            System.out.println("char- " + cha);
                            System.out.println("string- " + str );
                            System.out.println("double- " + dub);
    }
}
