import java.uril.Scanner;

public class multiplyMatrix {
    public static void main(String[] args) {
        System.out.println("Enter your program in array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first size:");
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        System.out.println("Entrer your element in first arr1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("print in first arr1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        int[][] arr2 = new int[n][n];
        System.out.println("Entrer your element in second  arr2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.print("print in second arr2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}