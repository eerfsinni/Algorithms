class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char alphabets[] = new char[26];
        
        for (int i=0; i<s.length(); i++) {
            alphabets[s.charAt(i)-'a']++;
        }
        
        for (int i=0; i<alphabets.length; i++) {
            if (alphabets[i] == 1) {
                sb.append((char) ((int) 'a' + i));
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}