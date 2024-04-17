class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i=1; i<numLog.length; i++) {
            int test = numLog[i] - numLog[i-1];
            if (test == 1) {
                sb.append("w");
            } else if (test == -1) {
                sb.append("s");
            } else if (test == 10) {
                sb.append("d");
            } else {
                sb.append("a");
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}