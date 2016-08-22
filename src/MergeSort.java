import java.util.Arrays;

public class MergeSort {
    int[] sort(int[] array){
        int size = array.length;
        int mid = size/2;
        int[] leftArray = Arrays.copyOfRange(array, 0, mid);
        int[] rightArray = Arrays.copyOfRange(array, mid, size);

        if (leftArray.length > 1){
            leftArray = sort(leftArray);
        }
        if (rightArray.length > 1){
            rightArray = sort(rightArray);
        }

        int [] mergeResult = merge(leftArray, rightArray);

        return mergeResult;
    }

    private int[] merge(int[] leftArray, int[] rightArray) {
        int[] finalArray = new int[leftArray.length + rightArray.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftArray.length && j < rightArray.length){
            if (leftArray[i] < rightArray[j]){
                finalArray[k] = leftArray[i];
                i++;
                k++;
            }else {
                finalArray[k] = rightArray[j];
                j++;
                k++;
            }
        }

        //Append remains of a left or right arrays to final array
        for (;i < leftArray.length; i++, k++){
            finalArray[k] = leftArray[i];
        }
        for (;j < rightArray.length; j++, k++){
            finalArray[k] = rightArray[j];
        }
//        Arrays.stream(finalArray).forEach(System.out::print);
//        System.out.println();
        return finalArray;
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.sort(new int[]{11,10,9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11});
        Arrays.stream(result).forEach(System.out::print);
    }
}
