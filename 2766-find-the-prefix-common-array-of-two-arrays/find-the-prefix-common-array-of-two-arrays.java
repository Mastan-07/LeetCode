class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] stat = new int[a.length + 1];
        int[] c = new int[a.length];

        int cur = 0;
        for (int i = 0; i < a.length; i++) {
            stat[a[i]]++;
            if (stat[a[i]] == 2) {
                cur++;
            }
            stat[b[i]]++;
            if (stat[b[i]] == 2) {
                cur++;
            }
            c[i] = cur;
        }
        return c;
    }
}