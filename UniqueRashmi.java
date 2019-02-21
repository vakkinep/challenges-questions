import java.util.*;
public class UniqueRashmi //Checks to see if there are unique letters in a word
{
    public static String s;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word");
        String r = sc.next();

        check(r);
    }

    public static void check(String r)
    {
        char[] chars = r.toCharArray();
         HashSet<Character> set = new HashSet<Character>();
         for(char c : chars)
         {
             set.add(c);
         }
         System.out.println("Print : "+set);
    }
}
