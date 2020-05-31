package may_thirtyday_leetcode_2020.week2;

// equivalent to Leetcode402
public class Day13 {

    public static void main(String[] args) {
        System.out.println(removeKdigits("1111111", 3));
        System.out.println(removeKdigits("1234567890", 9));
        System.out.println(removeKdigits("1797", 1));
        System.out.println(removeKdigits("100200", 1));
        System.out.println(removeKdigits("1777", 2));
        System.out.println(removeKdigits("10", 1));
    }

    public static String removeKdigits(String num, int k) {
        for (int i = 0; i < num.length() - 1 && k > 0; i++) {
            if (i >= 0 && num.charAt(i) > num.charAt(i+1)) {
                num = num.substring(0, i) + num.substring(i+1);
                i -= 2;
                k--;
            }
        }

        while(!num.isEmpty() && num.charAt(0) == '0'){
            num = num.substring(1);
        }
        if(num.length() - k > 0) {
            return num.substring(0, num.length() - k);
        }
        return "0";
    }
}
