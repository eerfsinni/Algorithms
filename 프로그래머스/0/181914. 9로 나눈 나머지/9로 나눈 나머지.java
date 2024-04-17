class Solution {
    public int solution(String number) {
        int answer = 0;
        String numString = String.valueOf(number);
        
        for (int i=0; i<numString.length(); i++) {
            answer += numString.charAt(i) - '0';
        }
        
        answer %= 9;
        return answer;
    }
}