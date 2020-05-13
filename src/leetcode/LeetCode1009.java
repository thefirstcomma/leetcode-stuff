package leetcode;

public class LeetCode1009 {

    public static void main(String[] args) {
        System.out.println("-2147483647: " + bitwiseComplement(Integer.MIN_VALUE));
        System.out.println("0: " + bitwiseComplement(Integer.MAX_VALUE));
        System.out.println("0: " + bitwiseComplement(15));
        System.out.println("127: " + bitwiseComplement(128));
    }

    // logic: Num XOR'ed with 1...111 will flip all the bits.
    public static int bitwiseComplement(int num) {
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
