import java.util.Arrays;

/**
 * @author Artash-PC on 5/17/2021
 * @product IntelliJ IDEA
 * @project sortingalgorithms
 */
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = RandIntGenerator.fillArrayWithRandomNumbers(new int[5]);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int [] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j;
            int key;
            key = arr[i];
            j = i-1;

            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
