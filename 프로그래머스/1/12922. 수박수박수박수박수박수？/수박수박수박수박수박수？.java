class Solution {
    public String solution(int n) {
        String answer = "";
        String full = "수박";
        String half = "수";
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < n/2; i++) {
            sb.append(full);
        }
        
        if (n%2 == 1) {
            sb.append(half);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}