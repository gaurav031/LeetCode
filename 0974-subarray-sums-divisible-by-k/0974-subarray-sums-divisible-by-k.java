import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // HashMap to store frequency of prefix sums mod k
        Map<Integer, Integer> prefixModCount = new HashMap<>();
        // Initialize with 0 mod k count as 1 (empty subarray case)
        prefixModCount.put(0, 1);
        
        int prefixSum = 0;
        int count = 0;
        
        for (int num : nums) {
            // Update the running prefix sum
            prefixSum += num;
            // Calculate mod value (make sure it is positive)
            int modValue = ((prefixSum % k) + k) % k;
            // If this mod value has been seen before, it means there are
            // subarrays ending at the current index which sum to a multiple of k
            count += prefixModCount.getOrDefault(modValue, 0);
            // Update the count of the current mod value in the map
            prefixModCount.put(modValue, prefixModCount.getOrDefault(modValue, 0) + 1);
        }
        
        return count;
    }
}
