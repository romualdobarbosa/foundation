public class MergeSort {

    // O (n log n)
    void mergeSort(int[] arr) {
        int lengthArr = arr.length;
        if (lengthArr < 2) {
            return;
        }
        int midpoint = lengthArr / 2;
        int[] leftArray = new int[midpoint];
        int[] rightArray = new int[lengthArr - midpoint];
        for (int i = 0; i < midpoint; i++) {
            leftArray[i] = arr[i];
        }
        for (int i = midpoint; i < lengthArr; i++) {
            rightArray[i - midpoint] = arr[i];
        }
        mergeSort(rightArray);
        mergeSort(leftArray);

        merge(arr, rightArray, leftArray);
    }

    void merge(int[] arr, int[] rightArray, int[] leftArray) {

        int leftSize = arr.length/2;
        int rightSize = arr.length - leftSize;
        int indexFinal = 0, indexRight = 0, indexLeft = 0;

        while (indexRight < rightSize && indexLeft < leftSize) {
            if (leftArray[indexLeft] <= rightArray[indexRight]) {
                arr[indexFinal] = leftArray[indexLeft];
                indexLeft++;
                indexFinal++;
            } else {
                arr[indexFinal] = rightArray[indexRight];
                indexRight++;
                indexFinal++;
            }

        }
        while (indexRight<rightSize){
            arr[indexFinal] = rightArray[indexRight];
            indexRight++;
            indexFinal++;
        }
        while (indexLeft<leftSize){
            arr[indexFinal] = leftArray[indexLeft];
            indexLeft++;
            indexFinal++;
        }
    }

}
