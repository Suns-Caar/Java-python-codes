//Create an integer array, fill it with user’s inputs and then sort it with bubble sort
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortNew {
    public static void main(String[] args) {
        // Input
        int[] arr = {5, 2, 3, 10, 12};

        // Bubble Sort
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length; j++)
                if (arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

//                System.out.println(temp);
            }
        }
        // Print array
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);
        }
    }
}
