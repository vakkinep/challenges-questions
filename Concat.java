import java.util.*;

public class Concat
{
    public static void main(String[] args)
    {
        String s = "";
        String x = "hey";
        String y = "there";
        int p = 5;
        char ch = 'c';

        s= s.concat(x);
        s = s.concat(y);
        s= s + ch;
        s = s + p;
        System.out.println(s);

    }
}
