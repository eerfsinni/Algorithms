import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        
        int i = 2;
        while (n > 1) {
            if (n%i == 0) {
                set.add(i);
                n /= i;
                i = 2;
            } else {
                i++;
            }
        }
        
        answer = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        int index = 0;
        while (it.hasNext()) {
            answer[index] = it.next();
            index++;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}