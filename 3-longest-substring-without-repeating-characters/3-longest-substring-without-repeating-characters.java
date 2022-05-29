class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap <Character,Integer> map=new HashMap<>();
       int i=0; int j=0; int max=0;
        while(j<s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j++),1);
                max=Math.max(max,map.size());
            }
            else map.remove(s.charAt(i++));
        }
        return max;
    }
}