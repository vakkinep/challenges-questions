import java.util.*;

public class Hops{
    public static void main(String[] args) { //If there is a given array, least #of hops to get past
        int[] array = new int[50];
        int len = 0; //TODO move
        int largestJump; int value;
        int index; int jumpDist; int sum;
        int curPos = 0; int jumps = 0; int tempPosition = 0;

        Scanner sc = new Scanner(System.in); int pos = 0; int num;
        System.out.println("Enter positive numbers to be in the array. Enter 0 once you're done.");
        while ((num = sc.nextInt()) > 0){
            if (num != 0){
                array[pos] = num;
                len++; pos++;
            }
        }
        for(pos = 0; pos < len; pos++){
            System.out.print(array[pos] + " ");
        }
        System.out.println(); //TODO for osme reason when I input same numbers, I have 1 too many jumps
        System.out.println();

        while(curPos < len){
            value = array[curPos];
            System.out.println("Value Is: " + value);
            if (value == 1){
                curPos++;
            }
            else{
                jumpDist = value + curPos;
                System.out.println("JumpDist Is: " + jumpDist);
                int maxJumpDist = len-1 - curPos;
                System.out.println("Max Jump Distance is: " + maxJumpDist); //I am calculating this wrong
                if (jumpDist > maxJumpDist){
                    jumps++;
                    System.out.println("EXIT 0: Least Number of Jumps: " + jumps);
                    return;
                }
                largestJump = 0;
                int test = curPos +1;
                System.out.println("Initial Index: " + test);
                if (test >= len){
                    System.out.println("EXIT 1: Least Number of Jumps: " + jumps);
                    return;
                }
                for (index = test; index <= jumpDist; index++){
                    sum = array[index] + index;
                    if (sum > largestJump){
                        largestJump = sum;
                        tempPosition = index;
                        System.out.println("Largest Jump updated to: " + largestJump + ". Added " + array[index] + " and " + index);
                    }
                }
                curPos = tempPosition;
                System.out.println("curPos updated to: " + curPos);
                if (curPos >= len){ //If the jump distance from this points exceeds the len of array
                    System.out.println("EXIT 2: Least Number of Jumps: " + jumps);
                    return;
                }
            }
            jumps++;
            System.out.println("Jumps is: " + jumps);
        }
        System.out.println("EXIT 3: Least Number of Jumps: " + jumps);
        return;
    }
}
