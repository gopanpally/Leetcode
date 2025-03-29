class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        //int right =0;
        int left =0;
        int maxLength = Integer.MIN_VALUE;
        Set<Character> sh = new HashSet<Character>();

        for(int right =0; right<n; right++ )
        {
            while(sh.contains(s.charAt(right)))
            {
                sh.remove(s.charAt(left));
                left++;
            }
            sh.add((s.charAt(right)));
            maxLength = Math.max(maxLength, right-left+1);

        }
        return maxLength == Integer.MIN_VALUE?0:maxLength;
    }
}