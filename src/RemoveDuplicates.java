
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for (int j = 0; j < nums.length; j++) {

            hs.add(nums[j]);
        }
        int i =0;
       for(int number: hs){
           nums[i++] = number;
       }
        System.out.println(hs);
        return hs.size();
    }
}
