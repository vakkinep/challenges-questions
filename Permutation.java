public class Permutation //See if a word is rewritten with the same letters
{
    public static void main(String[] args)
    {
        String r = "shoe";
        String s = "hoes";

        System.out.println(decide(r,s));
    }

    public static boolean decide(String r, String s)
    {
        //Check string length
        if (r.length() != s.length())
            return false;

        char[] c = r.toCharArray();
        char[] d = s.toCharArray();
        boolean here = false;

        for (int i = 0; i < r.length(); i++) //First word
        {
            for (int j = 0; j < s.length(); j++) //Second word
            {
                if (c[i] == d[j])
                {
                    here = true; //This means the letter is in the second word
                    d[j] = ','; //I'll have to change the letter once we used it so it cannot be reused
                    break;
                }
            }
            if (here == false) //If that letter is not found in the second word, then return false
                return false;
            here = false; //reset here to false for the next letter
        }
        return true;
    }
}
