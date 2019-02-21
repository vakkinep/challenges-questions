//given an array of numbers and a target number to reach, return the indicies of the the two number that sum up to the target
//Easy to do it in n^2, but this does with this spacial complexity of n and time complexity of n as well (2n = n);

import java.util.*;
import java.lang.*;

public class targetSum {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};
        int target = 2;

        //Logic- build a hash table of the key (num) to the index. Then loop through one more time and see if that number exists.
        try {
            int[] indicies = findSum(nums, target);
            for (int i : indicies) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] findSum(int[] nums, int target) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n = 0; n < nums.length; n++) {
            map.put(nums[n], n);
        }
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i]; //This is a problem if the number is negative?
            if (map.containsKey(remainder) && map.get(remainder) != i) {
                return new int[] {i, map.get(remainder)};
            }
        }
        throw new Exception("No numbers are found to sum to the target value");
    }
}
