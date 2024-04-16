package Code_Judger;
import java.util.Scanner;

public class JP304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for(int i = 0; i < 6; i++){
            a[i] = sc.nextInt();
        }
        int ans = compute(a);
        System.out.println(ans);
        sc.close();
    }

    public static int compute(int[] a){
        int count = 0;
        for(int num:a){
            if(num % 3 == 0){
                count++;
            }
        }
        return count;
    }
}
