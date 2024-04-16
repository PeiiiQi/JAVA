package Code_Judger;

import java.util.Scanner;

public class JP210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcdans = gcd(a, b);
        int lcmans = lcm(a, b);
        System.out.println(gcdans);
        System.out.println(lcmans);
        sc.close();
    }

    //計算最大公因數
    public static int gcd(int a, int b) {
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //計算最小公因數
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}