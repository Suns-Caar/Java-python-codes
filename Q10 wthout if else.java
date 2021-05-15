//Q10 with no if else
java.util.Scanner;
public class noifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first lap time in mm:ss:msms without :");
        String a = sc.nextLine();
        System.out.println("Enter 2nd lap time");
        String b = sc.nextLine();
        System.out.println("Enter 3rd lap time:");
        String c = sc.nextLine();

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);

        int temp = x < y ? x : y;
        int result = z < temp ? z : temp;

        String x = Integer.toString(result);

        String mm = x.substring(0,2);
        String ss = x.substring(2,4);
        String msms = x.substring(4,6);

        System.out.println("The fastest lap time is " +mm+ ":" +ss+ ":"  +msms+ ".");
    }
}
