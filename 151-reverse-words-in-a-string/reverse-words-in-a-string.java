class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String str[] = s.split(" ");
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