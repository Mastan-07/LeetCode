class Solution {
    public String removeKdigits(String num, int k) 
    {
      if (k >= num.length()) {
            return "0";
        }

        int position = -1;
        int countDeletedCharacter = k;
        char[] digits = new char[num.length()];

        for (char digit : num.toCharArray()) {
            while (position >= 0 && countDeletedCharacter > 0 && digits[position] > digit) {
                position--;
                countDeletedCharacter--;
            }
            position++;
            digits[position] = digit;
        }

        int start = 0;
        int end = num.length() - k;
        while (digits[start] == '0' && start < end - 1) {
            start++;
        }
        return String.valueOf(digits, start, end - start);
}
}