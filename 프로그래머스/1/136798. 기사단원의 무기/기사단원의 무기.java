class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i=1; i<=number; i++) {
            int yaksoo = 0;
            
            for (int j=1; j*j<=i; j++) {
                if (j*j==i) {
                    yaksoo++;
                } else if (i%j==0) {
                    yaksoo+=2;
                }
            }
            
            if (yaksoo > limit) {
                yaksoo = power;
            }
            
            answer += yaksoo;
            yaksoo = 0;
        }
        
        return answer;
    }
}