package leetcode;

public class LeetCode9 {

    public static boolean isPalindrome(int x) {
        String parsed = Integer.toString(x);
        for(int i = 0; i < parsed.length()/2; i++) {
           if(parsed.charAt(i) != parsed.charAt(parsed.length()-i-1)) {
               return false;
           }
        }
        return true;
    }

    public static boolean isPalindrome(int x, boolean stats) {
        int reverted = 0;

        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        while(x > reverted) {
            reverted = reverted*10 + x%10;
            x = x/10;
        }
        return x == reverted || x == reverted/10;
    }

    public static void main(String[] args) {
        int a = 1331;
        int b = 10;
        int c = 13331;

        System.out.println(isPalindrome(a, true));
        System.out.println(isPalindrome(b, true));
        System.out.println(isPalindrome(c, true));
    }
}
