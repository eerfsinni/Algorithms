class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<food.length; i++) {
            for (int j=0; j<food[i]/2; j++) {
                sb.append(i);
            }
        }
        String middle = sb.toString();
        sb.setLength(0);
        
        for (int i=0; i<middle.length(); i++) {
            sb.append(middle.charAt(i));
        }
        sb.append(0);
        for (int i=middle.length()-1; i>=0; i--) {
            sb.append(middle.charAt(i));
        }
        
        answer = sb.toString();
        return answer;
    }
}