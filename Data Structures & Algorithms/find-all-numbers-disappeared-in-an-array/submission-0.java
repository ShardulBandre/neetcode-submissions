class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size = nums.length;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < size; i++) {
            int index = Math.abs(nums[i]) - 1;
            
            if (nums[index] > 0) {
                nums[index] = nums[index] * -1;
            }
        }
        
        for (int i = 0; i < size; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        
        return list;
    }
}