import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] A) {
        int n = A.length;

        // Build a min-heap from the input array
        Heap heap = new Heap(n);
        for (int i = 0; i < n; i++) {
            heap.insert(A[i]);
        }

        // Extract the minimum element from the heap n times, which
        // will result in the sorted array in increasing order
        for (int i = 0; i < n; i++) {
            A[i] = heap.removeMin();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 2, 8, 4 };
        System.out.println("Before sorting: " + Arrays.toString(arr));

        HeapSort.heapSort(arr);

        System.out.println("After sorting: " + Arrays.toString(arr));
    }

}
    