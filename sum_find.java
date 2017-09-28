import java.util.*;

public class sum_find{ //If there is an ordered array that is given, how can we find if the sum of 2 numbers in the array is equal to a given number
    public static void main(String[] args) {
        int sumNum = 15;
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        int left = 0;
        int right = array1.length - 1;

        for(int i = 0; i <= array1.length -1; i++){
            array1[i] = i;
            System.out.println(array1[i]);
        }

        if (array1.length < 2){
            System.out.println("The length is too short");
            return;
        }
        while (left != right){
            if (array1[left] + array1[right] == sumNum){
                System.out.println("Horraaaay!! The numbers are: " + array1[left] + " and " + array1[right]);
                return;
            }
            else if (array1[left] + array1[right] > sumNum){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println("There are no two numbers that sum together.");
    }
}
