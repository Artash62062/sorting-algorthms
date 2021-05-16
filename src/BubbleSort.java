import java.util.Arrays;

/**
 * @author Artash-PC on 5/16/2021
 * @product IntelliJ IDEA
 * @project sortingalgorithms
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        RandIntGenerator.fillArrayWithRandomNumbers(arr);
        long bubbleSortStart = System.currentTimeMillis();
        bubbleSort(arr);
        long bubbleSortEnd = System.currentTimeMillis();
        System.out.println("Array Was Sorted in " + (bubbleSortEnd - bubbleSortStart) + " Using ordinary bubble sort");
        RandIntGenerator.fillArrayWithRandomNumbers(arr);
        long bubbleSortOptimizedStart = System.currentTimeMillis();
        bubbleSortOptimized(arr);
        long bubbleSortOptimizedEnd = System.currentTimeMillis();
        System.out.println("Array Was Sorted in " + (bubbleSortOptimizedEnd - bubbleSortOptimizedStart) + " Using optimized bubble sort");
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOptimized(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }
}
