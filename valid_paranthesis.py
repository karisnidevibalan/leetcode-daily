class Solution {
    public boolean isValid(String s) {
        Stack<Character>ss=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                ss.push(ch);
            }
            else if (ch== ')'  || ch== '}' || ch== ']' ){
                if(ss.isEmpty()){
                    return false;
                }
                char top=ss.pop();
                if(top!='(' && ch==')' ||top!='{' && ch=='}' || ch==']'&& top!='['){
                    return false;
                }
            }
        }
    return ss.isEmpty();
    }
}
