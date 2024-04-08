package CH2;
import java.util.Scanner;

public class JPA06 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Input Chinese score:");
            int c = sc.nextInt();
            System.out.print("Input English score:");
            int e = sc.nextInt();
            System.out.print("Input Math score:");
            int m = sc.nextInt();
            if(c < 60){
                System.out.println("Chinese failed.");
            }
            if(e < 60){
                System.out.println("English failed.");
            }
            if(m < 60){
                System.out.println("Math failed.");
            }
            if(c >= 60 && e >= 60 && m >=60){
                System.out.println("All pass.");
            }
        }
        
    }
}
