class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxFrequency = 0;
        int res = -1;

        for(int i : nums){
            if(i%2 == 0){
                int count = hm.getOrDefault(i,0)+1;
                hm.put(i,count);

                if(count > maxFrequency || (count == maxFrequency && i<res)){

                    maxFrequency = count;
                    res = i;
                }
            }


        }

        return res;
    }
}