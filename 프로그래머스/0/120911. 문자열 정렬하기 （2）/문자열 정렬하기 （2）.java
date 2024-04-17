import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        answer = my_string.toLowerCase();
        char charArray[] = answer.toCharArray();
        Arrays.sort(charArray);
        
        for (int i=0; i<charArray.length; i++) {
            sb.append(charArray[i]);
        }
        
        answer = sb.toString();
        return answer;
    }
}