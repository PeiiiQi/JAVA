package Final_exam;

import java.util.Scanner;

public class JP602 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 提示使用者輸入字串
        String input = scanner.nextLine();
        
        // 初始化用於儲存大小寫字母的 StringBuilder
        StringBuilder upperCaseLetters = new StringBuilder();
        StringBuilder lowerCaseLetters = new StringBuilder();
        
        // 計算大寫字母的數量
        int upperCaseCount = 0;
        
        // 遍歷字串中的每個字元
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseLetters.append(ch);
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseLetters.append(ch);
            }
        }
        
        // 輸出結果
        System.out.println(upperCaseLetters.toString());
        System.out.println(lowerCaseLetters.toString());
        System.out.println(upperCaseCount);
        
        scanner.close();
    }
}
