import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int startTwo = -1;
        int endTwo = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                startTwo = i;
                break;
            }
        }
        if (startTwo == -1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        for (int i=startTwo; i<arr.length; i++) {
            if (i != startTwo) {
                if (arr[i] == 2) {
                    endTwo = i;
                }
            }
        }
        
        endTwo = endTwo == -1 ? startTwo : endTwo;
        answer = new int[endTwo-startTwo+1];
        
        for (int i=0; i<endTwo-startTwo+1; i++) {
            answer[i] = arr[startTwo+i];
        }
        return answer;
    }
}