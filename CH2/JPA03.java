package CH2;
import java.util.Scanner;

public class JPA03 {
    public static void main(String[] args) {
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input an integer:");
            int a = sc.nextInt();
            if(a % 2 == 0){
                System.out.println("The number is even.");
            }
            else{
                System.out.println("The number is odd.");
            }
        }
    
    }    
}
