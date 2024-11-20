import java.util.Scanner;

public class pattrn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your program in java language:");
        String str = sc.nextLine();
        patter(str);

    }

    public static void patter(String s) {
        int n = 0;
        for (int i = s.length(); i > 0; i--) {
            String str = "";

            for (int j = n; j < s.length(); j++) {
                str += s.charAt(j);
            }
            n++;
            System.out.println(str);
        }
    }
}
