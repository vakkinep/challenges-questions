import java.util.*;

public class Matrix
{
    private static int rows= 10;
    private static int cols= 5;
    
    public static void main(String[] args)
    {

        Random rand = new Random();
        int[][] mat = new int[rows][cols];

        for(int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                int random = (rand.nextInt(20)-10);
                mat[i][j] = random;
                System.out.print(random + " ");
            }
            System.out.println();
        }

        System.out.println(count(mat));
    }


    public static int count(int[][] m)
    {
        int count = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j= 0; j < cols; j++)
            {
                if (m[i][j] < 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
