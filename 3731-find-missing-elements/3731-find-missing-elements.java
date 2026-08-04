class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int x: nums){
            max= Math.max(max,x);
            min= Math.min(min,x);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}