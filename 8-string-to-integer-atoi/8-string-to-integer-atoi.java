class Solution {
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