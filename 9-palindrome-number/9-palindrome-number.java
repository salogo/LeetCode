class Solution {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        String reversed = new StringBuilder(value).reverse().toString();
        return value.equals(reversed);
    }
}