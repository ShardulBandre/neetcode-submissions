

class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();

        // Step 1: Find the candidate majority element using Boyer-Moore Voting Algorithm
        int me = nums.get(0);
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) == me) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                me = nums.get(i);
                count = 1;
            }
        }

        // Step 2: Count total occurrences of the dominant element 'me'
        int totalCount = 0;
        for (int num : nums) {
            if (num == me) {
                totalCount++;
            }
        }

        // Step 3: Find the minimum index i for a valid split
        int leftCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == me) {
                leftCount++;
            }
            int rightCount = totalCount - leftCount;

            // Left subarray size is (i + 1), right subarray size is (n - 1 - i)
            if (leftCount * 2 > (i + 1) && rightCount * 2 > (n - 1 - i)) {
                return i;
            }
        }

        return -1;
    }
}