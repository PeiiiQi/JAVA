package CH2;
import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args) {
        for(int i = 0; i < 2; i++){
            System.out.println("Input:");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            if(s % 5 == 0 && s % 9 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
    }
}
