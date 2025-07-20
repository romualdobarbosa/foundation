import java.util.Arrays;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int counter = 1;
        int counterTemp = 1;
        if (nums.length == 0) counter = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
             if (nums[i] == nums[i + 1]) {
                continue;
            } else if (nums[i] == nums[i + 1] - 1) {
                 counterTemp++;
                 counter = Math.max(counter, counterTemp);
             } else if(nums[i] != nums[i + 1] - 1) {
                 counterTemp = 1;
             }
        }

        return counter;
    }
}
