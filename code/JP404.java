package Final_exam;
import java.util.HashMap;
import java.util.Scanner ;
public class JP404 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        String s1[] ;
        int max = 0 ;

        s1 = sc.nextLine().split("") ;
        sc.close() ;

        if(s1.length > 50)
        {
            System.out.println("error") ;
            System.exit(0) ;
        }


        HashMap<String, Integer> store = new HashMap<>() ;
        for(String a : s1)
        {
            if(store.containsKey(a))
            {
                store.replace(a , store.get(a) + 1) ;
                max = Math.max(store.get(a), max) ;
            }
            else
            {
                store.put(a, 1) ;
                if(a.charAt(0) < 97 || a.charAt(0) > 122)
                {
                    System.out.println("error") ;
                    System.exit(0) ;
                }
            }
        }

        for(String s : store.keySet())
        {
            if(store.get(s) == max)
            {
                System.out.println(s) ;
                System.out.println(store.get(s)) ;
                System.exit(0) ;
            }
        }
    }
}