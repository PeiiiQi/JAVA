package CH3;
import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int meal = 0;
        double average = 0;
        System.out.print("Please enter meal dollars or enter -1 to stop:");

        while (true) {
            double cost = sc.nextDouble();
            if(cost == -1){
                break;
            }
            sum += cost;
            meal++;
            System.out.print("Please enter meal dollars or enter -1 to stop:");
        }

        average = sum/meal;

        System.out.println("餐點數量:" + meal);
        System.out.printf("餐點總費用: %.2f\n",sum);
        System.out.printf("5 道餐點平均費用為: %.2f", average);
        

    }
}
