class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        int left =0;
        int maxLength=0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (hm.containsKey(c)) {
                // Move left only if it's behind the last seen index
                left = Math.max(left, hm.get(c) + 1);
            }

            hm.put(c, right); // update last seen index of char
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}