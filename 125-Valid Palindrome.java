class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str2  = new StringBuilder();
        for(int a=0 ; a<s.length() ; a++){
            char ch = s.charAt(a);
            int asci = (int)(ch);
            if ((asci >= 97 && asci< 123) || (asci >= 48 && asci <= 57)){
                str2.append(ch);
            } 
        }
        int start = 0;
        int end = str2.length() -1;
        int count = 0;
        while(start<end){
            if(str2.charAt(start)!=str2.charAt(end)){
               return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
