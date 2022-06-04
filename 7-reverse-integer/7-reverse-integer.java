class Solution {
      public int reverse(int x) {
      long result = 0;
        while(x != 0) {
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return (int) result;
    }
}







/*
class Solution {
    public int reverse(int x) {
      int result = 0;
        while(x != 0) {
            int lastDigit = x % 10;
            int newResult = result * 10 + lastDigit;
            if ( (newResult - lastDigit) / 10 != result ) {
                return 0;
            }
            x /= 10;
            result = newResult;
        }
        return result;
    }
}


*/
























