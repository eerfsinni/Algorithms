class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        
        int size = 0;
        for (int i=0; i<finished.length; i++) {
            if (!finished[i]) {
                size++;
            }
        }
        
        int index = 0;
        answer = new String[size];
        for (int i=0; i<todo_list.length; i++) {
            if (!finished[i]) {
                answer[index] = todo_list[i];
                index++;
            }
        }
        
        return answer;
    }
}