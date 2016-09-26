import java.util.Arrays;

public class HeapSort {
    public int siftDownTimes;
    private void build(Comparable[] array){
        int size = array.length;
        int lastTree = size/2;

        for (int i = lastTree; i >= 0; i--){
            siftDown(array, size, i);
        }

    }

    private int getParrent(int i){
        if(i > 0){
            return i-1/2;
        }
        return 0;
    }

    private int getLeftChild(int i){
        return 2*i+1;
    }

    private int getRightChild(int i){
        return 2*i+2;
    }

    private Comparable[] siftDown(Comparable[] array, int size, int i){
        int maxIndex = i;
        int l = getLeftChild(i);
        int r = getRightChild(i);

        if (l < size && Utils.less(array[maxIndex], array[l])){
            maxIndex = l;
        }
        if (r < size && Utils.less(array[maxIndex], array[r])){
            maxIndex = r;
        }
        if (i != maxIndex){
            siftDownTimes++;
            Utils.exch(array, i, maxIndex);
            siftDown(array, size, maxIndex);
        }
        return array;
    }

    private int[] swap(int[] array, int i, int maxIndex) {
        int temp = array[i];
        array[i] = array[maxIndex];
        array[maxIndex] = temp;
        return array;
    }


    public static void main(String[] args) {
        Integer[] array = new Integer[15];

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }

        HeapSort heapSort = new HeapSort();

        System.out.println("Array before building heap : ");
        Arrays.stream(array).forEach(e -> System.out.print(e));


        heapSort.build(array);

        System.out.println("\nArray after building heap : ");
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        System.out.println("\nNumber of sifting down : " + heapSort.siftDownTimes);
    }
}
