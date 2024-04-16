package Code_Judger;
import java.util.Scanner;

public class JP107 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int num[] = new int[6], len, index ;

        for(int i = 0 ; i < num.length ; i++)
        {
            num[i] = sc.nextInt() ;
        }
        sc.close() ;
        len = num.length * 2;
        index = 0 ;

        while((len) != 0)
        {
            if(len > num.length)
            {
                len-- ;
                if(index % 3 < 2)
                {
                    System.out.printf("%10d ", num[index]) ;
                    index++ ;
                }
                else
                {
                    System.out.printf("%10d\n", num[index]) ;
                    index++ ;
                    if(index == num.length)
                    {
                        index = 0 ;
                    }
                }
            }
            else
            {
                len-- ;
                if(index % 3 < 2)
                {
                    System.out.printf("%-10d ", num[index]) ;
                }
                else
                {
                    System.out.printf("%-10d\n", num[index]) ;
                }
                index++ ;
            }
        }

    }
}