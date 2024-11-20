import java.util.*;

public class practise1 {
    public static void main(String[] args) {
        System.out.println("Create your program in java :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:");
        String m = sc.nextLine();
        String rev = reverseWord(m);
        System.out.println(rev);
    }

    public static String reverseWord(String m) {
        String[] word = m.split(" ");
        String rev = "";
        for (String i : word) {
            String st = i.substring(0, 1);
            String en = i.substring(1);
            rev += st.toUpperCase() + en + " ";
        }
        return rev;
    }
}
