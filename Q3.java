
import java.util.Scanner;

//Write a program to Find factorial of a number

public class Q3 {
    public static void main(String[] args) {
        
        int n,fact=1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number ");
        n= sc.nextInt();

        if(n>=1){
            for(int i=1;i<=n;i++){
                fact= fact*i;}
            System.out.println(fact);
        }
        
        else{
            System.out.println(fact);
        }
    }
}
