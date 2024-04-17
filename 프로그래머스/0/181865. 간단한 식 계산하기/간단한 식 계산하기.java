class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String split[] = binomial.split(" ");
        if (split[1].equals("+")) {
            answer = Integer.valueOf(split[0]) + Integer.valueOf(split[2]);
        } else if (split[1].equals("-")) {
            answer = Integer.valueOf(split[0]) - Integer.valueOf(split[2]);
        } else {
            answer = Integer.valueOf(split[0]) * Integer.valueOf(split[2]);
        }
        
        
        return answer;
    }
}