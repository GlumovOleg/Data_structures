package HomeWork.HomeWork2;

public class App {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.prepareArray();
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        ArrayUtils.printArray(arr);
    }
}
