package Code_Judger;

import java.util.Scanner;

public class JP204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String opr = sc.next();

        int ans;
        switch (opr) {
            case "+":
                ans = a + b;
                System.out.println(a + opr + b + "=" + ans);
                break;
            case "-":
                ans = a - b;
                System.out.println(a + opr + b + "=" + ans);
                break;
            case "*":
                ans = a * b;
                System.out.println(a + opr + b + "=" + ans);
                break;
            default:
                System.out.println("error");
                break;
        }
        sc.close();
    }
}
