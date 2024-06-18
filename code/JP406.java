package Final_exam;

import java.util.Scanner;

public class JP406 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;

        String keyboard = "qwertyuioppasdfghjkllzxcvbnmmQWERTYUIOPPASDFGHJKLLZXCVBNMM" ;

        String input_arr[] = sc.nextLine().split("") ;
        sc.close() ;

        for(int i = 0 ; i < input_arr.length ; i++)
        {
            System.out.print(keyboard.charAt((keyboard.indexOf(input_arr[i])) + 1)) ;
        } 
    }
}
