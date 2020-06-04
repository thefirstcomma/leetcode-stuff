package june_thirtyday_leetcode_2020;

// equiv to LeetCode344
public class Day4 {

    public static void main(String[] args) {
        char[] a = {'h','e','l','l','o'};
        reverseString(a);
        System.out.println(a[0] + ", " + a[1]);
    }

    public static void reverseString(char[] s) {
        if(s.length < 2) return;

        for(int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }
}
