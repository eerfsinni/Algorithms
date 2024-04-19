class Solution {
    public int solution(String s) {
        int answer = 0;
        int lastNum = 0;
        
        String split[] = s.split(" ");
        for (int i=0; i<split.length; i++) {
            if (!split[i].equals("Z")) {
                answer += Integer.valueOf(split[i]);
                lastNum = Integer.valueOf(split[i]);
            } else {
                answer -= lastNum;
            }
        }   
        
        return answer;
    }
}