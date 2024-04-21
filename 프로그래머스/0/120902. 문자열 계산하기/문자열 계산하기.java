class Solution {
    public int solution(String my_string) {
        String split[] = my_string.split(" ");
        int answer = Integer.valueOf(split[0]);
        
        for (int i=0; i<split.length; i++) {
            if (split[i].equals("+")) {
                answer += Integer.valueOf(split[i+1]);
            } else if (split[i].equals("-")) {
                answer -= Integer.valueOf(split[i+1]);
            }
        }
        
        return answer;
    }
}