class Solution {
       public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> result =new ArrayList<>();
        for(int i:nums){
            result.add(i);
        }
        if(result.contains(target)){
            return result.indexOf(target);
        }
        result.add(target);
        Collections.sort(result);
        return result.indexOf(target);
       
    }
}