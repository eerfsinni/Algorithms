class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<code.length(); i+=q) {
            if (i+r < code.length()) {
                sb.append(code.charAt(i+r));
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}