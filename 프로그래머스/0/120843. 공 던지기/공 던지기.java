class Solution {
    public int solution(int[] numbers, int k) {
        int passed = (k-1)*2;
        return passed % numbers.length + 1;
    }
}