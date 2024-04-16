class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        my_string = my_string.replace("  ", " ");
        answer = my_string.split(" ");
        
        return answer;
    }
}