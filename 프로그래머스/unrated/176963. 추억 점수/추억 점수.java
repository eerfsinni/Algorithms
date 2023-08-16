import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> score = new HashMap<>();
        
        for(int i=0; i<name.length; i++) {
            score.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++) {
            String pList[] = photo[i];
            int yScore = 0;
            for(int j=0; j<pList.length; j++) {
                if(score.containsKey(pList[j])) {
                    yScore += score.get(pList[j]);
                }
            }
            answer[i] = yScore;
        }
        
        return answer;
    }
}