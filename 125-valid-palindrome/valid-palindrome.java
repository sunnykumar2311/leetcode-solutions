class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-z0-9]","");
        return isPalindromeHelper(str,0, str.length()-1);
        
    }
    public boolean isPalindromeHelper(String str,int l,int r){
        if(l>=r)
        {
            return true;
        }
        if(str.charAt(l)==str.charAt(r))
        {
            return isPalindromeHelper(str,l+1,r-1);
        }
        else
        {
            return false;
        }

    }
}