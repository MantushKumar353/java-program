
import java.util.Scanner;

public class cycleShort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 3, 2, 1 };
        sort(arr);
        System.out.println(Arrayes.toString());
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int cort = arr[i] - 1;
            if (arr[i] != arr[cort]) {
                swap(arr, i, cort);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
