class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getValue(firstWord) + getValue(secondWord) == getValue(targetWord);
    }

    private int getValue(String word) {
        int num = 0;
        for (int i = 0; i < word.length(); i++) {
            num = num * 10 + (word.charAt(i) - 'a');
        }
        return num;
    }
}