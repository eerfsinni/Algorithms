class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == 'P' | s.charAt(i) == 'p') {
                countP++;
            } else if (s.charAt(i) == 'Y' | s.charAt(i) == 'y') {
                countY++;
            }
        }
        answer = countP == countY? true:false;

        return answer;
    }
}