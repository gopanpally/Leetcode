class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-zA-Z0-9]", "");
        String lower = temp.toLowerCase();
        StringBuilder str = new StringBuilder();
        int n = lower.length();
        for(int i =n-1;i>=0;i--)
        {
            str.append(lower.charAt(i));
        }

        
        return lower.equals(str.toString());
        
    }
}