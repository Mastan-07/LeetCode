class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) 
    {
        List<Integer>l=new ArrayList<>();
        int n=a.length;
        int c=0;
        int[] x=new int [n];
        for(int i=0;i<n;i++)
        {
            if(l.contains(a[i]))
            {
                c++;
            }
            else
            {
                 l.add(a[i]);

            }
            
            if(l.contains(b[i]))
            {
                c++;
            }
            else
            {
                l.add(b[i]);

            }
        
            x[i]=c;

        }


        return x;
    }
}