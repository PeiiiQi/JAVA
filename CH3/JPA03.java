package CH3;
import java.util.Scanner;

public class JPA03 {
    public static void main(String[] args) {
        System.out.println("1到1000之間的完美數：");
        
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }    
    }
    // 判断一个数是否是完美数
    public static boolean isPerfect(int number) {
        int sum = 0;
        // 找到number的因子（不包括number本身），并求和
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        // 如果因子之和等于number，则number是完美数
        return sum == number;
    }

}
