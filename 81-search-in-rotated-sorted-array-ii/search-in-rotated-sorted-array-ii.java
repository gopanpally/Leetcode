class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int left =0;
        int right=n-1;

        while(left<=right){
           int mid = (left+right)/2;

           if(nums[mid]==target)
           {
            return true;
           }
           if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            } 
           else if(nums[left]<=nums[mid])
           {
                if(nums[left]<=target && target<=nums[mid])
                {
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
           }
           else
           {
            if(nums[right]>=target && target>=nums[mid])
            {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
           }


        }
        return false;
    }
}