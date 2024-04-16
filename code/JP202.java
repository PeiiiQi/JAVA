package Code_Judger;
import java.util.Scanner;

public class JP202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0 && n <= 100){
            if (n > 60){
                n = n + 10;
                System.out.println(n);
            }
            else {
                n = n + 5;
                System.out.println(n);
            }
        }
        else{
            System.out.println("error");
        }
        sc.close();
    }    
}
