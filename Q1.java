
import java.util.Scanner;

// Write a program to Calculate sum of first N natural numbers.
 public class Q1 {
    public static void main(String[] args) {

        int n , count=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n=sc.nextInt();

        for(int i=0;i<=n;i++){
            count=count+i;
        }
        System.out.println(count);
    }
 }