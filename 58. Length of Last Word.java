class Solution {
    public int lengthOfLastWord(String s) {
         StringBuilder str = new StringBuilder(s);
        for (int i = str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            if (ch == ' '){
                str = str.deleteCharAt(i);
            }else {
                break;
            }
        }
        int count = 0;
        for (int i = str.length()-1; i>=0; i--) {
            if (str.charAt(i)!= ' '){
                count++;
            }else {
               break;
            }

        }
        return count;
    }
}
