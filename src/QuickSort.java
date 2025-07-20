public class QuickSort {
    void quickSort(int[] array) {
        int pivotIndex = array.length - 1;
        int pivot = array[pivotIndex];

        int i = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        while (i <= pivotIndex) {
            if (array[i] <= pivot) {
                //left[leftIndex] = array[i];
                leftIndex++;
                i++;
            }
            //right[rightIndex] = array[i];
            rightIndex++;
            i++;
        }
    }
}
