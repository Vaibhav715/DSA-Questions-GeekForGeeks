// User function Template for Java

class Solution {
    int countStrings(int n) {
        // code here
        if(n <= 2) return n+1;
        // else return countStrings(n-1) + countStrings(n-2) ;
        
        int []arr = new int[n+1];
        arr[1] = 2; arr[2] = 3;
        
        for(int i = 3; i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        
        return arr[n];
    }
}