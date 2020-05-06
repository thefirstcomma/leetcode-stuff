package leetcode;

public class LeetCode275 {

    public static void main(String[] args) {
        System.out.println(hIndex(new int[] {}));
        System.out.println(hIndex(new int[] {1}));
        System.out.println(hIndex(new int[] {0,1,3,5,6}));
        System.out.println(hIndex(new int[] {0,1,2,3,4,5,5,5,5,11}));
        System.out.println(hIndex(new int[] {100}));
    }

    public static int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0;
        int result = 0;
        while(low < n) {
            int middle = (n-low)/2 + low;
            if(middle+1 <= citations[middle]) {
                result = middle+1;
                low = middle+1;
//            } else if (citations[middle] > middle+1) {
//                result = Math.max(result, middle+1);
//                low = middle+1;
            } else {
                n = middle - 1;
            }
        }
        return result;
    }
}
