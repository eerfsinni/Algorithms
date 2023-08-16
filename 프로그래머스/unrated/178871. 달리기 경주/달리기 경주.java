import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        String answer[] = new String[players.length];
        
        // 배열 크기가 커지면, 시간복잡도 최악
        Map<String, Integer> pMap = new HashMap<>();
        Map<Integer, String> rMap = new HashMap<>();
        
        // 주자와 등수를 입력하는 HashMap
        for(int i=0; i<players.length; i++) {
            pMap.put(players[i], i);
            rMap.put(i, players[i]);
        }
        
        // 주자 호출에 따른 등수 변환
        for(int i=0; i<callings.length; i++) {
            
            // 호출된 주자의 등수
            int rNow = pMap.get(callings[i]);
            
            // 등수보다 하나 앞에 있는 사람과 교환
            String front = rMap.get(rNow-1);
            
            // 주자 교환
            pMap.put(callings[i], rNow-1);
            pMap.put(front, rNow);
            
            // 등수 교환
            rMap.put(rNow-1, callings[i]);
            rMap.put(rNow, front);
        }
        
        for(int i=0; i<players.length; i++) {
            answer[i] = rMap.get(i);
        }
        
        return answer;
    }
}