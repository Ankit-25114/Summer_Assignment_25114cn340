
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
    int n,digit, sum=0;
    Scanner sc =new Scanner(System.in);
    n= sc.nextInt();

        for(int i=0;i<=n;i++){
            digit=n%10;
            sum=sum + digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
