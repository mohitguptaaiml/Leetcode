class Solution {
    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int greatest = nums[0];
        for(int i=0 ; i<nums.length;i++){
            if(nums[i]<smallest){
                smallest = nums[i];
            }

            if(nums[i]>greatest){
                greatest = nums[i];
            }
        }

        while(greatest != 0){
            int temp = greatest;
            greatest = smallest % greatest;
            smallest = temp;
        }

        return smallest;
    }
}