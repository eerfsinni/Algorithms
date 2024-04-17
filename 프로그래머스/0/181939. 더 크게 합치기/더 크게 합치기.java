class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        int one = Integer.valueOf(sb1.append(a).append(b).toString());
        int two = Integer.valueOf(sb2.append(b).append(a).toString());

        if (one == two) {
            answer = one;
        } else {
            answer = one > two? one : two;
        }
        return answer;
    }
}