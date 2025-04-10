class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet<String> hs = new HashSet<>(wordDict);

        boolean result[] = new boolean[n+1];
        result[0] = true;

        for(int i =1; i<=n; i++)
        {
            for(int j =0; j<i; j++)
            {
                if(result[j] && hs.contains(s.substring(j,i)))
                {
                    result[i]=true;
                    break;
                }
            }
        }
        return result[n];
    }
}