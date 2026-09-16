class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // Step 1: remove leading spaces
        if (s.length() == 0) return 0;

        int sign = 1, i = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        long num = 0; // use long to check overflow
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int)(sign * num);
    }
}
