// Write a program to Check whether a number is prime. 
import java.util.Scanner ;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int x= sc.nextInt();
        int count =0;
        for(int i=1; i <=x ; i++){
            if(x % i == 0){
                count =count +1;
            }
        }
        if(count==2){
            System.out.println("number is prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}