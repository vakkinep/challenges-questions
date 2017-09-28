public class Palindrome //Checks if the word/sentence is spelled the same forward and backward
{
    public static String s;

    public static void main(String[] args)
    {
        s = "bob racecar bob";
        System.out.println(check(s));
    }

    public static boolean check(String a)
    {
        char[] c = a.toCharArray();
        int i = 0; int j = a.length()-1;
        while (i <= j)
        {
            if (c[i] != c[j])
            {
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
