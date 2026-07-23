class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!Character.isDigit(ch)){
                st.push(ch);
            }
            if(!st.empty() && Character.isDigit(ch)){
                st.pop();
            }
            
        }

        StringBuilder sh = new StringBuilder();
        while(!st.empty()){
            sh.append(st.peek());
            st.pop();
        }

        return sh.reverse().toString();
    }
}