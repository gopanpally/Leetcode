class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0; i<n;i++)
        {
            int temp = target-nums[i];
            if(hs.containsKey(temp))
            {
                return new int[] {i,hs.get(temp)};
            }
           hs.put(nums[i],i) ;
        }
        return new int[0];
    }
}