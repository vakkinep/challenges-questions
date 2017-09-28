import java.util.*;

public class HopeRedo {

    public static void main(String[] args) {
        int[] array = new int[20];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
