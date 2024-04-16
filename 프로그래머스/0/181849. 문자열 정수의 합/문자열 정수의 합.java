class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String numString = String.valueOf(num_str);
        for (int i=0; i<numString.length(); i++) {
            answer += numString.charAt(i) - '0';
        }
        
        return answer;
    }
}