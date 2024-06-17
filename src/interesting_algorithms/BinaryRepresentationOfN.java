package interesting_algorithms;

import datastructures.Stack;

/**
 * The {@code BinaryRepresentationOfN} class represents a binary representation of a number.
 * It uses a stack to store the binary representation of the number.
 */

 
public class BinaryRepresentationOfN {


    public static void main(String[] args) {
        
        int n = 49;
        Stack<Integer> stack = new Stack<>();
        
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }
        
        for (int d : stack) System.out.print(d);
        System.out.println();
        
    }

}
