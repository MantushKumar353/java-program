
import java.util.Scanner;

public class StringPattern {
    public static void main(String[] args) {
        System.out.println("Enter your program in java language:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        pattern(str);
    }

    static String pattern(String str){
        String s="";
       StringBuffer st=new StringBuffer()
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch>='0'||ch<='9'){
                str+=ch;
            }
            if(str.length()>0)
            st.add(str);
        
        }
    }

}
