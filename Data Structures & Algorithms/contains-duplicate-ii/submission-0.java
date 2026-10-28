class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
  
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            
  
            if (map.containsKey(currentNum)) {
               
                int pastIndex = map.get(currentNum);
                if (i - pastIndex <= k) {
                    return true;
                }
            }
            
            map.put(currentNum, i);
        }
        
        return false;
    }
}