class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int afAlphabet[] = new int[26];
        int bfAlphabet[] = new int[26];
        
        
        for (int i=0; i<before.length(); i++) {
            afAlphabet[after.charAt(i) - 'a']++;
            bfAlphabet[before.charAt(i) - 'a']++;
        }
        
        for (int i=0; i<afAlphabet.length; i++) {
            if (afAlphabet[i] != bfAlphabet[i]) {
                answer = 0;
                return answer;
            }
        }
        
        return answer;
    }
}