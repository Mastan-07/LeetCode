class Solution {
    public int titleToNumber(String columnTitle) {
        int colnum=0,i=0;
        while(i!=columnTitle.length()){
            colnum=colnum * 26+(columnTitle.charAt(i)-'A'+1);
            i++;

        }return colnum;


        
    }
}