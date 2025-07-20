import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Array maker
        Random randomNumbers = new Random();
        int[] test = new int[10];
        for (int i = 0; i < test.length; i++) {
            test[i] = randomNumbers.nextInt(100);
        }
        System.out.println(Arrays.toString(test));


//         InsertionSort is = new InsertionSort();
//         is.iSort(test);
//         System.out.println(Arrays.toString(test));

//        MergeSort mg = new MergeSort();
//        mg.mergeSort(test);
//        System.out.println(Arrays.toString(test));

//        BublleSort bublleS = new BublleSort();
//        bublleS.bubbleSort(test);
//        System.out.println(Arrays.toString(test));




    }
        }
