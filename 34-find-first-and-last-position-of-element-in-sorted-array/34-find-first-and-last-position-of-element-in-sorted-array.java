class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int first_occurence=-1,last_occurence=-1;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                first_occurence=mid;
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
        }
        
        int last_start=0;
        int last_end=nums.length-1;
        while(last_start<=last_end){
            int mid=last_start+(last_end-last_start)/2;
            if(nums[mid]==target){
                last_occurence=mid;
                last_start=mid+1;
            }
            else if(target>nums[mid]){
                last_start=mid+1;
            }
            else if(target<nums[mid]){
                last_end=mid-1;
            }
        }
        int[] res={first_occurence,last_occurence};
        return res;
    }
}
