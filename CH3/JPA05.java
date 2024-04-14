package CH3;
import java.util.Scanner;

public class JPA05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            int ans = 1;
            System.out.print("Please enter one value:");
            int n = sc.nextInt();
            if (n >= 1 && n <= 10){
                for(int j =2; j <= n; j++){
                    ans *= j;
                }
                System.out.println(n + "!:" + ans);
            }
            else{
        	System.out.println("Error, the value is out of range.");
            }
            
        }
    }
}
