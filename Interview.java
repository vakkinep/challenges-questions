import java.util.*;

public class Interview //If there were three arrays, how would you find if the sum of a number from each of those arrays
{                      //equals the key value?
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] one = new array[10];
        int[] two = new array[10];
        int[] three = new array[10];
        int key = 8;

        for (int i = 0; i< 10; i++)
        {
            one[i] = i;
            two[i] = i;
            three[i] = i;
        }
        int a = 0; int b = 0; int c = three.length - 1;

        while (a < one.length)
        {
            while (c >= 0)
            {
                if (one[a] + two[b] + three[c] == key)
                    System.out.println("true");
                else
                {
                    if (one[a] + two[b] + three[c] > key)
                        c--;

                    else
                    {
                        if (b == two.length)
                        {
                            b = 0;
                            a++;
                        }
                        b++;

                    }
                }
            }
            c = three.length -1;
            a++
        }
        System.out.println("False");
    }
}
