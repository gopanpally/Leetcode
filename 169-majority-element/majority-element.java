class Solution {
    public int majorityElement(int[] nums) {
      int count =0;
      int n = nums.length;
      int num=nums[0];
      for(int i=0;i<n;i++)
      {
        if(count==0)
            num = nums[i];
        if(nums[i]== num)
        {
            count++;
        }
        else{
            count--;
        }
      }
      return num;
    }
}