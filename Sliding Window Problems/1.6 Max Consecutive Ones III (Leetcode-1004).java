// Problem Statement ->https://leetcode.com/problems/longest-substring-without-repeating-characters/


class Solution {
    public int longestOnes(int[] A, int K) {
        
        int windowEnd = 0;
        int windowStart = 0;
        int countOfOne = 0;
        
        int maxSubarray = 0;
        
        for(windowEnd =0; windowEnd <A.length;windowEnd++){
            
            if(A[windowEnd] == 1) countOfOne++;
            
            if(windowEnd-windowStart+1 - countOfOne > K){
                
                if(A[windowStart] == 1) countOfOne--;
                
                windowStart++;
            }
            
            
            maxSubarray = Math.max(maxSubarray , windowEnd - windowStart+1);
        }
        
        return maxSubarray;
    }
}