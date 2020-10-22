
// Problem link : https://leetcode.com/problems/minimum-size-subarray-sum

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
    // Similar to max sum subarray of size k 
        
    // STEP 1 : first as there's no window size given we'll iterate the array and keep on adding 
    // elements untill our windowsum >= s , and will keep on increasing currSize 
        
    // now STEP 2 : when windowsum >= s , set minSize = currSize and perform 
        // 1) windowSum - nums[firstIndex]; firstIndex++  
        // 2) update  currSize & minSize repeat it untill windowSum < s
        
        //   windw      
        // [2,3,1,2   4,3]   minSize = 4| currSum = 8 > s 
        // [3,1,2,4   3]     minSize = 4| currSum 10 >s 
        // [1,2,4   3 ]      minSize = 3| currSum  7 >= s
        // [2,4,3]           minSize = 3| currSum 9 >= s
        // [4,3]             minSize = 2| currSum 7 == s
        
        
        int windowEnd = 0;
        int windowStart = 0;
        int minSize = Integer.MAX_VALUE;
        int currSize = 0;
        int currSum = 0;
        
        for(windowEnd = 0; windowEnd < nums.length; windowEnd++){
            
            currSum += nums[windowEnd];
            currSize++;
            
           
                while(currSum >= s){
                    minSize = Math.min(minSize,currSize);
                    currSum -= nums[windowStart];
                    windowStart++;
                    currSize--;
                }
           
        }
        
       return (minSize == Integer.MAX_VALUE) ? 0 :  minSize;
    }
    
    /*
The time complexity of the above algorithm will be O(N). The outer for loop runs for all elements and the inner while loop processes each element only once, therefore the time complexity of the algorithm will be O(N+N) which is asymptotically equivalent to O(N).
    */
}