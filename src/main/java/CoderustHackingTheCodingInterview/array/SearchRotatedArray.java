package CoderustHackingTheCodingInterview.array;


/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/kR7nE
 */
public class SearchRotatedArray {


//    (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).


    public static int binarySearchRotated(int[] arr,int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }

            // 有序
            if (arr[start] < arr[mid]) {
                if (key >= arr[start] && key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // 有序
            if (arr[mid] < arr[end]) {
                if (key > arr[mid] && key <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] v1 = {6, 7, 1, 2, 3, 4, 5};
        System.out.println("Key(3) found at: "+binarySearchRotated(v1, 3));
        System.out.println("Key(6) found at: "+binarySearchRotated(v1, 6));

        int[] v2 = {4, 5, 6, 1, 2, 3};
        System.out.println("Key(3) found at: "+binarySearchRotated(v2, 3));
        System.out.println("Key(6) found at: "+binarySearchRotated(v2, 6));
    }
}
