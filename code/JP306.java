package Code_Judger;
import java.util.Scanner;
public class JP306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = compute(n);
        System.out.println(n + "!=" + ans);
        sc.close();
    }

    public static int compute(int n){
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= i;
        }
        return ans;
    }
}
