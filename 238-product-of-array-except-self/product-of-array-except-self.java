class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int zeroCount =0;
        for(int i =0; i<n;i++)
        {
            if(nums[i]==0)
            {
                zeroCount++;
                continue;
            }
            product = product*nums[i];
        }
        int[] arr = new int[n];
        for(int i =0; i<n;i++)
        {
            if(zeroCount>1)
            {
                arr[i]=0;
            }
            else if(zeroCount ==1)
            {
                arr[i] = nums[i]==0?product:0;
            }
            else{
                arr[i] = product/nums[i];
            }
        }
        return arr;
    }
}