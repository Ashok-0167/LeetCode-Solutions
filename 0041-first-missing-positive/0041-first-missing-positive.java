class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ex=1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]<ex){
            continue;
           }
           if(nums[i]==ex){
            ex++;
           }
           if(nums[i]>ex){
                return ex;
           }
            }
        
        return ex;

    }
}