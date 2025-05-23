class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character, Integer> hm = new HashMap<>();
       int left =0;
       int maxLength=0;
       int n = s.length();
       for(int right=0; right<n;right++)
       {
        if(hm.containsKey(s.charAt(right)))
        {
            left = Math.max(left, hm.get(s.charAt(right))+1);
        }
        hm.put(s.charAt(right), right);
        maxLength = Math.max(maxLength, right-left+1);
       }
       return maxLength;
    }
}