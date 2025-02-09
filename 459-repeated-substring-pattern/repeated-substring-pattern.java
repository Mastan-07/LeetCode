class Solution {
    private static boolean check(String s, String substr) {
        return s.endsWith(substr) && substr.repeat(s.length() / substr.length()).equals(s);
    }
    public boolean repeatedSubstringPattern(String s) {
        int slen = s.length();

        int upTo = (int) Math.ceil(Math.sqrt(slen));
        for (int i = 1; i <= upTo; ++i) {
            if (slen % i == 0) {
                int len1 = i;
                if (len1 != slen && check(s, s.substring(0, len1))) {
                    return true;
                }
                int len2 = slen / i;
                if (len2 != 1 && len2 != slen && check(s, s.substring(0, len2))) {
                    return true;
                }
            }
        }
        return false;
    }
}