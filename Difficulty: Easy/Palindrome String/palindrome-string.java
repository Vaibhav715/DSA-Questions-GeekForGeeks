class Solution {
    boolean isPalindrome(String s) {
        // code here
        
        //Normal Method to find Palindrome String.
        
        // String rev = "";
        // int n = s.length();
        
        // for(int i = n-1; i>=0; i--){
            
        //     rev += s.charAt(i);
        // }
        
        // if(rev.equals(s))
        // return true;
        // else
        // return false;
        
        int startPointer = 0;
        int endPointer = s.length()-1;
        
        while(startPointer <= endPointer){
            if(s.charAt(startPointer) == s.charAt(endPointer)){
            startPointer++;
            endPointer--;
            }
            else return false;
        }
            return true;
    }
}