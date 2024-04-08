package CH1;
import java.util.Scanner;

public class JAP103 {
    public static void main(String[] args) {
        System.out.println("Please input:");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double sum,average =0;
        sum = a+b+c;
        average = sum/3;

        System.out.printf("Average: %.2f",average);
    }
}

