class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i++) {
            int count = 0;
            for (int j=1; j*j<=i; j++) {
                if (i%j == 0) {
                    if (j*j == i) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }
            
            if (count >=3) {
                answer++;
            }
        }
        
        return answer;
    }
}