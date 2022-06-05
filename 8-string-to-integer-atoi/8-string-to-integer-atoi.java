
   
class Solution {
    public int myAtoi(String s) {
        if(s==null) return 0;

        s=s.trim();
        
        if(s.length()==0) return 0;
        
        int sign = +1;
        long ans = 0;
        if(s.charAt(0) == '-') sign = -1;
        
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
		
		// initiate the starting pointer
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
		
        while(i < s.length()) {
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            ans = ans * 10 + s.charAt(i)-'0';
            // check the conditions
            if(sign == -1 && -1*ans < MIN) return MIN;
            if(sign == 1 && ans > MAX) return MAX;
            
            i++;
        }
        
        return (int)(sign*ans);
    }
}






/*class Solution {
    public int myAtoi(String s) {
        
        if(s==null || s.length()==0)
            return 0;
        
        int len = s.length();        
        int pos=0;
        double num=0;
        boolean sign=true; //+ by default
        
        while(pos<len && s.charAt(pos)==' '){
            pos++;
        }
        //look for sign if any
        if(pos<len && s.charAt(pos)=='-'){
            sign=false;//negative detected
            pos++;
        }else if(pos<len && s.charAt(pos)=='+'){
            //do nothing just move pointer to next position
            pos++;
        }
        if(pos>len-1){ //double check if position is overruning length of string
            return 0;
        }
        
        while(s.charAt(pos)>='0' && s.charAt(pos)<='9'){
              num=num*10+s.charAt(pos)-'0'; //
	            pos++;
	            if(pos>len-1) break;
        }
        
        if(!sign){
            num=-num;
        };
        
        if(num>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(num<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        
        return (int)num;
    }
}
*/