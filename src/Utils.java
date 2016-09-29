import java.util.Random;

class Utils {
    public static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1) < 0;
    }

    public static void exch(Comparable[] a, int first, int second) {
        Comparable tmp = a[first];
        a[first] = a[second];
        a[second] = tmp;
    }

    public static void randomShuffle(Comparable[] a) {
        Random r = new Random();
        for (int i = a.length - 1; i > 0; i--){
            int index = r.nextInt(i + 1);
            exch(a, i, index);
        }
    }
}
