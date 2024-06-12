class Solution {
    public void sortColors(int[] nums) {
        int zeroCnt = 0, oneCnt = 0, twoCnt = 0;

        // Count occurrences
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroCnt++;
            } else if(nums[i] == 1) {
                oneCnt++;
            } else {
                twoCnt++;
            }
        }

        int arrayIterator = 0;

        // Place all 0s
        for(int i = 0; i < zeroCnt; i++) {
            nums[arrayIterator] = 0;
            arrayIterator++;
        }

        // Place all 1s
        for(int i = 0; i < oneCnt; i++) {
            nums[arrayIterator] = 1;
            arrayIterator++;
        }

        // Place all 2s
        for(int i = 0; i < twoCnt; i++) {
            nums[arrayIterator] = 2;
            arrayIterator++;
        }
    }
}