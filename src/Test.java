import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[] aa = null;
        System.out.println(aa.length);
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(1, 1);
        hmap.put(2, 1);
        int a = hmap.get(2);
        hmap.put(2, --a);
        System.out.println(hmap.toString());

    }
}
