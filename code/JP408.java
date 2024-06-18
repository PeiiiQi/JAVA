package Final_exam;

import java.util.Scanner ;
public class JP408 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        String input_str1 , input_str2 , merged_str;

        input_str1 = sc.nextLine() ; input_str2 = sc.nextLine() ;
        sc.close() ;

        if(input_str1.length() < 3 || input_str1.length() > 20 || input_str2.length() < 3 || input_str2.length() > 20)
        {
            System.out.println("error") ;
            System.exit(0) ;
        }

        merged_str = input_str1 + input_str2 ;

        System.out.printf("%d\n%d\n", input_str1.length(), input_str2.length()) ;

        for(int i = (merged_str.length() - 1) ; i >= 0 ; i--)
        {
            System.out.print(merged_str.charAt(i)) ;
        }
    }
}
