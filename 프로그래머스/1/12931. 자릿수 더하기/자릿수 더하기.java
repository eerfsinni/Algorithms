import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String numString = String.valueOf(n);
        for (int i=0; i<numString.length(); i++) {
            answer += numString.charAt(i) - '0';
        }

        return answer;
    }
}