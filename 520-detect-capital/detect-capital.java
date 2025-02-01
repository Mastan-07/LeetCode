class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        if(word.charAt(0)>='A' && word.charAt(0)<='Z')
        {
            c=1;
        }
    for(int i=1;i<word.length();i++)
    {
        if(word.charAt(i)>='A' && word.charAt(i)<='Z')
        {
            
            if(c!=i)
            {
                return false;
            }
            c++;
        }
        else if(c>1)
        {
            return false;
        }
    }
    return true;
    }
}