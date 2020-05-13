package leetcode;

public class LeetCode275 {

    public static void main(String[] args) {
        int a = hIndex(new int[] {});
        int b = hIndex(new int[] {1});
        int c = hIndex(new int[] {0,1,3,5,6});
        int d = hIndex(new int[] {0,1,2,3,4,5,5,5,5,11});
        int e = hIndex(new int[] {100});

        assert a == 0 : "a != 0";
        assert b == 1 : "b != 1";
        assert c == 3 : "c != 3";
        assert d == 5 : "d != 5";
        assert e == 1 : "e != 1";
    }

    public static int hIndex(int[] citations) {

        return 0;
    }
}
