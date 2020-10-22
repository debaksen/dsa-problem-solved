
// Problem Statement : https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1#


static int maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        
        int windowSum = 0;
        int maxSum = 0; 
        int windowStart = 0;
        
        
        for(int index = 0; index < N; index++){
            windowSum += Arr.get(index);  // add the next element 
          // we don't need to add the elements if the subarray size < k        

          if(index >= K-1){  
                maxSum = Math.max(maxSum , windowSum);
                windowSum -= Arr.get(windowStart); //remove first of window     
                windowStart++;  // slide the window ahead
            }
        }
        
        return maxSum;
    }
	
