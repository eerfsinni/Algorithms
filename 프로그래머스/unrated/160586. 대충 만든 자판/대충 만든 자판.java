import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> letters = new HashMap<>();
        
        for(int i=0; i<keymap.length; i++) {
            
            for(int j=0; j<keymap[i].length(); j++) {
                
                if(letters.get(keymap[i].charAt(j))==null ||
                   letters.get(keymap[i].charAt(j))>j) {
                    letters.put(keymap[i].charAt(j), j+1);
                }
            }
            
        }
        
        for(int i=0; i<targets.length; i++) {
            answer[i] = 0;
            for(int j=0; j<targets[i].length(); j++) {
                if(letters.containsKey(targets[i].charAt(j))) {
                    answer[i] += letters.get(targets[i].charAt(j));
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}