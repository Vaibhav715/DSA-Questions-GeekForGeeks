// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int temp = n;
        while(n > 0){
            int dig = n%10;
            if(dig != 0){
            if(temp % dig == 0)
            count++;
        }
        n /= 10;
        }
        return count;
    }
}