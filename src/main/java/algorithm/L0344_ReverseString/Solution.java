package algorithm.L0344_ReverseString;

import util.ArrayHelper;

public class Solution {

    public void reverseString(char[] s) {

        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        Solution solution = new Solution();
        solution.reverseString(chars);

        ArrayHelper.printArrForChar(chars);

    }

}
