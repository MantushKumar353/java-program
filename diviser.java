import java.util.*;

public class diviser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your program");
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        long div = diviser(n);
        System.out.print(div);
    }

    static long diviser(int N) {
        long count = 0;
        for (int i = 1; i <= N; i++) {
            int temp = 0;
            if (N % i == 0) {
                temp = i;

                if (temp % 3 == 0) {
                    count++;
                }
            }
        }
        return count;

    }

}
