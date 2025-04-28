class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int doubleNumsArray[] = new int[2*n];
        System.arraycopy(nums, 0 , doubleNumsArray, 0, n);
        System.arraycopy(nums, 0, doubleNumsArray, n, n);
        for(int i =0; i<n; i++)
        {
            for(int j = i+1; j<doubleNumsArray.length; j++)
            {
                if(nums[i]<doubleNumsArray[j])
                {
                    res[i] = doubleNumsArray[j];
                    break;
                }
                else
                {
                    res[i]= -1;
                }
            }
        }
        return res;
    }
}