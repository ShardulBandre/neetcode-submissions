class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        
        int i = 0, j = 0; 
        
        while (i < size) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        
        while (j < size) {
            nums[j] = 0;
            j++;
        }
    }
}