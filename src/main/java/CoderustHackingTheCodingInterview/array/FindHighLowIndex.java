package CoderustHackingTheCodingInterview.array;


import java.util.Arrays;
import java.util.List;

/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/lYg2l
 */
public class FindHighLowIndex {


    public static int findLowIndex(List<Integer> arr, int key) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) >= key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low < arr.size() && arr.get(low) == key) {
            return low;
        }
        return -1;
    }

    public static int findHighIndex(List<Integer> arr, int key) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= key) {
                low = mid + 1;
            } else {
               high = mid - 1;
            }
        }
        if (high < arr.size() && arr.get(high) == key) {
            return high;
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 5, 5, 5, 5, 5, 5, 5, 20);
        System.out.println(findLowIndex(list, 5));
        System.out.println(findLowIndex(list, 2));
        System.out.println(findLowIndex(list, 1));

        System.out.println("==================");

        System.out.println(findHighIndex(list, 5));
        System.out.println(findHighIndex(list, 2));
        System.out.println(findHighIndex(list, 1));
    }
}
