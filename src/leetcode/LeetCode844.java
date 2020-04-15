package leetcode;

public class LeetCode844 {

    public static void main(String[] args) {
        String a = "ab#c";
        String b = "ad#c";
        String a2 = "a#c";
        String b2 = "#a#c";
        System.out.println(backspaceCompare(a, b));
        System.out.println(backspaceCompare(a2, b2));
    }

    public static boolean backspaceCompare(String S, String T) {
        int skipS = 0, skipT = 0;
        int i = S.length()-1, j = T.length()-1;

        while(i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    skipS++;
                    i--;
                }
                else if (skipS > 0) {
                    skipS--;
                    i--;
                }
                else break;
            }
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    skipT++;
                    j--;
                }
                else if (skipT > 0) {
                    skipT--;
                    j--;
                }
                else break;
            }
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            if ((i >= 0) != (j >= 0))
                return false;
            i--;
            j--;
        }
        return true;
    }

    public static boolean alt1(String S, String T) {
        StringBuilder ss = new StringBuilder();
        StringBuilder tt = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '#') {
                if(ss.length() != 0)
                    ss.deleteCharAt(ss.length()-1);
            } else {
                ss.append(S.charAt(i));
            }
        }

        for(int i = 0; i < T.length(); i++) {
            if(T.charAt(i) == '#') {
                if(tt.length() != 0)
                    tt.deleteCharAt(tt.length()-1);
            } else {
                tt.append(T.charAt(i));
            }
        }

        return ss.toString().equals(tt.toString());
    }
}
