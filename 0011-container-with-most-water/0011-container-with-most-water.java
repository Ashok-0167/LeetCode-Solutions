class Solution {
    public int maxArea(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int res=0;
        while(l<r){
            int width=r-l;
            int h=Math.min(nums[l],nums[r]);
            int area=width*h;
            res=Math.max(res,area);
            if(nums[l]<nums[r]){
                l++;
            }else{
                r--;
            }
        }
            return res;
    }
}