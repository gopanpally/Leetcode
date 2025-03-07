class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int n = nums.length;
        int high = n-1;
        if(n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return nums[0]>nums[1]?0:1;
        }
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if((mid==0 || nums[mid]>nums[mid-1])&& (mid==n-1 ||nums[mid]>nums[mid+1]))
            {
                return mid;
            }
            else if(mid<n-1 && nums[mid]<=nums[mid+1])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return 0;
    }
}