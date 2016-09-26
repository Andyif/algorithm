class Utils {
    static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1) < 0;
    }

    public static void exch(Comparable[] a, int first, int second) {
        Comparable tmp = a[first];
        a[first] = a[second];
        a[second] = tmp;
    }
}
