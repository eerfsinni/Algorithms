class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        int result = Integer.valueOf(sb.append(a).append(b).toString());
        
        if (result == 2*a*b) {
            answer = result;
        } else {
            answer = result > 2*a*b? result:2*a*b;
        }
        return answer;
    }
}