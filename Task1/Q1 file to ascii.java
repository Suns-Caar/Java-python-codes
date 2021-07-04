import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class text3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\College\\code\\sample.txt");
//        int i  = 0;
        Scanner test = new Scanner(file);


        List<List<Integer>> asciimatrix = new ArrayList<>(new ArrayList<>());
        System.out.println("asciimatrix: " + asciimatrix);

        while (test.hasNextLine()) {
            String line = test.nextLine();
            char[] line2 = line.toCharArray();
            List<Integer> templist = new ArrayList<>();
            for (int i = 0; i < line2.length; i++) {
                char c = line.charAt(i);
                int j = (int) c;
                templist.add(j);
            }
            asciimatrix.add(templist);


        }
        System.out.println(asciimatrix);


        Scanner newinput = new Scanner(System.in);
        System.out.println("enter row");
        int r = newinput.nextInt();
        r = r - 1;
        System.out.println("enter column");
        int c = newinput.nextInt();
        c = c - 1;
        System.out.println("enter value");
        int val = newinput.nextInt();
        asciimatrix.get(r).set(c, val);
        //System.out.println(asciimatrix);
        
        //asciimatrix.forEach(System.out::println);
        // System.out.println(asciimatrix.get(r).get(c));
//        int k;

        char ch = 0;
        String s = "";
        PrintWriter writer = new PrintWriter("D:\\College\\code\\sample.txt");
        for (int i = 0; i < asciimatrix.size(); i++) {
            ch = 0;
            for (int j = 0; j < asciimatrix.get(i).size(); j++) {
                //  System.out.print(asciimatrix.get(i).get(j) + " ");
                int asc = asciimatrix.get(i).get(j);
                ch = (char) asc;
                s = s + ch;
                System.out.print(ch);



            }
//            System.out.println();
            s = s + "\n";
        }
        writer.write(s);
        writer.close();
    }
}
