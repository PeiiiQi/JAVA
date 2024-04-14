package CH3;
import java.util.Scanner;

public class JPA07 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Input:");
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m == 999){
                break;
            }
            else {
                while (n != 0){
                    int temp = n;
                    n = m % n;
                    m = temp;
                }
                System.out.println(m);
            }
        }
    }    
}
