//Given an array, find the second highest number
//Option 1: sort the array- takes too long. Not a good solution

import java.util.*;

public class secondHighest {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random rand = new Random();
        for (int i : nums) {
            i = rand.nextInt(20);
            System.out.print(i + " ");
        }
        System.out.println();
        find(nums);
    }

    public static void find(int[] array) {
        int i = -1, j = -1, times = 1, max = -1, second = -1;; //What if there was a negative number?
        for (int k = 0; k < array.length; k++) {
            if (times == 1) {
                i = array[k];
                j = array[k+1];
                if (i > j) {
                    max = i;
                    second = j;
                } else {
                    max = j;
                    second = i;
                }
                times++; k++;
            } else {
                j = array[k];
                if (j > max) {
                    second = max;
                    max = j;
                } else if (j > second && j < max) {
                    second = j;
                }
            }
        }
        System.out.println("Second Highest: " + second);
    }
}
