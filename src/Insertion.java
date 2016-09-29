public class Insertion {
    public static void sort(Comparable[] a, int lo, int hi){
        for(int i = lo; i<= hi; i++){
            for (int j = --i; j > 0; j--){
                if (Utils.less(a[j], a[j-1])){
                    Utils.exch(a, j, j-1);
                }else {
                    break;
                }
            }
        }
    }
}