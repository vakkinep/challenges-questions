public class Unique //Checks to see if there are unique letters in a word
{
    public static String s;

    public static void main(String[] args)
    {
        s = "especially";
        System.out.println(check(s));
    }

    public static boolean check(String s)
    {
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i+1; j < s.length(); j++)
            {
                if (c[i] == c[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
