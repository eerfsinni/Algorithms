class Solution {
    public int solution(int n) {
        int answer = 1;
        
        int multiple = 1;
        while (multiple <= n) {
            multiple = 1;
            answer++;
            for (int i=1; i<=answer; i++) {
                multiple *= i;
            }
        }
        
        answer--;
        return answer;
    }
}