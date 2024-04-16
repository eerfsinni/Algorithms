class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (int i=0; i<my_string.length(); i++) {
            answer += isDigit(my_string.charAt(i));
        }
        
        return answer;
    }
    
    int isDigit(char c) {
        int test = (int) c - '0';
        if (test >=1 && test <= 9) {
            return test;
        } else {
            return 0;
        }
    }
}