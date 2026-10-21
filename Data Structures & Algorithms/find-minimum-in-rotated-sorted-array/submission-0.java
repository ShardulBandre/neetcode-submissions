class Solution {
    public int findMin(int[] nums) {
        int high = nums.length -1;
        int low = 0;

        return binarySearch(nums, low, high);
    }

    public int binarySearch(int[] nums, int low, int high){
        if (nums.length == 0){
            return nums[0];
        }

        if (high == low){
            return nums[high];
        }

        int mid = low + (high -low)/2;
        if (nums[mid] < nums[high]){
            return binarySearch(nums, low, mid);
        } else if (nums[mid] > nums[high]){
            return binarySearch(nums, mid + 1, high);
        }

return nums[0];
    }
}
