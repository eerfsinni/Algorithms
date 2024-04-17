class Solution {
    public String solution(String n_str) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int startIndex = 0;
        for (int i=0; i<n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                startIndex = i;
                break;
            }
        }
        
        for (int i=startIndex; i<n_str.length(); i++) {
            sb.append(n_str.charAt(i));
        }
        
        answer = sb.toString();
        return answer;
    }
}