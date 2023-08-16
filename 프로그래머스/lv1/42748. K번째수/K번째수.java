import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int order = commands[i][2];
            
            // 새로운 배열
            int newArr[] = new int[end-start+1];
            for(int j=0; j<newArr.length; j++) {
                newArr[j] = array[start+j-1];
            }
            
            // 정렬
            Arrays.sort(newArr);
            
            answer[i] = newArr[order-1];
        }
        
        
        return answer;
    }
}