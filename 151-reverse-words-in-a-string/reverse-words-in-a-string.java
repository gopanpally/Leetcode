class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String str[] = s.split("\\s+");
        int n = str.length;
         int first =0;
         int last = n-1;
         while(first<=last)
         {
            String temp = str[first];
            str[first]=str[last];
            str[last]=temp;
            first++;
            last--;
         }
         String rev = String.join(" ", str);
         return rev;
    }
}