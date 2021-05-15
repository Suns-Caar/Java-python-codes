//Write a program to implement the following:
//During acceleration  testingz you press 1 once when the car leaves the start line and press once again when the car crosses the finish line. The program should print the acceleration time. Now the endurance testing starts and you give an input 2. Now whenever the car passes the startline you press 1 the lap time is printed. Now when acceleration testing starts you press 2 again.  At the end of you press 0 to stop the program
import java.util.Scanner;
public class accel {
    public static void main(String[] args){
        long start = 0;
        long end = 0;
        Scanner st = new Scanner(System.in);
        //StopWatch watch = new StopWatch();
        System.out.println("Enter 1 to start/end accelaration time: ");
        int a = st.nextInt();
        int b = 2;
        if (a == 1){
            start = System.nanoTime();
            b = st.nextInt();
            if (b == 1){
                end = System.nanoTime();
                float elapsedtime = end - start;
                System.out.println(elapsedtime/1000000000);
            }else{
                System.out.println("invalid second input");
            }
        }else if (a == 2){
            start = System.nanoTime();
            while( b != 0 ){
                b = st.nextInt();
                if( b == 1){
                    end = System.nanoTime();
                    float elapsedtime = end - start;
                    System.out.println(elapsedtime/1000000000);
                    start = end;
                }else if (b == 0){
                    System.out.println("Session Closed.");
                }
            }
        }
    }
}
