class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int result[] = new int[n];
        Arrays.sort(potions);
        for(int i =0; i<n;i++)
        {
            int low =0;
            int high =m-1;
            //int count =0;
            while(low<=high)
            {
                int mid = low+(high-low)/2;
                if((long)spells[i]*potions[mid]>=success)
                {
                    high = mid-1;
                   // count = mid;
                }
                else
                {
                    low = mid+1;
                }
            }
            result[i]= m-low;
        }
        return result;
    }
}