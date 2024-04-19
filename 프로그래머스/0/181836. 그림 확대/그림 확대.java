class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        answer = new String[picture.length * k];
        
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i=0; i<answer.length; i+=k) {
            for (int j=0; j<picture[index].length(); j++) {
                for (int l=0; l<k; l++) {
                    sb.append(picture[index].charAt(j));
                }
            }
            for (int j=0; j<k; j++) {
                answer[i+j] = sb.toString();
            }
            sb.setLength(0);
            index++;
        }
        
        return answer;
    }
}