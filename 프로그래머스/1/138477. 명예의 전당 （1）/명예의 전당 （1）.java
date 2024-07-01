import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> honors = new ArrayList<>();
        
        int min = 0;
        for (int i=0; i<score.length; i++) {
            
            if (honors.size() < k) {
                honors.add(score[i]);
                Collections.sort(honors);
                min = honors.get(0);
                answer[i] = min;
            } else {
                if (min < score[i]) {
                    honors.add(score[i]);
                    honors.remove(0);
                    Collections.sort(honors);
                    min = honors.get(0);
                    answer[i] = min;
                } else {
                    answer[i] = min;
                }
            }
        }
        
        return answer;
    }
}