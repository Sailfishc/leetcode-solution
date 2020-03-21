package CoderustHackingTheCodingInterview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static void rotateArray(List<Integer> arr, int n) {
        if (n == 0) {
            return;
        }
        List<Integer> result = new ArrayList<>();
        if (n > 0) {
            for (int i = arr.size() - n; i < arr.size(); i++) {
                result.add(arr.get(i));
            }
            for (int i = 0; i < arr.size() - n; i++) {
                result.add(arr.get(i));
            }
        } else {
            n = Math.abs(n);
            for (int i = 0; i < arr.size() - n; i++) {
                result.add(arr.get(i));
            }
            for (int i = arr.size() - n; i < arr.size(); i++) {
                result.add(arr.get(i));
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, result.get(i));
        }
    }


    public static void rotateArray(int[] arr, int k) {
        k %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }


    /**
     * 翻转[start, end]的数组
     * @param arr
     * @param start
     * @param end
     */
    private static void reverse(int[] arr, int start, int end) {
        //
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 10, 20, 0, 59, 86, 32, 11, 9, 40);
        System.out.println("Array Before Rotation\n" + arr);
        rotateArray(arr, 2);
        System.out.println("Array After Rotation\n" + arr);
        final int[] arr2 = {1, 10, 20, 0, 59, 86, 32, 11, 9, 40};
        rotateArray(arr2, 2);
        System.out.println("Array After Rotation\n" );
        for (int i : arr2) {
            System.out.println(i);
        }

    }

}
