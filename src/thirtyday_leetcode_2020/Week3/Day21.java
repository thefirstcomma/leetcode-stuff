package thirtyday_leetcode_2020.Week3;
import java.util.*;

public class Day21 {
    //
    //    BinaryMatrix.get(x, y) returns the element of the matrix at index (x, y) (0-indexed).
    //    BinaryMatrix.dimensions() returns a list of 2 elements [n, m], which means the matrix is n * m.
    //

    public static class BinaryMatrix {
        int[][] matrix;
        List<Integer> mylist = new ArrayList<>();

        public BinaryMatrix(int x, int y) {
            matrix = new int[x][y];
        }

        public void set(int x, int y, int value) {
            matrix[x][y] = value;
        }

        public int get(int x, int y) {
            return matrix[x][y];
        }

        public void print() {
            for(int i = 0; i < matrix.length; i++) {
                System.out.println();
                for(int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public List<Integer> dimensions() {
            mylist.add(matrix.length);
            mylist.add(matrix[0].length);
            return mylist;
        }
    }

    public static void main(String[] args) {
        // created my own binaryMatrix class cuz I had to to run this program.
        BinaryMatrix bm = new BinaryMatrix(3,4);
        bm.set(0,3, 1);

        bm.set(1,2, 1);
        bm.set(1,3, 1);

        bm.set(2,1, 1);
        bm.set(2,2, 1);
        bm.set(2,3, 1);

        bm.print();
        System.out.println(leftMostColumnWithOne(bm));

        BinaryMatrix bm2 = new BinaryMatrix(5,5);
        bm2.set(0,0,1);
        bm2.set(0,1,1);
        bm2.set(0,2,1);
        bm2.set(0,3,1);
        bm2.set(0,4,1);

        bm2.set(1,3,1);
        bm2.set(1,4,1);

        bm2.set(2,3,1);
        bm2.set(2,4,1);
        bm2.set(2,2,1);

        bm2.set(3,4,1);
        bm2.print();
        System.out.println(leftMostColumnWithOne(bm2));

    }

    public static int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> a = binaryMatrix.dimensions();
        int record = Integer.MAX_VALUE;

        for(int i = 0; i < a.get(0); i++) {
            int temp = Integer.MAX_VALUE;
            int start = 0;
            int end = a.get(1)-1;
            if(binaryMatrix.get(i, end) != 1) continue;

            while (start <= end) {
                int middle = start + (end - start) / 2;

                if (binaryMatrix.get(i, middle) < 1) {
                    start = middle + 1;
                }
//                else if(binaryMatrix.get(i, middle) == 0) {
//                    end = middle - 1;
//                }
                else if(start != middle) {
                    end = middle;
                } else {
                    temp = middle;
                    break;
                }
            }
            record = Math.min(record, temp);
        }
        if(record == Integer.MAX_VALUE) return -1;
        return record;
    }

}
