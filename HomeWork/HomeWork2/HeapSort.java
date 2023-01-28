package HomeWork.HomeWork2;

// Реализовать алгоритм пирамидальной сортировки (сортировка кучей).

public class HeapSort {

    public static void main(String[] args) {

    }

    public void sort(int[] arr) {
        int heapSize = arr.length;
        for (int i = heapSize / 2 - 1; i >= 0; i--) {

            heapify(arr, heapSize, i);
        }

        for (int i = heapSize - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }

    }

    private static void heapify(int[] arr, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, heapSize, largest);
        }

    }

}