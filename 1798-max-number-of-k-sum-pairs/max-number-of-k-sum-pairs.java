class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int operations =0;

        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            int complement = k-num;

            if(hm.getOrDefault(complement,0)>0)
            {
                operations++;
                hm.put(complement, hm.getOrDefault(complement,0)-1);
            }
            else
            {
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
        }
        return operations;
    }
}