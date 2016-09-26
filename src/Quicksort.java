public class Quicksort {
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
