class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int max=Integer.MIN_VALUE;
        int ans =0;
        for(int i =0; i<n;i++)
        {
            max = Math.max(max, piles[i]);

        }
        int low = 1; int high = max;

        while(low<=high)
        {
            int mid = (low+high)/2;
            int totalHours = calculateTotalHours(piles, mid);
            if(totalHours<=h)
            {
               high = mid-1;
            }
            else{
                
                 low=mid+1;
            }
            
        }
        return low;
        }
        public int calculateTotalHours(int piles[], int hourly)
        {
            int hours=0;
            int n = piles.length;
            for(int i =0; i<n;i++)
            {
                hours += Math.ceil((double)(piles[i])/(double)(hourly));
            }
            return hours;
        }
}