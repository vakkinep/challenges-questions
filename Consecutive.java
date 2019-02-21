import java.util.*;

//Given an array of numbers,
//1. Find out how many consecutive numbers there are if the array is ordered
//      a. Find how many consecutive and what # they Are
//2. Find out how manu consecutive numbers there are if the array is unordered
//      b. Sam's problem. How do I check which numbers are already there...? - not the same number, diff consec numbers

public class Consecutive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,3,4,4,5,5,5,5};
        int[] arr2 = {3,3,4,5,3,5,3,4,5,3,5,1,2,3};
        int[] streak = {1,5,2,7,3,6,8};
        System.out.println("Longest Streak Ordered: " + findSumOrdered(arr));
        System.out.println("Most repeated number ordered: " + findNumOrdered(arr));
        System.out.println("Longest Streak Unordered: " +findSumUnOrdered(arr2));
        System.out.println("Set: " + facebook(streak));
    }

    //Return the count of consecutive numbers
    public static int findSumOrdered(int[] arr) {
        int previous = arr[0];
        int currCount = 0;
        int overCount = 0;
        for (int i : arr) {
            if (i == previous) {
                currCount++;
            } else {
                currCount = 1;
            }
            if (currCount > overCount) {
                overCount = currCount;
            }
            previous = i;
        }
        return overCount;
    }

    public static int findSumUnOrdered(int[] arr) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        int curLongest = 0;
        for (int t : arr) {
            if (nums.containsKey(t)) {
                int value = nums.get(t);
                value++;
                nums.put(t, value);
                if (value > curLongest) {
                    curLongest = value;
                }
            } else {
                nums.put(t, 1);
            }
        }
        return curLongest;
    }

    public static int findNumOrdered(int[] arr) {
        int curStreak = 0;
        int longestStreak = 0;
        int longestNum = arr[0];
        int previous = arr[0];
        for (int i : arr) {
            if (i == previous) {
                curStreak++;
            } else {
                curStreak = 1;
            }
            if (curStreak > longestStreak) {
                longestStreak = curStreak;
                longestNum = i;
            }
            previous = i;
        }
        return longestNum;
    }

    public static int findNumUnOrdered(int[] arr) {
        return 0;
    }

    public static int facebook(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int highestStreak = 0;
        int prevNum = -1;
        for (int i : arr) {
            set.add(i);
        }

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer element = iterator.next();
            int negativeStreak = 0;
            int positveStreak = 0;
            int backwards = element-1;
            int forwards = element + 1;

            while (set.contains(backwards)) {
                negativeStreak++;
                backwards--;
            }
            while (set.contains(forwards)) {
                positveStreak++;
                forwards++;
            }
            int curStreak = negativeStreak + positveStreak;
            if (curStreak > highestStreak) {
                highestStreak = curStreak;
            }
            iterator.remove();
        }
        return highestStreak;
    }
}
