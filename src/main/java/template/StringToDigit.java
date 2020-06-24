package template;

/**
 * @author 成易
 * @version V1.0
 * @Title:
 * @Package template
 * @Description:
 * @date 2020/6/22 8:22 上午
 */
public class StringToDigit {


    public static int charToDigit(char c) {
        return c - '0';
    }


    public static int digitToChar(int val) {
        return val + '0';
    }

    public static void main(String[] args) {
        System.out.println(charToDigit('9'));
        System.out.println(digitToChar(9));
    }
}
