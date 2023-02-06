public class GenericfnEx10 {
    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T mx = x; // assume x is initially the largest
        if (y.compareTo(mx) > 0) {
            mx = y; // y is the largest so far
        }
        if (z.compareTo(mx) > 0) {
            mx = z; // z is the largest now
        }
        return mx; // returns the largest object
    }

    public static void main(String args[]) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
                maximum("pear", "apple", "orange"));
    }
}
