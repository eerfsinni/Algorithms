class Solution {
    public int solution(int[] common) {
        int answer = common[0];
        
        if (common[2] - common[1] == common[1] - common[0]) {
            for (int i=0; i<common.length; i++) {
                answer += common[1] - common[0];
            }
        } else {
            for (int i=0; i<common.length; i++) {
                answer *= common[1] / common[0];
            }
        }
        
        return answer;
    }
}