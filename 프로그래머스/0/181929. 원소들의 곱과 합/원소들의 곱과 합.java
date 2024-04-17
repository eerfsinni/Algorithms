class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        
        for (int i=0; i<num_list.length; i++) {
            answer += num_list[i];
            multiple *= num_list[i];
        }
        
        answer = answer * answer > multiple ? 1 : 0;
        return answer;
    }
}