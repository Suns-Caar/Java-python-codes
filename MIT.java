// Mit class
public class MIT {
    public static void main(String[] args) {
        student a = new student();

        a.set_details("Sanskar",2009332212,"EIE");
        a.print_details();
    }


}
class student{
    private String name;
    private int reg_no;
    private String branch;
    public void print_details(){
        System.out.println(name);
        System.out.println(reg_no);
        System.out.println(branch);
    }
    public void set_details(String a,int b,String c){
        name= a ;
        reg_no= b;
        branch=c;
    }
}
