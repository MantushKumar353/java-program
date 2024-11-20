import java.util.Scanner;

public class chech {
    public static void main(String[] args) {
        System.out.println("Enter your program in array:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size in program:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        int x = sc.nextInt();
        int ans = chek(arr, num, x);
        System.out.print(ans);
    }

    static int chek(int arr[], int num, int x) {
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (x == arr[i]) {
                count++;
            }
        }
        return 0;

    }
}
