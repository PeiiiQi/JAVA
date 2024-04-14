package CH3;
import java.util.*;

public class JPA06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input:");
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m == 999){
                break;
            }
            else{
                // System.out.println(Math.pow(m, n));
                int ans = 1;
                for(int i = 1; i <= n; i++){
                    ans *= m;
                }
                System.out.println(ans);
            }
        }
    }
}
