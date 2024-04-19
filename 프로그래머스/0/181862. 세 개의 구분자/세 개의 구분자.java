import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String answer[] = {};
        String divisors[] = {"a", "b", "c"};
        List<String> list = new ArrayList<>();
        
        for (int i=0; i<divisors.length; i++) {
            myStr = myStr.replace(divisors[i], " ");
        }
        myStr = myStr.replace("  ", " ");
        String split[] = myStr.split(" ");

        for (int i=0; i<split.length; i++) {
            if (split[i].trim().length() != 0) {
                list.add(split[i]);
            }
        }
        
        if (list.size() == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
        } else {
            answer = new String[list.size()];
            for (int i=0; i<answer.length; i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}