class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[26];
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++)
        {
             freq[str[i]-'a']++;
        }
        for(int i=0;i<str.length;i++)
        {
           if(freq[str[i]-'a']==1)
            {
                return i;
            }

        }
        return -1;
        
    }
}