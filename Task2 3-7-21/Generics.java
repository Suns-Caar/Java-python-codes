public class generics{
    public static < T > void genericArray(T[] types) {
        for ( T type : types){
            System.out.print(type + " ");
        }
        System.out.println();
    }
    public static void main( String args[] )
    {
        Integer[] int_Array = { 1, 2 , 3, 4, 5 };
        String[] string_Array  = {"Hello", "World"};

        System.out.println( "Integer Array:" );
        genericArray(int_Array);

        System.out.println( "String array:" );
        genericArray(string_Array );
    }
}
