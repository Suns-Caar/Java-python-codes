/*Print the following output
*
**
***
****
*******/
import java.util.Scanner;
public class inputfromtheuser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int x =input.nextInt();

        int i = 0; int j = 0;
        for(i = 0;i < x;i++)
        { for (j = 0;j <= i;j++)
        {
            System.out.print("*");
        }
            System.out.println();
        }


    }
}
