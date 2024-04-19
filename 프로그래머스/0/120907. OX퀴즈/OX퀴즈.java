class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++) {
            String test = quiz[i];
            String split[] = test.split(" ");
            
            if (split[1].equals("+")) {
                answer[i] = Integer.valueOf(split[0]) + Integer.valueOf(split[2])
                    == Integer.valueOf(split[4]) ? "O" : "X";
            } else {
                answer[i] = Integer.valueOf(split[0]) - Integer.valueOf(split[2])
                    == Integer.valueOf(split[4]) ? "O" : "X";
            }
        }
        
        return answer;
    }
}