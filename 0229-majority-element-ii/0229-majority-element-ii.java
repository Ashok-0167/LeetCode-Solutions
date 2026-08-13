class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n=nums.length;
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer> lt=new ArrayList<>();
        for(int x : map.keySet()){
            if(map.get(x)>(n/3)){
                lt.add(x);
            
            }
        }
       return lt;
    }
}