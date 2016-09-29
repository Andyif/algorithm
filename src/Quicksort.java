public class Quicksort {
    private static final int CUTOFF = 10;

    public static void sort(Comparable[] a){
        Utils.randomShuffle(a);
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if (hi <= lo + CUTOFF - 1){
            Insertion.sort(a, lo, hi);
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi){
        int i = lo, j = hi + 1;
        while (true){
            while (Utils.less(a[++i], a[lo])){
                if (i == hi){
                    break;
                }
            }

            while (Utils.less(a[lo], a[--j])){
                if (j == lo){
                    break;
                }
            }

            if (i >= j){
                break;
            }

            Utils.exch(a, i ,j);
        }
        Utils.exch(a, lo, j);
        return j;
    }
}
