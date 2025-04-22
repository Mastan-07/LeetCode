class Solution {
    public String getHint(String secret, String guess) {
        List list=new ArrayList();
        List usedindex= new ArrayList();
        int a=0,b=0;
        for(int i=0;i<secret.length();i++){
            list.add(secret.charAt(i));
        }
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                 a++;
                 list.remove(Character.valueOf(secret.charAt(i)));
                 usedindex.add(i);
            }
        }
        for(int i=0;i<secret.length();i++){
            if(!usedindex.contains(i) && list.contains(guess.charAt(i))){
                b++;
                list.remove(Character.valueOf(guess.charAt(i)));
            }
    }
    char[] ch=new char[4];
    ch[0]=(char)('0'+a);
    ch[1]='A';
    ch[2]=(char)('0'+b);
    ch[3]='B';
String ans = new String(ch);
    return a+ "A" + b + "B";
    }
}