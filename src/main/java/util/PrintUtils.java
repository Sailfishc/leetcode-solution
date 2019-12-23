package util;

import java.util.List;

public class PrintUtils {

    public static <T> void println(List<T> list) {
        StringBuilder sb = new StringBuilder("result = [");
        for (T t : list) {
            sb.append(t)
                    .append(" ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
