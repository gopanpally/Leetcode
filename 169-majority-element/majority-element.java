class Solution {
    public int majorityElement(int[] nums) {
      int count =0;
      int n = nums.length;
      int num=nums[0];
      for(int i=0;i<n;i++)
      {
        if(nums[i]==num)
        {
            count++;

        }
        else if(nums[i]!=num && count<=1)
        {
            num = nums[i];
        }
        else
            count--;
      }
       return num; 
    }
}