class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        int l = 0;
        long ans = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            if (r - l + 1 > k) {
                sum -= nums[l];
                map.put(nums[l], map.get(nums[l])-1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }

            if (r - l + 1 == k && map.size() == k) {
                ans = Math.max(ans, sum);
            }
        }
        return ans;

    }
}