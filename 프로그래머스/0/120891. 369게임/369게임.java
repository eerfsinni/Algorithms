class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderString = String.valueOf(order);
        String clap[] = {"3", "6", "9"};
        
        for (int i=0; i<clap.length; i++) {
            orderString = orderString.replace(clap[i], "c");
        }
        
        for (int i=0; i<orderString.length(); i++) {
            if (orderString.charAt(i) == 'c') {
                answer++;
            }
        }
        
        return answer;
    }
}