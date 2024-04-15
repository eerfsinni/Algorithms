import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int letter[] = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            letter[i] = s.charAt(i);
        }
        
        Arrays.sort(letter);
        
        for (int i=letter.length-1; i>=0; i--) {
            sb.append((char) letter[i]);
        }
        
        answer = sb.toString();
        return answer;
    }
}