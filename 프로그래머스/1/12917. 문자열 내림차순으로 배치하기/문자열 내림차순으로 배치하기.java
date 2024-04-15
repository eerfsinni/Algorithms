import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int letter[] = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            letter[i] = s.charAt(i);
        }
        
        Integer[] reverseLetter = Arrays.stream(letter).boxed().toArray(Integer[]::new);
        Arrays.sort(reverseLetter, Collections.reverseOrder());
        
        for (int i=0; i<letter.length; i++) {
            sb.append((char) (int) reverseLetter[i]);
        }
        
        answer = sb.toString();
        return answer;
    }
}