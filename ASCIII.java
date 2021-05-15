// ascii to text
import java.util.Scanner;
public class asciitotext {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter number of ascii values");
        int a = x.nextInt();
        int net[]= new int[a];
        for(int i = 0 ; i < a;i++){
            System.out.println("enter ascii values");
            net[i] = x.nextInt();
        }
        for(int j = 0 ; j < a;j++){
            System.out.println((char) net[j]);

        }
    }
}
