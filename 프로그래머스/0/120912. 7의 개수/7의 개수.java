class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i=0; i<array.length; i++) {
            String test = String.valueOf(array[i]);
            for (int j=0; j<test.length(); j++) {
                if (test.charAt(j) == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}