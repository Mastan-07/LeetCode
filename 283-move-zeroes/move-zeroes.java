class Solution {
    public void moveZeroes(int[] a) {
        int n = a.length;
        int nonZeroIndex = 0; // Pointer to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[nonZeroIndex] = a[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeroes
        while (nonZeroIndex < n) {
            a[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}