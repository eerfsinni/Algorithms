import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
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