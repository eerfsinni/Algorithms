import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        
        for (int i=0; i<my_string.length(); i++) {
            boolean find = false;
            for (int j=0; j<list.size(); j++) {
                if (String.valueOf(my_string.charAt(i)).equals(list.get(j))) {
                    find = true;
                }
            }
            
            if (!find) {
                sb.append(my_string.charAt(i));
                list.add(String.valueOf(my_string.charAt(i)));
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}