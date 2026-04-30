class Solution {
    public boolean validPalindrome(String s) {
        if(isPalindrome(s)){
            return true;
        }
        for(int i=0;i<s.length();i++){
            String S = s.substring(0, i) + s.substring(i + 1);
            if(isPalindrome(S)){
                return true;
            }
        }
        return false;
    }
    private boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}