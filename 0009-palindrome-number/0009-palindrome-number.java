class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverse =0;
        if(x<0){
            System.out.println("false");
        }
        else
        {
            
            while(x>0)
            {
                int rem = x%10;
                reverse = reverse*10 + rem;
                x = x/10;
            }
               
        }
        return (temp==reverse);
        
    }
}