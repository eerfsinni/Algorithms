class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        answer = new int[arr.length];
        
        if (answer.length % 2 == 0) {
            for (int i=0; i<answer.length; i++) {
                if (i%2 == 1) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        } else {
            for (int i=0; i<answer.length; i++) {
                if (i%2 == 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        
        return answer;
    }
}