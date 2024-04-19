class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String numString[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i=0; i<numString.length; i++) {
            numbers = numbers.replace(numString[i], String.valueOf(i));
        }
        
        answer = Long.parseLong(numbers);
        return answer;
    }
}