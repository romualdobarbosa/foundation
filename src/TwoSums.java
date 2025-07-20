import java.util.HashMap;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] solution = new int[2];


        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                solution[0] = i;
                solution[1] = hashMap.get(nums[i]);

            } else {
                hashMap.put(target - nums[i], i);
            }
        }


        return solution;
    }
}

