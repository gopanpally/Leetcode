class Solution {
    public void moveZeroes(int[] nums) {

        int a = 0;

       for(int b =0;b<nums.length;b++)
       {
           if(nums[b]!=0)
           {
            int temp = nums[b];
            nums[b]= nums[a];
            nums[a] = temp;
             a++;
           }
          
       }
    }
}