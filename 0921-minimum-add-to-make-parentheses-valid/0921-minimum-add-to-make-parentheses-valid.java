class Solution {
    public int minAddToMakeValid(String st) {
        Stack<Character> s=new Stack<>();
        
        for(char x: st.toCharArray()){
            if(x=='('){
                s.push(x);
            }else if(!s.isEmpty() && s.peek()=='('){
                s.pop();
            }else{
                s.push(x);
            }

        }
        return s.size();
    }
}