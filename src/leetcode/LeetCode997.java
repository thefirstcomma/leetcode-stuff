package leetcode;

public class LeetCode997 {

    public static void main(String[] args) {
        int[][] a = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        System.out.println(findJudge(4, a));

        int[][] b = {{1,3},{2,3}};
        System.out.println(findJudge(3,b));

        int[][] c = {{1,3},{1,4},{2,3},{2,4}};
        System.out.println(findJudge(4, c));
    }

    public static int findJudge(int N, int[][] trust) {
        int[] votes = new int[N];
        boolean[] voted = new boolean[N];

        for(int i = 0; i < trust.length; i++) {
            int citizen = trust[i][0]-1;
            int trustVote = trust[i][1]-1;

            voted[citizen] = true;
            votes[trustVote] += 1;
        }

        for(int i = 0; i < votes.length; i++) {
            if(votes[i] == N-1 && !voted[i]) {
                return i+1;
            }
        }
        return -1;
    }
}
