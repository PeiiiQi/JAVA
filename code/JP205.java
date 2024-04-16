package Code_Judger;
import java.util.Scanner;

public class JP205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counts = new int[6]; // 擲骰子點數的次數
        int errorCount = 0; // 不屬於骰子點數的錯誤次數
        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            if(n >= 1 && n <= 6){
                counts[n-1]++;
            }else{
                errorCount++;
                
            }
        }

        for(int i = 0; i < 6; i++){
            System.out.println("number"+(i+1)+":"+counts[i]);
        }
        System.out.println("error:"+errorCount);
        sc.close();
    }
}
