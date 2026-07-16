class Solution {
    public int consecutiveNumbersSum(int n) {
        int ans = 0;
        for(int i = 2 ;; i++){
        long sum = (long)i*(i-1)/2;

            if(sum>=n){
                break;
            }

            if((n-sum)%i == 0){
                ans++;
            }

           
        }
         return ans+1;
    }
}