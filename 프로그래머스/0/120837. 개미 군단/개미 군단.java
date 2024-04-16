class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int division = hp / 5;
        int remainder = hp % 5;
        answer += division;
        
        if (remainder != 0) {
            division = remainder / 3;
            remainder = remainder % 3;
            answer += division;
            
            if (remainder != 0) {
                answer += remainder;
            }
        }
        
        return answer;
    }
}