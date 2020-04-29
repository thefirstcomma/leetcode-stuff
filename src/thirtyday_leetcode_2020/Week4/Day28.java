package thirtyday_leetcode_2020.Week4;
import java.util.*;

public class Day28 {

    static class FirstUnique {

        ArrayList<Integer> valid;
        ArrayList<Integer> list;

        public FirstUnique(int[] nums) {
            valid = new ArrayList<>();
            list = new ArrayList<>();

            for(int i: nums) {
                list.add(i);
            }
        }

        public int showFirstUnique() {
            for(int i: valid) {
                return i;
            }
            return -1;
        }

        public void add(int value) {
            if(list.contains(value)) {
                for(int i = 0; i < valid.size(); i++) {
                    if(valid.get(i) == value) {
                        valid.remove(i);
                        break;
                    }
                }
            } else {
                valid.add(value);
            }
        }

        public void print() {
            System.out.println(valid.toString());
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5};
        FirstUnique obj = new FirstUnique(arr);
        System.out.println(obj.showFirstUnique());
        obj.add(5);
        System.out.println(obj.showFirstUnique());
        obj.add(2);
        System.out.println(obj.showFirstUnique());
        obj.add(3);
        System.out.println(obj.showFirstUnique());

        System.out.println("---------------------------------");

        int[] arr2 = {7,7,7,7,7,7};
        FirstUnique obj2 = new FirstUnique(arr2);
        obj2.print();
        System.out.println(obj2.showFirstUnique());
        obj2.add(7);
        obj2.print();
        obj2.add(3);
        obj2.print();
        obj2.add(3);
        obj2.print();
        obj2.add(7);
        obj2.print();
        obj2.add(1444);
        obj2.print();
        System.out.println(obj2.showFirstUnique());
    }
}
