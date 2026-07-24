class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<Integer> ls = new ArrayList<>();

        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(int i : hm.keySet()){
            int freq = hm.get(i);
            if(freq>(nums.length/3)){
                ls.add(i);
            }
        }
        return ls;
    }
}