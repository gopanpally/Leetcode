class Solution {
    public int lengthOfLastWord(String s) {
      
      String[] s1 = s.trim().split(" ");
      int n = s1.length;

      return s1[n-1].length();

        
    }
}