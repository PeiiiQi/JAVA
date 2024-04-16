package Code_Judger;
import java.util.Scanner;
public class JP108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double half, area;
        half = n/2;
        area = half*half*3.1415;
        System.out.println(n);
        System.out.printf("%.2f\n",half);
        System.out.printf("%.4f",area);
        sc.close();
    }
}
