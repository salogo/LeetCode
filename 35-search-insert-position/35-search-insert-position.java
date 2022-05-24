class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] > target) {
            return 0;
        } else if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return Math.min(start, end) + 1;
    }
}