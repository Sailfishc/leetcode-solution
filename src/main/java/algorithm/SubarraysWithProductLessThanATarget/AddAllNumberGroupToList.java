package algorithm.SubarraysWithProductLessThanATarget;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

import util.PrintUtils;

/**
 * @author sailfish
 * @create 2020-01-01-11:10 AM
 */
public class AddAllNumberGroupToList {


    public static List<List<Integer>> addGroup(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            List<Integer> tempList = new LinkedList<>();
            for (int right = i; right >= 0; right--) {
                tempList.add(0, arr[right]);
                list.add(new ArrayList<>(tempList));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        final List<List<Integer>> list = addGroup(new int[]{8, 2, 6, 5});
        for (List<Integer> item : list) {
            PrintUtils.println(item);
        }
    }
}
