class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<s.length(); i++) {
            int target = 0;
            int sub = 0;
            
            if (s.charAt(i) == ' ') {
                sb.append(" ");
                
            } else if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                target = s.charAt(i) + n;
                if (target > 'Z') {
                    sub = target - 'Z' - 1;
                    target = 'A' + sub;
                }
                char c = (char) target;
                sb.append(c);
                
            } else {
                target = s.charAt(i) + n;
                if (target > 'z') {
                    sub = target - 'z' - 1;
                    target = 'a' + sub;
                }
                char c = (char) target;
                sb.append(c);
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}