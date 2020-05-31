package leetcode;

public class LeetCode886 {

    public static void main(String[] args) {
        int[][] matrix = {{1,2},{1,3},{2,4}};
        int[][] m2 = {{1,2},{1,3},{2,3}};
        int[][] m3 = {{1,2},{2,3},{3,4},{4,5},{1,5}};
        int[][] m4 = {{4,7},{4,8},{5,6},{1,6},{3,7},{2,5},{5,8},{1,2},{4,9},{6,10},{8,10},{3,6},
                {2,10},{9,10},{3,9},{2,3},{1,9},{4,6},{5,7},{3,8},{1,8},{1,7},{2,4}};

        System.out.println(possibleBipartition(4, matrix));
        System.out.println(possibleBipartition(3, m2));
        System.out.println(possibleBipartition(5, m3));
        System.out.println(possibleBipartition(10, m4));
    }

    public static boolean possibleBipartition(int N, int[][] dislikes) {
        int[] arr = new int[N+1];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for(int i = 0; i < dislikes.length; i++) {
            int a = dislikes[i][0], b = dislikes[i][1];
            if(arr[a] == a && arr[b] == b) {
                arr[a] = b;
                arr[b] = a;
            } else if (arr[a] != a && arr[b] == b) {
                arr[b] = arr[arr[a]];
            } else if (arr[a] == a && arr[b] != b) {
                arr[a] = arr[arr[b]];
            } else if (arr[a] != a && arr[b] != b && arr[a] == arr[b]) {
                return false;
            }
        }
        return true;
    }
}
