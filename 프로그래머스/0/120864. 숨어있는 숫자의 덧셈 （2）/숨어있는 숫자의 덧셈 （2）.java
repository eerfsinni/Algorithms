class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<my_string.length(); i++) {
            if (isNumber(my_string.charAt(i))) {
                sb.append(my_string.charAt(i)-'0');
            } else {
                if (sb.toString().length() != 0) {
                    answer += Integer.valueOf(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        
        if (sb.toString().length() != 0) {
            answer += Integer.valueOf(sb.toString());
        }
        return answer;
    }
    
    boolean isNumber(char c) {
        if (c-'0' >= 0 && c-'0' <=9) {
            return true;
        } else {
            return false;
        }
    }
}