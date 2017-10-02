//Given an array of strings, determine who wins the elections, or who receives the most
//votes. If there are multiple people with the same number of votes, then they should
//be alphabetically ordered and the last one should be chosen
import java.util.*;
import java.lang.*;

public class Election {
    public static void main(String[] args) {
        String[] names = {"Matt","Vin","Katie","Ryan", "Evin", "Matt", "Vin"};
        results(names);
    }

    public static void results(String[] names) {
        Map<String,Integer> result = new HashMap<>();
        for (String i : names) {
            if (result.containsKey(i)) {
                int val = result.get(i);
                result.put(i, val+1);
            } else {
                result.put(i, 1);
            }
        }
        countResults(result);
    }

    public static void countResults(Map<String,Integer> results) {
        int maxValue = Collections.max(results.values());
        TreeSet<String> winners = new TreeSet<>();
        for (Map.Entry<String,Integer> entry : results.entrySet()) {
            if (entry.getValue() == maxValue) {
                winners.add(entry.getKey());
            }
        }
        String winner = winners.last();
        System.out.println("The winner is: " + winner);
    }
}
