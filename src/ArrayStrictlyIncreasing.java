
public class ArrayStrictlyIncreasing {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {

        int ans = 0;
        int breakNumber = 0;
        int rightNumber = 0;
        for (int i = 0; i < (arr1.length - 2); i++) {
            if (arr1[i + 1] < arr1[i]) {
                breakNumber = arr1[i];
                rightNumber = arr1[i-1]+arr1[i+1]/2; //make interval
            for (int j = 0; j < arr2.length; j++) {
                if (rightNumber == arr2[j]) {
                    arr1[i] = arr2[j];
                    ans++;
                }
            }
            }

        }
        if (ans == 0) {
            ans = -1;
        }

        return ans;
    }
}
