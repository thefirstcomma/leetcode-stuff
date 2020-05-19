import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = slidingWindowTemplate("bdfwacacbsfe", "abc");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }

    public static List<Integer> slidingWindowTemplate(String s, String t) {
        //init a collection or int value to save the result according the question.
        List<Integer> list = new LinkedList<>();
        if(t.length()> s.length()) return list;

        //create a hashmap to save the Characters of the target substring.
        //(K, V) = (Character, Frequency of the Characters)
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //maintain a counter to check whether match the target string.
        //must be the map size, NOT the string size because the char may be duplicate.
        int counter = map.size();
        int begin = 0, end = 0;

        //the length of the substring which match the target string.
        int length = Integer.MAX_VALUE;
        int head = 0;

        //loop at the beginning of the source string
        while(end < s.length()) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                map.put(c, map.get(c)-1); // plus or minus one
                if(map.get(c) == 0) {
                    //modify the counter according the requirement(different condition).
                    counter--;
                }
            }
            System.out.println(map.toString());
            end++;

            //increase begin pointer to make it invalid/valid again
            /* counter condition. different question may have different condition */
            while(counter == 0) {
                System.out.println("lmfao");
                // *** be careful here: choose the char at begin pointer, NOT the end pointer
                char ch = s.charAt(begin);
                if(map.containsKey(ch)) {
                    map.put(ch,map.get(ch) + 1); // plus or minus one
                    if(map.get(ch) > 0) {
                        counter++; //modify the counter according the requirement(different condition).
                    }
                }

                /* save / update(min/max) the result if find a target*/
                // result collections or result int value
                if(end - begin == t.length()) {
                    list.add(begin);
                }
                begin++;
            }
        }

        return list;
    }

}
