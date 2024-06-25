package sorting;

public class Shellsort {

    public static void sort(Comparable[] a) {
        
        int n = a.length;
        int h = 1;

        while (h < n/3) h = 3 * h + 1;
        
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) exch(a, j, j-h);
            }
            h = h/3;
            
        }
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String[] a = {"L", "E", "E", "A", "M", "H", "L", "E", "P", "S", "O", "L", "T", "S", "X", "R"};
        
        Shellsort.sort(a);

        // assert isSorted(a);
        if (isSorted(a)) System.out.println("Sorted");
        else System.out.println("Not sorted");
        
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i] + " ");
        // }
        // System.out.println();
    }

}
