class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int size = 0;
        for (int i=0; i<arr.length; i++) {
            size += arr[i];
        }
        
        answer = new int[size];
        int index = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i]; j++) {
                answer[index] = arr[i];
                index++;
            }
        }
        
        
        return answer;
    }
}