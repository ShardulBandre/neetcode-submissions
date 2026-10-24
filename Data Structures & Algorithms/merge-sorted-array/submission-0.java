class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m - 1;       // Pointer for the last valid element in nums1
        int r2 = n - 1;       // Pointer for the last element in nums2
        int w = m + n - 1;    // Pointer for the last position in nums1

        // Merge from the back to the front
        while (r2 >= 0) {
            if (r1 >= 0 && nums1[r1] > nums2[r2]) {
                nums1[w--] = nums1[r1--];
            } else {
                nums1[w--] = nums2[r2--];
            }
        }
    }
}