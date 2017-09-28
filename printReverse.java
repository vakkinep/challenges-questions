import java.util.*;

public class printReverse{ //If we are given a list of numbers, how would you return them in reverse order - O(n)
    public static void main(String[] args) {
        Random ran = new Random();
        int i; int j;
        int[] nums = new int[10];

        for (i = 0; i < nums.length; i++){
            ran.nextInt()
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------");

        int len = nums.length;
        for (i = len -1; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
}
