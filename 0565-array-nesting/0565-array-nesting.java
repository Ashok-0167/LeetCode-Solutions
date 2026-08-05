class Solution {
    public int arrayNesting(int[] nums) {
        int maxlen = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) continue;
            int count = 0;
            int j = i;
            
            while (nums[j] >= 0) {
                int next = nums[j];
                nums[j] = -1;
                j = next;
                count++;
            }
            
            maxlen = Math.max(maxlen, count);
        }
        
        return maxlen;
    }
}