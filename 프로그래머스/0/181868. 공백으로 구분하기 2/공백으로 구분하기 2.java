import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        my_string = my_string.replace("  ", " ");
        String split[] = my_string.split(" ");
        
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<split.length; i++) {
            if (!split[i].equals("")) {
                list.add(split[i]);
            }
        }
        
        answer = new String[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}