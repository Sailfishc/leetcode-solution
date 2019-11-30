package util;

/**
 * @author sailfish
 * @create 2019-11-29-10:04 下午
 */
public class ArrayHelper {


    /**
     * 打印数组
     *
     * @param arr
     */
    public static void printArr(int[] arr) {
        StringBuilder sb = new StringBuilder("arr=[");
        for (int i : arr) {
            sb.append(i)
                    .append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        System.out.println(sb.toString());
    }


    /**
     * 交换两个元素
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
