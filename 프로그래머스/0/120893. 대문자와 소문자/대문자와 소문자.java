class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<my_string.length(); i++) {
            sb.append(changeCapital(my_string.charAt(i)));
        }
        
        answer = sb.toString();
        return answer;
    }
    
    String changeCapital(char c) {
        
        if (c > 'Z') {
            return String.valueOf(c).toUpperCase();
        } else {
            return String.valueOf(c).toLowerCase();
        }
    }
}