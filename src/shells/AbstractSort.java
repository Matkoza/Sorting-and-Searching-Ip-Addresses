package shells;

public abstract class AbstractSort {
    public static boolean less(int v, int w) {
        return v < w;
    }
    
    /* Swaps the two elements in an array */
    public static void swap (Comparable[] elements, int a, int b) {
        Comparable tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }
}
