import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {

                int below = triangle.get(i + 1).get(j);
                int belowRight = triangle.get(i + 1).get(j + 1);

                int currentVal = triangle.get(i).get(j);
                triangle.get(i).set(j, currentVal + Math.min(below, belowRight));
            }
        }
        return triangle.get(0).get(0);
    }
}