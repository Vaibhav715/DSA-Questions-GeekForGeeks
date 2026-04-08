class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
         HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        map.put(0,1);
        
        for(int i = 0; i<arr.length;i++){
            sum += arr[i];
            
            if(map.containsKey(sum-0)){
                ans += map.get(sum-0);
            }
            
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
            }else {
               map.put(sum, 1); 
            }
        }
        
       return (ans>0) ?  true :  false; 
    } 
}