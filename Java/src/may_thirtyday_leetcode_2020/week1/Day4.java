package may_thirtyday_leetcode_2020.week1;

// equivalent to Leetcode476 and Leetcode1009
public class Day4 {

    public static void main(String[] args) {
        System.out.println("-2147483647: " + findComplement(Integer.MIN_VALUE));
        System.out.println("0: " + findComplement(Integer.MAX_VALUE));
        System.out.println("0: " + findComplement(15));
        System.out.println("127: " + findComplement(128));
    }

    // logic: Num XOR'ed with 1...111 will flip all the bits.
    public static int findComplement(int num) {
        int size = Integer.toBinaryString(num).length();
        int allOnes = ((1 << size) -1);
        return num ^ allOnes;
    }

    public static int alt1(int num) {
        String f = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < f.length(); i++) {
            if(f.charAt(i) == '0') {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }

        return Integer.parseInt(sb.toString(),2);
    }

}
