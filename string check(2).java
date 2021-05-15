// case insensitive and sennsitive string check
import java.util.Scanner;
public class stringcheck {

    public static void main(String[] args) {

        String string1, string2;
        Scanner x = new Scanner(System.in);

        System.out.println("Enter the 1st string:");
        string1 = x.nextLine();

        System.out.println("Enter the 2nd string:");
        string2 = x.nextLine();

        if (string1.equals(string2))
            System.out.print("The strings are equal(case sensitive)")
            System.out.print("The strings are not equal(case sensitive).");

        String string3 = string1.toUpperCase();
        String string4 = string2.toUpperCase();

        if (str3.equals(str4))
            System.out.print("The strings are equal(case insensitive).");
        else
            System.out.println("The strings are not equal(case insensitive).");
    }
    }
}
