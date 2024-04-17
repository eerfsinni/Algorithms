class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        int division = num_list.length / n;
        int remainder = num_list.length % n > 0 ? 1 : 0;
        
        answer = new int[division + remainder];
        int index = 0;
        for (int i=0; i<answer.length; i++) {
            answer[i] = num_list[index];
            index += n;
        }
        
        return answer;
    }
}