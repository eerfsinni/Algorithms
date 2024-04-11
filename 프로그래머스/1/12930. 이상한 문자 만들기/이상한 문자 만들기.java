class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = 0;
                sb.append(" ");
            } else {
                if (index % 2 == 0) {
                    sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                } else {
                    sb.append(String.valueOf(s.charAt(i)).toLowerCase());
                }
                index++;
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}