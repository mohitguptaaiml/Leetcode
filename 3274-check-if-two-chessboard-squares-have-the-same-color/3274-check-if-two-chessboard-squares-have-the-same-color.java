class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        if(isBlackorWhite(coordinate1.charAt(0),coordinate1.charAt(1)).equals("black") && isBlackorWhite(coordinate2.charAt(0),coordinate2.charAt(1)).equals("black")){

            return true;
        }
        else if(isBlackorWhite(coordinate1.charAt(0),coordinate1.charAt(1)).equals("white") && isBlackorWhite(coordinate2.charAt(0),coordinate2.charAt(1)).equals("white")){
            return true;
        }
        return false;
    }

    public String isBlackorWhite(char ch, char num){
        if(ch == 'a' || ch == 'c' || ch == 'e' || ch == 'g'){
            if(num == '1' || num == '3' || num == '5' || num == '7'){
                return "black";
            }
        }

          if(ch == 'b' || ch == 'd' || ch == 'f' || ch == 'h'){
            if(num == '2' || num == '4' || num == '6' || num == '8'){
                return "black";
            }
        }
        return "white";

    }
}