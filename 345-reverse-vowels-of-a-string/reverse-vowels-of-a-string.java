class Solution {
    public String reverseVowels(String s) {
        char[] chr = s.toCharArray();
        String vowels = "AEIOUaeiou";
        int i =0;
        int j = chr.length -1 ;
        while(i<j)
        {
           while(i<j && vowels.indexOf(chr[i])==-1)
           {
            i++;
           }
           while(i<j && vowels.indexOf(chr[j])== -1)
           {
            j--;
           }

           if(i<j)
           {
            char temp = chr[i];
            chr[i] = chr[j];
            chr[j] = temp;
           }
           i++;
           j--;
        }
        return new String(chr);
        
    }
}