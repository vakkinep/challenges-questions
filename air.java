//This question aims to tackle the sorting for Airbnb for results on a page
import java.util.*;

public class air {
    public static void main(String[] args) {
        String[] input = new String[5];
        input[0] = "1,5,4,San Francisco";
        input[1] = "1,5,3,San Francisco";
        input[2] = "2,5,3,San Francisco";
        input[3] = "3,5,3,San Francisco";
        input[4] = "2,5,3,San Francisco";
        String[] finalResult = find(5,input);
        for (String s : finalResult) {
            System.out.println(s);
        }
    }


    public static String[] find (int num, String[] results) {
        int numResults = results.length;

        ArrayList<String> finalArray = new ArrayList<>();
        ArrayList<String> flowOvers = new ArrayList<>();

        HashSet<String> userId = new HashSet<>();

        for (int i = 0; i < numResults; i++) {
            String[] temp = results[i].split(",");
            if (finalArray.size() % num == 0) {
                finalArray.add("");
            }
            if (userId.contains(temp[0])) {
                flowOvers.add(results[i]);
            }
            else { //The userId has not appeared before
                finalArray.add(results[i]);
                userId.add(temp[0]);
            }
        }
        //At this point, we have added all entries without a repeating userID
        //Now to add those with repeating userID in order.
        for (int k = 0; k < flowOvers.size(); k++) {
            if (finalArray.size() % num == 0) {
                finalArray.add("");
            }
            finalArray.add(flowOvers.get(k));
        }
        String[] pages = new String[finalArray.size()];
        pages = finalArray.toArray(pages);
        return pages;
    }
}
