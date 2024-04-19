class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        StringBuilder sb = new StringBuilder();
        int divisor = my_str.length() / n;
        int remainder = my_str.length() % n == 0 ? 0 : 1;
        answer = new String[divisor + remainder];
        
        int index = 0;
        for (int i=0; i<answer.length; i++) {
            if (i == answer.length-1) {
                for (int j=0; j<my_str.length()-index; j++) {
                    sb.append(my_str.charAt(index + j));
                }
            } else {
                for (int j=0; j<n; j++) {
                    sb.append(my_str.charAt(index + j));
                }
            }
            answer[i] = sb.toString();
            index += n;
            sb.setLength(0);
        }
        
        return answer;
    }
}