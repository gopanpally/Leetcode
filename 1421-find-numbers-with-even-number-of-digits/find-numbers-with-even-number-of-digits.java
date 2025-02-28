class Solution {
    public int findNumbers(int[] nums) {
        int ans =0;

        for(int i =0; i<nums.length;i++)
        {
            if(nums[i]>=10 && nums[i]<=99)
                ans++;
            else if(nums[i]>=1000 && nums[i]<=9999)
                ans++;
            else if(nums[i]==100000)
                ans++;
        }
        return ans;
    }
}