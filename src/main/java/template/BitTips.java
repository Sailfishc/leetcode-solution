package template;

/**
 * @author 成易
 * @version V1.0
 * @Title:
 * @Package template
 * @Description:
 * @date 2020/6/24 8:42 上午
 */
public class BitTips {


    /*
        tips:  使用n&(n-1)的方法：n&(n-1)作用：将n的二进制表示中的最低值为1的改为0
                   n         n-1        n&(n-1)
        step1   110101      110100      110100
        step2   110100      110011      110000
        step3   110000      101111      100000
        step4   110000      011111      000000
     */


    public static int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n &= (n - 1);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(110100));
    }
}
