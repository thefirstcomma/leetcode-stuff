package ctci;
import java.util.*;

public class Chapter1 {

    // 1.1
    public static boolean isUnique(String str) {
        HashSet<Character> hset = new HashSet<>();
        for(int i = 0; i < str.length(); i++) {
            if(hset.contains(str.charAt(i))) {
                return false;
            }
            hset.add(str.charAt(i));
        }
        return true;
    }

    // 1.2
    public static boolean checkPermutation(String a, String b) {
        if(a.length() != b.length()) return false;
        HashMap<Character, Boolean> hmap = new HashMap<>();
        for(int i = 0; i < a.length(); i++) {
            hmap.put(a.charAt(i), false);
        }

        for(int i = 0; i < b.length(); i++) {
            if(hmap.containsKey(b.charAt(i))) {
                hmap.replace(b.charAt(i), true);
            }
        }
        if(hmap.containsValue(false))
            return false;

        return true;
    }

    // 1.3
    public static String urlify(String str, int trueLength) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < trueLength; i++) {
            if(str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            } else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }

    // 1.3 w/ in-place character array
    public static void urlify(char[] arr, int trueLength) {
        int whitespacecounter = 0;
        for(int i = 0; i < trueLength; i++) {
            if(arr[i] == ' ') {
                whitespacecounter++;
            }
        }
        int endingIndex = trueLength-1 + whitespacecounter*2;
        for(int i = trueLength-1; i >= 0; i--) {
            if(arr[i] != ' ') {
                arr[endingIndex] = arr[i];
                endingIndex--;
            } else {
                arr[endingIndex-2] = '%';
                arr[endingIndex-1] = '2';
                arr[endingIndex] = '0';
                endingIndex -= 3;
            }
        }
    }

    // 1.4
    public static boolean palindPermutation(String str) {
        return false;
    }

    public static void main(String[] args) {
        String one1 = "Mr John Smith    ";
        char[] chars = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' ',' '};

//        urlify(chars, 13);
//        System.out.println(Arrays.toString(chars));
//        System.out.println(urlify(one1, 13));

        String pali = "Tact Coa";
        System.out.println(palindPermutation(pali));
    }
}
