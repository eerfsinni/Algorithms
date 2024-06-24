class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] x = new int[201];
        for (int i=0; i<lines.length; i++) {
            for (int j=lines[i][1]; j > lines[i][0]; j--) {
                x[j+100]++;
            }
        }
        
        for (int value : x) {
            if (value >= 2) answer++;
        }
        return answer;
    }
}