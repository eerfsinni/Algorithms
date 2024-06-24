class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        
        int x = num_list.length / n;
        int y = n;
        answer = new int[x][y];
        int count = 0;
        
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                answer[i][j] = num_list[count++];
            }
        }
        
        return answer;
    }
}