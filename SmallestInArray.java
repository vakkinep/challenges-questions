//Find the smallest number in an array
import java.util.*;
//This is the fastest way to solve this problem: O(n)

public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {4,6,7,9,8,2};
        findSmallest(arr);
    }

    public static void findSmallest(int[] a) {
        int lowestNum = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < lowestNum) {
                lowestNum = a[i];
            }
        }
        System.out.println(lowestNum);
    }

    public static void findSecondSmallest(int[] a) {
        int lowestNum = a[0];
        int secondLowest = a[0];
        for (int i=0; i < a.length; i++) {
            if (a[j] < a[i])
        }
    }
}
