class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        int s = 0;
        int p = 1;
        while (n > 0) {
            int d = n % 10;
            s += d;
            p *= d;
            n /= 10;
        }
        int a = s + p;
        return t % a == 0;

    }
}