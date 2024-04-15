class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        // 예외 케이스
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        answer = new int[arr.length-1];
        int min = arr[0];
        int minIndex = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        
        int exceptIndex = 0;
        for (int i=0; i<answer.length; i++) {
            if (i == minIndex) {
                exceptIndex++;
            }
            answer[i] = arr[exceptIndex];
            exceptIndex++;
        }
   
        return answer;
    }
}