import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String answer[] = {};
        String split[] = myString.split("x");
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<split.length; i++) {
            if(!split[i].isEmpty()) {
                list.add(split[i]);
            }
        }
        
        answer = new String[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}