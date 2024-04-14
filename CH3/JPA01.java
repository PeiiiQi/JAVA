package CH3;
import java.util.Scanner;

public class JPA01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println("1 + ... + "+ n + " = " + sum);
    }    
}
