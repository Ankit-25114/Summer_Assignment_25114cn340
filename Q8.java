
import java.util.Scanner;

// Write a program to Print prime numbers in a range. 

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();

    
        for(int i =1 ; i <= x ; i++){
            int count =0;

            for (int j = 1; j <=i; j++) {
                if(i % j == 0){
                    count ++;
                }
               
            }
                if(count==2){
                System.out.println(i+" ");
            }
            
        }
    }
}
