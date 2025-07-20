import static javax.swing.text.html.HTML.Attribute.N;

public class BublleSort {
    static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean elementsSwaped = true;
        while (elementsSwaped) {
            elementsSwaped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    elementsSwaped = true;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

    }

}
