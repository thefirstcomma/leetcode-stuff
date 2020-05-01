package april_thirtyday_leetcode_2020.Week2;

public class Day14 {

    public static void main(String[] args) {
        String s1 = "abc";
        int[][] shift = {{0,1},{1,2}};
        String s2 = "abcdefg";
        int[][] shift2 = {{1,1}, {1,1}, {0,2}, {1,3}};

        System.out.println(stringShift(s1, shift));
        System.out.println(stringShift(s2, shift2));
    }
    public static String stringShift(String s, int[][] shift) {
        int finalShifts = 0;
        for(int i = 0; i < shift.length; i++) {
            if(shift[i][0] == 0) {
                finalShifts -= shift[i][1];
            } else {
                finalShifts += (shift[i][1]);
            }
        }

        StringBuilder sb = new StringBuilder(s);
        while(finalShifts != 0) {
            if(finalShifts < 0) {
                char a = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(a);
                finalShifts++;
            }
            else {
                char a = sb.charAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);
                sb.insert(0,a);
                finalShifts--;
            }
        }
        return sb.toString();
    }
}
