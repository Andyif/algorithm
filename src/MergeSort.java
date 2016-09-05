import java.util.Arrays;

public class MergeSort  {
    public static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0 ,a.length -1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi ) {
        System.arraycopy(a, lo, aux, lo, hi + 1 - lo);

        int i = lo;
        int j = mid +1;

        for (int k = lo; k <= hi; k++){
            if(i > mid){
                a[k] = aux[j++];
            }else if (j > hi){
                a[k] = aux[i++];
            }else if(less(aux[j], aux[i])){
                a[k] = aux[j++];
            }else {
                a[k] = aux[i++];
            }
        }
    }

    private static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1) < 0;
    }

    public static void main(String[] args) {
//        MergeSort mergeSort = new MergeSort();
        Integer[] result = new Integer[]{11,10,9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11};
        MergeSort.sort(result);
        Arrays.stream(result).forEach(System.out::print);
    }
}
