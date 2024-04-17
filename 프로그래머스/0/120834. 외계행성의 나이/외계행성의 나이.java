class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String ageString = String.valueOf(age);
        
        for (int i=0; i<ageString.length(); i++) {
            sb.append((char) ((int) (ageString.charAt(i) - '0') + 'a'));
        }
        
        answer = sb.toString();
        return answer;
    }
}