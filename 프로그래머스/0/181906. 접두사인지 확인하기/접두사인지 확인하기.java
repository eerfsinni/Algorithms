class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        
        if (my_string.contains(is_prefix)) {
            for (int i=0; i<is_prefix.length(); i++) {
                if (is_prefix.charAt(i) != my_string.charAt(i)) {
                    answer = 0;
                    break;
                }
            }
            
        } else {
            answer = 0;
        }
        
        return answer;
    }
}