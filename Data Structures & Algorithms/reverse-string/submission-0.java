class Solution {
    public void reverseString(char[] s) {
        int size = s.length;

        int left = 0, right = size-1;
        char temp;

        while(left<right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}