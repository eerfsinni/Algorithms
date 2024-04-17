class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        
        int length = names.length;
        int division = length / 5;
        int remainder = length % 5 == 0? 0 : 1;
        answer = new String[division + remainder];
        
        int index = 0;
        for (int i=0; i<answer.length; i++) {
            answer[i] = names[index];
            index += 5;
        }
        
        return answer;
    }
}