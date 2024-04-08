package CH2;
import java.util.Scanner;

public class JPA08 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input:");
            int g = sc.nextInt();
            if(g >= 90){
                System.out.println("Your grade is A");
            }
            else if(90 > g && g >= 80){
                System.out.println("Your grade is B");
            }
            else if(80 > g && g >= 70){
                System.out.println("Your grade is C");
            }
            else if(70 > g && g >= 60){
                System.out.println("Your grade is D");
            }
            else{
                System.out.println("Your grade is F");
            }
        }
    }
}
