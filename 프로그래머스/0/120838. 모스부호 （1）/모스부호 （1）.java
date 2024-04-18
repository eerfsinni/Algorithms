class Solution {
    public String solution(String letter) {
        String answer = "";
        String morse[] = {".-", "-...", "-.-.", "-..", ".",
                          "..-.", "--.", "....", "..", ".---",
                          "-.-", ".-..", "--", "-.", "---",
                          ".--.", "--.-", ".-.", "...", "-",
                          "..-", "...-", ".--", "-..-", "-.--",
                          "--.."};
        
        StringBuilder sb = new StringBuilder();
        String split[] = letter.split(" ");
        for (int i=0; i<split.length; i++) {
            for (int j=0; j<morse.length; j++) {
                if (split[i].equals(morse[j])) {
                    sb.append((char) (j + 'a'));
                }
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}