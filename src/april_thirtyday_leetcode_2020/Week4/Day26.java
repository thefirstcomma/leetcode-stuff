package april_thirtyday_leetcode_2020.Week4;

// equivalent to Leetcode1143
public class Day26 {

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde", "ace"));
        System.out.println(longestCommonSubsequence("fwa", "ace"));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] cache = new int[text1.length()+1][text2.length()+1];
        char[] a = text1.toCharArray();
        char[] b = text2.toCharArray();

        for(int i = 1; i < a.length+1; i++) {
            for(int j = 1; j < b.length+1; j++) {
                if (a[i-1] == b[j-1]) {
                    cache[i][j] = cache[i-1][j-1] + 1;
                } else {
                    cache[i][j] = Math.max(cache[i-1][j], cache[i][j-1]);
                }
            }
        }
        return cache[text1.length()][text2.length()];
    }
}
