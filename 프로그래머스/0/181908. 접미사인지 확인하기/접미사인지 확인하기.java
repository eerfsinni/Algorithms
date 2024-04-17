class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 1;
        
        if (my_string.contains(is_suffix)) {
            for (int i=0; i<is_suffix.length(); i++) {
                if (is_suffix.charAt(is_suffix.length()-1-i) !=
                   my_string.charAt(my_string.length()-1-i)) {
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