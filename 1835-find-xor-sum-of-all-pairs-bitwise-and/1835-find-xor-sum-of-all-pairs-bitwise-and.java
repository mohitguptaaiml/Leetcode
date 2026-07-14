class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int result = 0, xor = 0;
        
        for(int n : arr1){
            xor ^= n;
        }

        for(int n : arr2){
            result = result ^ (xor & n);
        }
        return result;
    }
}