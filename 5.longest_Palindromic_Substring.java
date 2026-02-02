class Solution {

    public boolean check(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String result = "";
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                if (check(str) && str.length() > maxLen) {
                    result = str;
                    maxLen = str.length();
                }
            }
        }
        return result;
    }
}
