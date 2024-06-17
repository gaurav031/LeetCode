class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If the middle element is greater than the rightmost element,
            // the minimum value is in the right half of the array
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, the minimum value is in the left half (including mid)
                right = mid;
            }
        }
        
        // When the loop ends, left == right, pointing to the minimum element
        return nums[left];
    }
}