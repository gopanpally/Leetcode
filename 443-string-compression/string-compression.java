class Solution {
    public int compress(char[] chars) {
        if(chars.length<=1)
        {
            return chars.length;
        }
        int count =1;
        char ch = chars[0];
        StringBuilder s = new StringBuilder();
        for(int i =1; i<chars.length;i++)
        {
            if(ch==chars[i])
            {
                count++;
            }
            else{
                s.append(ch);
                if(count>1){
                    s.append(count);
                }
                ch =chars[i];
                count =1;
            }
        }
        s.append(ch);
        if(count>1)
        {
            s.append(count);
        }
        
        int length = s.length();
        for(int i=0; i<length;i++)
        {
            chars[i]= s.charAt(i);
        }
        return length;
    }
}