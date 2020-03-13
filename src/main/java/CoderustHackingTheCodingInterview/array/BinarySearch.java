package CoderustHackingTheCodingInterview.array;


/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/k5qJx
 */
public class BinarySearch {


//    Given a sorted array of integers, return the index of the given key. Return -1 if the key is not found.

    /*
          思路：
              1. 定义两个指针start, end
              2. start = 0, end = len-1
              3. 如果 mid = (start + end) / 2 > key, 则 end = mid - 1
              4. 如果 mid = (start + end) / 2 < key, 则 start = mid + 1
              5. 如果相等，则返回
     */

    public static int binSearch(int[] arr, int key) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }


    public static int binSearchRec(int[] arr, int key) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        return doBinSearchRec(arr, key, 0, arr.length - 1);
    }

    private static int doBinSearchRec(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return doBinSearchRec(arr, key, low, mid - 1);
        } else {
            return doBinSearchRec(arr, key, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222};
        int[] inputs = {10, 49, 99, 110, 176};

        for (int i = 0; i < inputs.length; i++) {
            System.out.println("binSearch(arr, " + inputs[i] + ") = " + binSearchRec(arr, inputs[i]));
        }
    }

}
