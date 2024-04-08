package CH1;
import java.util.Scanner;

public class JPA106 {
    public static void main(String[] args) {
        double x = 0.0;
        double []nums = {-3.2, -2.1, 0, 2.1};
        for(int index = 0; index<nums.length; index++) {
            x = 3*Math.pow(nums[index], 3) + 2*nums[index] -1;
            System.out.printf("f(%s) = %.4f\r\n", nums[index], x);
        }
    }
}
