class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String calls[] = {"aya", "ye", "woo", "ma"};
        for (int i=0; i<babbling.length; i++) {
            String example = babbling[i];
            boolean canBabble = true;
            
            for (int j=0; j<calls.length; j++) {
                example = example.replace(calls[j], String.valueOf(j));
            }
            
            char before = ' ';
            for (int j=0; j<example.length(); j++) {
                if (!isDigit(example.charAt(j))) {
                    canBabble = false;
                    break;
                } else {
                    if (before == ' ') {
                        before = example.charAt(j);
                    } else {
                        if (example.charAt(j) == before) {
                            canBabble = false;
                            break;
                        } else {
                            before = example.charAt(j);
                        }
                    }
                }
            }
            
            if (canBabble) {
                answer++;
            }
        }
        
        return answer;
    }
    
    boolean isDigit(char test) {
        int criteria = (int) test - '0';
        if (criteria<0 | criteria>9) {
            return false;
        } else {
            return true;
        }
    }
}