class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<my_string.length(); i++) {
            boolean isTarget = false;
            for (int j=0; j<indices.length; j++) {
                if (i == indices[j]) {
                    isTarget = true;
                }
            }
            if (!isTarget) {
                sb.append(my_string.charAt(i));
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}