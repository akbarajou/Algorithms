package interesting_algorithms;

/**
 * source: Exercise 1.1.6 - Algorithms by Robert Sedgewick and Kevin Wayne
 */

public class fibonacci {

    public static void main(String[] args) {
        
        int f = 0;
        int g = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }

    }

}


