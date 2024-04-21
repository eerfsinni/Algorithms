class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if (n == 1) {
            answer = new int[b + 1];
            for (int i=0; i<=b; i++) {
                answer[i] = num_list[i];
            }
        } else if (n == 2) {
            answer = new int[num_list.length - a];
            for (int i=0; i<num_list.length - a; i++) {
                answer[i] = num_list[a+i];
            }
        } else if (n == 3){
            answer = new int[b - a + 1];
            for (int i=0; i<b-a+1; i++) {
                answer[i] = num_list[a+i];
            }
        } else {
            answer = new int[(b-a)/2+1];
            int plus = 0;
            for (int i=0; i<(b-a)/2+1; i++) {
                answer[i] = num_list[i+a+plus];
                plus += (c-1);
            }
        }
        
        return answer;
    }
}