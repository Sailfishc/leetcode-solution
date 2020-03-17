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

            if (arr[start] < arr[mid]) {
                if (key > arr[start] && key < arr[mid]) {
                    end = mid - 1;
                } else {

                }
            }
        }
        return -1;
    }

}
