class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[arr.length];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = arr[i];
        }
        
        for (int i=0; i<queries.length; i++) {
            for (int j=queries[i][0]; j<=queries[i][1]; j++) {
                answer[j]++;
            }
        }
        return answer;
    }
}