import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<intStrs.length; i++) {
            for (int j=0; j<l; j++) {
                sb.append(intStrs[i].charAt(j + s));
            }
            if (Integer.valueOf(sb.toString()) > k) {
                list.add(Integer.valueOf(sb.toString()));
            }
            sb.setLength(0);
        }
        
        answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}