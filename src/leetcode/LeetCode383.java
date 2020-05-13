package leetcode;

public class LeetCode383 {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
        System.out.println(canConstruct("alsodifemna", "awerwlweresaoazaafdfwerfqfiqfwefwemrwqa"));

    }

    public static boolean canConstruct(String ransom, String magazine) {
        int[] alphabet = new int[26];

        for(int i = 0; i < magazine.length(); i++) {
            alphabet[magazine.charAt(i) - 'a'] += 1;
        }

        for(int i = 0; i < ransom.length(); i++) {
            alphabet[ransom.charAt(i) - 'a'] -= 1;
            if(alphabet[ransom.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;
    }

    public static boolean quadraticSolution(String ransomNote, String magazine) {
        boolean[] arr = new boolean[magazine.length()];

        for(int i = 0; i < ransomNote.length(); i++) {
            boolean found = false;
            for(int j = 0; j < magazine.length(); j++) {
                if(!arr[j] && ransomNote.charAt(i) == magazine.charAt(j)) {
                    found = true;
                    arr[j] = true;
                    break;
                }
            }
            if(!found) {
                return false;
            }
        }
        return true;

    }
}
