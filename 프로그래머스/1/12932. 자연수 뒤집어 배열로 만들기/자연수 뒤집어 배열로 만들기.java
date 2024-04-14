class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String numString = String.valueOf(n);
        int length = numString.length();
        answer = new int[numString.length()];
        
        for (int i=0; i<length; i++) {
            answer[i] = numString.charAt(length-1-i) - '0';
        }
        
        return answer;
    }
}