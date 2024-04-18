class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String calls[] = {"aya", "ye", "woo", "ma"};
        
        for (int i=0; i<babbling.length; i++) {
            for (int j=0; j<calls.length; j++) {
                babbling[i] = babbling[i].replace(calls[j], " ");
            }
        }
        
        for (int i=0; i<babbling.length; i++) {
            if (babbling[i].trim().length()==0) {
                answer++;
            }
        }
        return answer;
    }
}