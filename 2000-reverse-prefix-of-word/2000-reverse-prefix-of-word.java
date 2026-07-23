class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder s = new StringBuilder();
        int count = 0;
        for(int i = 0; i<word.length(); i++){
            char wh = word.charAt(i);
            s.append(wh);
            if(count == 0){
                if(wh == ch){
                s.reverse();
                count++;
               }
            }
           
        }
        return s.toString();
    }
}