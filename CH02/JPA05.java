package CH2;
import java.util.Scanner;

public class JPA05 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            System.out.println("Enter an integer:");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            String str = s + "是"; 
            if(s % 2 != 0 && s % 3 != 0 && s % 6 != 0){
                System.out.println(s + "不是2、3、6的倍數");
            }
            else{
                if(s % 2 == 0){
                    str += "2、";
                }
                if(s % 3 == 0){
                    str += "3、";
                }
                if(s % 6 == 0){
                    str += "6、";
                }
                if(str.charAt(str.length()-1) == '、'){
                    str = str.substring(0, str.length()-1);
                }
                System.out.println(str + "的倍數");
            }
        }
        
    }
}
