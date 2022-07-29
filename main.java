class Solution {
    public boolean isValid(String s) {
        boolean a;
            if(s.length()==0){
                return true;
            }
        Stack<Character> stack =new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char temp=stack.pop();
                    if(ch==')'){
                        if(temp!='('){
                            return false;
                        }
                    }else if(ch=='}'){
                        if(temp!='{'){
                            return false;
                        }
                    }else if(ch==']'){
                        if(temp!='['){
                            return false;
                        }
                    }
                }
            }
        }
        a=stack.isEmpty()?true:false;
    return a;
    }
}
