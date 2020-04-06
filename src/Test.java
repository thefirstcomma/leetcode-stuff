import java.util.*;

public class Test {

    public static void main(String[] args) {
        int x = 123;
        List<List<String>> la = tester();

        for(int i = 0; i < la.size(); i++) {
            for(int j = 0; j < la.get(i).size(); j++) {

            }
        }

    }

    public static List<List<String>> tester() {
        List<List<String>> la = new ArrayList<List<String>>();
        la.add(Arrays.asList("2", "1"));
        String value = "3";
        boolean exists = false;

        for(int i = 0; i < la.size(); i++) {
            if(la.get(i).contains(value)) {
                exists = true;
                break;
            }
        }

        if(!exists) {
            List<String> temp = Arrays.asList(value);
            la.add(temp);
            exists = false;
        }

        return la;
    }

}
