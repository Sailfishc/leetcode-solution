package algorithm.L0202_HapplyNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {


    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        int num = n;
        while ((num = transform(num)) != 1) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }

        return true;
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
