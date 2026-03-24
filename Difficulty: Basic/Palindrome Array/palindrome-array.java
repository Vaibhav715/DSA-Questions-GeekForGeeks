
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int startPointer = 0;
        int endPointer = arr.length-1;
        int flag = 1;
        
        while(startPointer < endPointer){
            if(arr[startPointer] == arr[endPointer]){
            startPointer++;
            endPointer--;
            }
            else{
                flag = -1;
            return false;
            }
        }
        return true;
    }
}
