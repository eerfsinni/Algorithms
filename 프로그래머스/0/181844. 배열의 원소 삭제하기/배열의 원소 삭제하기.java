import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            boolean isDeleted = false;
            for (int j=0; j<delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    isDeleted = true;
                    break;
                }
            }
            if (!isDeleted) {
                list.add(arr[i]);
            }
        }
        
        answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}