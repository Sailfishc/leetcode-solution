package CoderustHackingTheCodingInterview.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/k58JJ
 */
public class MoveZeros {


    /**
     * 第一版思路
     * @param A
     */
    public static void moveZerosToLeft(int[] A) {
        if (A == null || A.length == 0) {
            return;
        }
        List<Integer> temp = new ArrayList<>();
        for (int a : temp) {
            if (a != 0) {
                temp.add(a);
            }
        }

        for (int i = 0; i < A.length; i++) {
            int offset = A.length - temp.size();
            if (i < offset) {
                A[i] = 0;
            }
            A[i] = temp.get(i - offset);
        }

    }


    public static void moveZerosToLeft2(int[] A) {
        if (A == null || A.length == 0) {
            return;
        }
        int read = A.length - 1, write = A.length - 1;
        while (read >= 0) {
            if (A[read] != 0) {
                A[write--] = A[read];
            }
            read--;
        }

        while (write > 0) {
            A[write--] = 0;
        }

    }

    public static void main(String[] args) {

    }

}
