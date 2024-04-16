class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i) == 'a') {
                sb.append('A');
            } else {
                if (isCapitalAndNotA(myString.charAt(i))) {
                    sb.append(String.valueOf(myString.charAt(i)).toLowerCase());
                } else {
                    sb.append(myString.charAt(i));
                }
            }
        }
        
        answer = sb.toString();
        return answer;
    }
    
    boolean isCapitalAndNotA(char c) {
        if (c < 'a' && c > 'A' && c != ' ') {
            return true;
        } else {
            return false;
        }
    }
}