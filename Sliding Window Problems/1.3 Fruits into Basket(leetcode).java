// Fruits into Baskets (medium)

// Problem --> https://leetcode.com/problems/fruit-into-baskets/submissions/

class Solution {
    public int totalFruit(int[] tree) {
        
    // STEP 1 : add fruit into the basket i.e. in a hashmap and when the size becomes > 2
                
    // do the following : 1) remove the  tree[firstIndex] from the hashmap untill the size of the map              becomes equal to k 
    
    // after each iteration of traversing the tree array update the maxAmt of fruits collected each time
        
        if(tree.length == 0) return 0;
        
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        
        int k = 2;
        int currAmt = 0;
        int maxAmt = 0;
        int startIdx = 0;
        
        for(int index =0;index<tree.length;index++){
            hm.put(tree[index] , hm.getOrDefault(tree[index],0)+1);
            currAmt++;
            
            
            while(hm.size() > k){
                
                if(hm.get(tree[startIdx]) > 1){
                    hm.put(tree[startIdx],hm.get(tree[startIdx])-1);
                }
                else {
                    hm.remove(tree[startIdx]);
                }
                currAmt--;
                startIdx++;
            }
            
            maxAmt = Math.max(maxAmt , currAmt);
        }
        return maxAmt;
    }
}