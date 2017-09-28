import java.util.*;

public class ReverseString
{
    private static String s;
    private static String result;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        s = "blaaah";
        while (!(s.equals("q"))){
            System.out.print("Enter a word you would like to reverse: ");
            s = sc.next();
            if (s.length() <= 1 && (!(s.equals("q"))))
                System.out.println("You fool, give me a real word");
            else{
                if (!(s.equals("q")))
                    reverse(s);
            }
        }
    }

    public static void reverse(String s)
    {
        System.out.println("Original: " + s);
        char[] c = s.toCharArray();
        int start = 0;
        int end = (s.length())-1;
        char temp;
        while (start < end && start != end)
        {
            temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start ++;
            end --;
        }
        System.out.print("Reversed: ");
        System.out.println(c);
    }
}
