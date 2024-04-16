package Code_Judger;
import java.util.Scanner;

public class JP104 {
    @SuppressWarnings("resource")
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double total = a + b;
        System.out.printf("total=%.2f",total);
    }    
}
