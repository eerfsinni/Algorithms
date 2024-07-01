import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int min = 0;
        int max = 0;
        
        for (int i=0; i<lottos.length; i++) {
            if (lottos[i] == 0) {
                max++;
            }
        }
        
        for (int i=0; i<lottos.length; i++) {
            for (int j=0; j<win_nums.length; j++) {
                if (lottos[i] == 0) {
                    continue;
                } else {
                    if (lottos[i] == win_nums[j]) {
                        min++;
                        max++;
                    }
                }
            }
        }
        
        max = max < 2 ? 1 : max;
        min = min < 2 ? 1 : min;
        int[] answer = new int[] {7-max, 7-min};
        return answer;
    }
}