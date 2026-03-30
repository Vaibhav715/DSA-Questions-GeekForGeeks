// User function Template for Java

class Solution {
    static int cubeRoot(int n) {
        // code here
       double cuberoot = Math.cbrt(n);
       int result = (int) Math.floor(cuberoot);
       return result;
    }
};