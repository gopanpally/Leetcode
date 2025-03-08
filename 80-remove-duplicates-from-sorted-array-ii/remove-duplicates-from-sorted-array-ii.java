class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int i =1;
        int count =0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]==nums[j-1] && count<1)
            {
                nums[i] = nums[j];
                count++;
                i++;
            }
            else if(nums[j]!=nums[j-1])
            {
                nums[i]=nums[j];
                i++;
                count =0;
            }
        }
        return i;
    }
}