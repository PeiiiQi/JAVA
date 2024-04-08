package CH2;
import java.util.Scanner;

public class JPA01 {
    public static void main(String[] args) {
        System.out.println("Please enter score:");
        
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a >= 60){
                System.out.println("You pass");
            }
            System.out.println("End");
        }
    }    
}
