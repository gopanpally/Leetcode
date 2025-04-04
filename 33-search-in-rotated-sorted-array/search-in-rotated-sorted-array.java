class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        int mid =0;
        boolean temp =false;
        while(left<=right)
        {
            mid = left + (right-left)/2;
            if(nums[mid]==target){
                
                temp=true;
                return mid;
            }
            if( nums[left] <= nums[mid] )
            {
                if(nums[left]<=target && target< nums[mid])
                {
                    right = mid-1;
                }
                else 
                    left = mid+1;
            }
            else 
            {
                if(nums[right]>= target && target> nums[mid])
                {
                    left = mid+1;
                }
                else
                    right = mid -1;
            }
        }
        return temp?mid:-1;
    }
}