package Code_Judger;
import java.util.Scanner;

public class JP302 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int score = compute(n);

            if (score == -1) {
                System.out.println("-1");
            } else {
                System.out.println(score);
            }
            sc.close();
        }

        public static int compute(int n){
            if (n >= 0 && n <= 100){
                if (n > 60){
                    return n = n + 5;
                }
                else {
                    return n = n + 10;
                }
            }
            else{
                return -1;
            }
        }
}
