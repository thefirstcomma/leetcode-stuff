package leetcode;

public class LeetCode678 {

    public static void main(String[] args) {
        String a = "(*))";
        String b = "(*)";
        String c = "(()";
        String d = "(())(())";
        String e = "())(()";
        String f = "(((******))";

        System.out.println("true " + checkValidString(a));
        System.out.println("true " + checkValidString(b));
        System.out.println("false " + checkValidString(c));
        System.out.println("true " + checkValidString(d));
        System.out.println("false " + checkValidString(e));
        System.out.println("true " + checkValidString(f));
    }

    public static boolean checkValidString(String s) {
        int low = 0, high = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                low++;
                high++;
            } else if(s.charAt(i) == ')'){
                high--;
                low--;
            } else {
                low--;
                high++;
            }
            if(high < 0)
                return false;
            if(low < 0)
                low = 0;
        }
        return low == 0;
    }
}
