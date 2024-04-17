import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i) - '0' >= 0 && my_string.charAt(i) - '0' <= 9) {
                list.add(Integer.valueOf(my_string.charAt(i)-'0'));
            }
        }

        answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}