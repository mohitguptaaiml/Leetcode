class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
      int targetSum1 = (coordinate1.charAt(0) - 'a' + 1) + (coordinate1.charAt(1) - '0');
      int targetSum2 = (coordinate2.charAt(0) - 'a' + 1) + (coordinate2.charAt(1) - '0');

    return targetSum1 % 2 == targetSum2 % 2;
    }
}