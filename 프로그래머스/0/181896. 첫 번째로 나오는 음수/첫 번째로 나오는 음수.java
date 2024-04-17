class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        
        int index = 0;
        for (int num : num_list) {
            if (num < 0) {
                answer = index;
                break;
            }
            index++;
        }
        return answer;
    }
}