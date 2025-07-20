public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        //[1,3,4,6] 2
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midPoint = (right + left) / 2;
            if (nums[midPoint] == target) {
                return midPoint;
            }
            if (nums[midPoint] > target) {
                right = midPoint - 1;
            } else {
                left = midPoint + 1;
            }
        }
        return left;
    }
}
