class Solution {
    public int mySqrt(int x) {
    if(x<2)
    {
        return x;
    }
    int low =1;
    int high = x/2;
   
    while(low<=high)
    {
        int mid = low +(high-low)/2;
        long midSquare = (long)mid*mid;

        if(midSquare == x)
        {
            return mid;
        }
        else if(midSquare<x)
        {
            low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    return high; 
    }
}