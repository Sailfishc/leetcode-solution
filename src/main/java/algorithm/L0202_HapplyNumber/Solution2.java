package algorithm.L0202_HapplyNumber;

public class Solution2 {


    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }
        int fast = n;
        int slow = n;
        while (true) {
            fast = transform(transform(fast));
            slow = transform(slow);
            if (fast == 1) {
                return true;
            }

            if (slow == fast) {
                return false;
            }
        }
    }

    private int transform(int n) {
        int sum = 0;
        while (n > 0) {
            int a = n % 10;
            sum += a * a;
            n = n / 10;
        }
        return sum;
    }

}
