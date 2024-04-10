class Solution {
    public String solution(String new_id) {
        String answer = "";
        int len = new_id.length();
        
        StringBuilder sb = new StringBuilder();
        
        // Step 1. 대문자를 소문자로 치환 65, 97
        new_id = new_id.toLowerCase();
        
        // Step 2. 특수문자 제거
        for (int i=0; i<len; i++) {
            char c = new_id.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            } else {
                sb.append("");
            }
        }
        new_id = sb.toString();
        sb.setLength(0);
        
        // Step 3. ...를 .로
        new_id = new_id.replace("..", ".");
        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }
        
        // Step 4. 첫, 마지막 .제거
        if (new_id.length() > 0) {
            if (new_id.charAt(0) == '.') {
                new_id = new_id.substring(1, new_id.length());
            }
        }
        if (new_id.length() > 0) {
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length()-1);
            }
        }
        
        // Step 5. 빈 문자열이면 a
        if (new_id.length() == 0) {
            new_id = "a";
        }
        
        // Step 6. 16자 이상이면
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, 14);
            }
        }
        
        // Step 7. 2자 이하라면
        if (new_id.length() <= 2) {
            String last = new_id.charAt(new_id.length()-1) + "";
            while (new_id.length() < 3) {
                new_id += last;
            }
        }
        
        answer = new_id;        
        return answer;
    }
}