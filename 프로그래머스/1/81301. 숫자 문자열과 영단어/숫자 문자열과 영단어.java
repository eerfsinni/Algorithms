class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if (isDigit(c)) {
                sb.append(c);
            } else {
                // zero : 0
                if (c == 'z') {
                    sb.append('0');
                    i += 3;
                
                // one : 1
                } else if (c == 'o') {
                    sb.append('1');
                    i += 2;
                    
                // t : two(2), three(3)
                } else if (c == 't') {
                    if (s.charAt(i+1) == 'w') {
                        sb.append('2');
                        i += 2;
                    } else {
                        sb.append('3');
                        i += 4;
                    }
                    
                // f : four(4), five(5)
                } else if (c == 'f') {
                    if (s.charAt(i+1) == 'o') {
                        sb.append('4');
                        i += 3;
                    } else {
                        sb.append('5');
                        i += 3;
                    }
                    
                // s : six(6), seven(7)
                } else if (c == 's') {
                    if (s.charAt(i+1) == 'i') {
                        sb.append('6');
                        i += 2;
                    } else {
                        sb.append('7');
                        i += 4;
                    }
                    
                // e : eight(8)
                } else if (c == 'e') {
                    sb.append('8');
                    i += 4;
                } else {
                    sb.append('9');
                    i += 3;
                }
            }
        }
        
        answer = Integer.valueOf(sb.toString());
        
        return answer;
    }
    
    boolean isDigit(char test) {
        int criteria = (int) test - '0';
        if (criteria < 0 | criteria > 9) {
            return false;
        } else {
            return true;
        }
    }
    
}