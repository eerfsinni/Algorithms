class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String sign = "plus";
        if (s.charAt(0) == '-') {
            sign = "minus";
        }
        
        for (int i=0; i<s.length(); i++) {
            int targetNum = s.charAt(i) - '0';
            if (targetNum >=0) {
                answer += (int) (targetNum * Math.pow(10, s.length() - i - 1));
            }
        }
        
        if (sign.equals("minus")) {
            answer *= -1;
        }
        
        return answer;
    }
}