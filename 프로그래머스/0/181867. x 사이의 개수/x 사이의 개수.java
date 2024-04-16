class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        
        String[] split = myString.split("x", -1);
        answer = new int[split.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = split[i].length();
        }

        return answer;
    }
}