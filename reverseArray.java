import java.util.Scanner;
public class reverseArray {
    public static void main(String [] args){
        System.out.println("Welcome to java program in array:");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your size :");
        int size= sc.nextInt();
        int [] num= new int [size];
        for (int i=0; i<num.length; i++){

            System.out.print("Enter your element in array:");
            num[i]= sc.nextInt();
        }
       int [] fun= function(num);
        for(int i=0; i<fun.length; i++) {
            System.out.print(fun[i] + " ");
        }
    }
    public static int[] function(int [] num){
        int n= num.length;
        int [] ans =new int [n];
        int j=0;
        for(int i=n-1; i>=0; i--){
            ans[j++]=ans[i];
            }

        return  ans;
    }



}
