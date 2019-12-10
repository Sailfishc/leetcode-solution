package template;


/**
 * 对撞指针模板：（限定是有序的）
 *      1. 设置两个指针在数组两边
 *      2. 通过比较值来移动左右指针
 *      3. 直到找到满足条件的值为止
 */
public class TwoPointTemplate {


    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{-1, -1};
    }

}
