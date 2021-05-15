//create class
public class HelloWorld {
    public static void main(String[] args) {
        Intro a = new Intro();
        a.print_intro();
        inherit b = new inherit();
        b.print_hw();

        b.print_intro();
        b.print_hw();
    }
}

class inherit extends Intro{
    public static void print_hw(){
        System.out.println("Hello World");
    }
}





public class Intro {
    public static void print_intro() {
        System.out.println("Hi I am a student of MIT");
    }
}
