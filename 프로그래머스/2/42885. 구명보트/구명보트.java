import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        
        int left = 0;
        int right = people.length-1;
        
        while (true) {
            if (left > right) {
                break;
            }
            
            if (people[left] + people[right] <= limit) {
                answer++;
                left++;
            } else {
                answer++;
            }
            right--;
            
        }
        
        return answer;
    }
}