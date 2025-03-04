class Solution {
    public int searchInsert(int[] nums, int target) {
        int low =0;
        int n = nums.length;
        int high = n-1;
        if(n<2)
        {
            if(nums[0]>target)
            {
                return n-1;
            }
        }
        
        if(target > nums[high])
            return high+1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}