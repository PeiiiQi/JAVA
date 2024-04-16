package Code_Judger;
import java.util.Scanner;
public class JP110 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

       if (a >= 60 && a < 100){
            System.out.println("1");
       }
       else{
            System.out.println("0");
       }

       double ans;
       ans = ((b + 1) / 10.0);
       System.out.printf("%.2f\n", ans);

       if (a >= c) {
            System.out.println(a);
       }
       else{
            System.out.println(c);
       }
       sc.close();
    }
}
