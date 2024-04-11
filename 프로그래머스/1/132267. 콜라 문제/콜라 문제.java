class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int quotient = 0;
        int remainder = 0;
        
        while (n >= a) {
            quotient = n / a;
            remainder = n % a;
            n = quotient * b + remainder;
            answer += quotient * b;
        }
        
        return answer;
    }
}