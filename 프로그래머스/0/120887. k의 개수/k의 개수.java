class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int a=i; a<=j; a++) {
            String numString = String.valueOf(a);
            for (int b=0; b<numString.length(); b++) {
                if (String.valueOf(numString.charAt(b))
                    .equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}