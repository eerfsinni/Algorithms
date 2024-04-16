class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double numOne = (double) num1;
        double numTwo = (double) num2;
        
        answer = (int) (numOne/numTwo * 1000);
        return answer;
    }
}