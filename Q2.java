
import java.util.Scanner;

// Write a program to Print multiplication table of a given number.

public class Q2 {
    public static void main(String[] args) {
        
        int n , count=1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        n= sc.nextInt();

        for(int i=0;i<=10;i++){
            count =n*i;
            System.out.println(count);
        }
    }
}
