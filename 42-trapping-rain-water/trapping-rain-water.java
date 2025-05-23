class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int total =0;
        while(left<=right)
        {
            if(height[left] <= height[right] )
            {
                if(height[left]>leftMax)
                {
                    leftMax = height[left]; 
                }
                else {
                    total = total+ leftMax-height[left];
                }
                left++;
            }
            else
            {
                if(height[right]> rightMax)
                {
                    rightMax = height[right];
                }
                else{
                    total+= rightMax-height[right];
                }
                right--;
            }

        }
        return total;
    }
}