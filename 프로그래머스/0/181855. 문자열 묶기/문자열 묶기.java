class Solution {
    public int solution(String[] strArr) {
        int lengths[] = new int[31];
        
        for (int i=0; i<strArr.length; i++) {
            lengths[strArr[i].length()]++;
        }
        
        int max = 0;
        for (int i=1; i<lengths.length; i++) {
            if (lengths[i] > max) {
                max = lengths[i];
            }
        }
        
        return max;
    }
}