class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numString = String.valueOf(num);
        String kString = String.valueOf(k);
        
        for (int i=0; i<numString.length(); i++) {
            if (numString.charAt(i) == kString.charAt(0)) {
                answer = i+1;
                return answer;
            }
        }
        return answer;
    }
}