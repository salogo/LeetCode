class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
                
        for(char i: s.toCharArray() ){
            if(i == '(' || i == '[' || i == '{'){
                stack.push(i);
            }else{
                if(stack.isEmpty()) return false;
                char popped = stack.pop();
                if(i == '}' && popped != '{' || i == ']'  && popped != '[' || i == ')' && popped != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
       
    }
}
