class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char CurrChar = s.charAt(i);
            if(CurrChar == '(' || CurrChar == '{' || CurrChar == '['){
                st.push(CurrChar);
            }

            else if(CurrChar == ')'|| CurrChar =='}'||CurrChar == ']'){
                if(st.size() == 0) return false;
                if(st.peek() == '(' && CurrChar == ')' || st.peek() == '{' && CurrChar == '}' || st.peek() == '[' && CurrChar == ']'){
                    st.pop();
                }
                else{
                    return false;
                }

            }
        }
        return st.size() == 0;
    }
}