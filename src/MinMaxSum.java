import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);

        System.out.println(arr);
        long min = 0;
        long max = 0;
        min = arr.get(0)+arr.get(1)+arr.get(2)+arr.get(3);
        max = arr.get(arr.size()-1)+arr.get(arr.size()-2)+arr.get(arr.size()-3)+
                arr.get(arr.size()-4);

        System.out.printf("%ld%s%ld",min, " ",max);
    }
}
