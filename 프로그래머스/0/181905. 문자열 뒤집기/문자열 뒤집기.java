class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        
        for (int i=0; i<s; i++) {
            sb1.append(my_string.charAt(i));
        }
        for (int i=e; i>=s; i--) {
            sb2.append(my_string.charAt(i));
        }
        for (int i=e+1; i<my_string.length(); i++) {
            sb3.append(my_string.charAt(i));
        }
        
        answer = sb1.append(sb2).append(sb3).toString();
        return answer;
    }
}