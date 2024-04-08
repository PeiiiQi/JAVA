package CH2;
import java.util.Scanner;

public class JPA07 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入三個整數:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a <= 0 || b <= 0 || c <= 0){
                System.out.println("不可以構成三角形");
            }
            else if(a + b > c && b + c > a && a + c > b){
                if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a){
                    System.out.println("直角三角形");
                }
                if(a*a + b*b < c*c || a*a + c*c < b*b || b*b + c*c < a*a){
                    System.out.println("鈍角三角形");
                }
                if(a*a + b*b > c*c && a*a + c*c > b*b && b*b + c*c > a*a){
                    System.out.println("銳角三角形");
                }
            }
            else{
                System.out.println("不可以構成三角形");
            }
        }
    }
}
