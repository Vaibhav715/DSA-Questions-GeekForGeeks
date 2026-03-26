
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        
        // TLE but approach is correct
        
        // int c = 0;
        // if(a.length >= b.length){
        //     for(int i = 0 ; i < b.length; i++){
        //         for(int j = 0 ; j < a.length; j++){
        //             if(b[i] == a[j]){
        //             c++;
        //             a[j]=-1;
        //             break;
        //             }
        //         }
        //     }
        //     if(c == b.length)
        //     return true;
        //     else
        //     return false;
        // }
        // else
        // return false;
        
// int start1 = 0;
// int start2 = 0;
// int c = 0;

// if(a.length >= b.length){
//     while(start2 < b.length){   // ✅ only depend on b

//         if(start1 == a.length){   // ✅ FIX: restart search in a
//             start1 = 0;
//             start2++;             // move to next element of b
//             continue;
//         }

//         if(a[start1] == b[start2]){
//             c++;
//             a[start1] = -1;
//             start1 = 0;           // ✅ FIX: restart for next b element
//             start2++;
//         }
//         else {
//             start1++;
//         }
//     }

//     if(c == b.length)
//         return true;
//     else
//         return false;
// }
// else
//     return false;

      return Subset(a,b) ;

    }
    
public static boolean Subset(int[] a, int[] b) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < a.length; i++){
        map.put(a[i], map.getOrDefault(a[i], 0) + 1);
    }

    for(int i = 0; i < b.length; i++){
        if(!map.containsKey(b[i]) || map.get(b[i]) == 0)
            return false;

        map.put(b[i], map.get(b[i]) - 1);
    }

    return true;
}
}
