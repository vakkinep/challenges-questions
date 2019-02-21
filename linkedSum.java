//if there is a linked list with the number stored as one digit per node BACKWARDS, make a new linked list with the sum.
/*
 List 1: 1->2->3 (321)
 List 2: 2->3->4 (432)

 result should be 7->5->3;

 //Make my own linked list-> and add a reverse function.

*/

import java.util.*;

public class linkedSum {

    private class linkedlist {
        Node head;

        public linkedlist() {
            Node head = this;
        }

        private class Node {
            int data;
            Node left;
            Node right;
            Node head;

            public Node() {
                this.data = null;
                this.left = null;
                this.right = null;
            }

            public Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> one = new LinkedList();
        LinkedList<Integer> two = new LinkedList();
        LinkedList<Integer> mine = new LinkedList();
        boolean isCarry = false;
        int carryNum = 0;

        //result should be 642
        one.add(1);
        one.add(2);
        one.add(3);
        two.add(1);
        two.add(2);
        two.add(3);

        //they can be different sizes
        for (int i = 0; i < one.size(); i++) {
            int numOne = one.get(i);
            int numTwo = two.get(i);
            int result = numOne + numTwo;

            if (isCarry == true) {
                result += carryNum;
                isCarry = false;
            }

            if (result > 9) {
                isCarry = true;
                carryNum = result/10; //split up the integer and get the first and second numbers
                int curNum = result%10;
                mine.add(curNum);
            } else {
                mine.add(result);
            }
        }

        for (Integer j : mine) {
            System.out.println(j);
        }
    }


}
