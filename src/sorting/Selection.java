package sorting;

public class Selection {


    public static void sort(Comparable[] a) {
        
        int n = a.length;
        
        for (int i = 0; i < n; i++) {
            
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min])) min = j;
            }

            exch(a, i, min);
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
        Integer[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        
        Selection.sort(a);

        // assert isSorted(a);
        if (isSorted(a)) System.out.println("Sorted");
        else System.out.println("Not sorted");
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


}
