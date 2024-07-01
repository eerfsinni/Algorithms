class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[] phoneX = new int[] {3, 0, 0, 0, 1, 1, 1, 2, 2, 2, 3};
        int[] phoneY = new int[] {1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0};
        
        int[] left = new int[] {3, 0};
        int[] right = new int[] {3, 2};
        
        for (int i=0; i<numbers.length; i++) {
            int target = numbers[i];
            if (target == 1 || target == 4 || target == 7) {
                left[0] = phoneX[target];
                left[1] = phoneY[target];
                answer += "L";
            } else if (target == 3 || target == 6 || target == 9) {
                right[0] = phoneX[target];
                right[1] = phoneY[target];
                answer += "R";
            } else {
                int leftAbs = Math.abs(left[0] - phoneX[target]) + Math.abs(left[1] - phoneY[target]);
                int rightAbs = Math.abs(right[0] - phoneX[target]) + Math.abs(right[1] - phoneY[target]);
                if (leftAbs == rightAbs) {
                    if (hand.equals("left")) {
                        left[0] = phoneX[target];
                        left[1] = phoneY[target];
                        answer += "L";
                    } else {
                        right[0] = phoneX[target];
                        right[1] = phoneY[target];
                        answer += "R";
                    }
                } else {
                    if (leftAbs < rightAbs) {
                        left[0] = phoneX[target];
                        left[1] = phoneY[target];
                        answer += "L";
                    } else {
                        right[0] = phoneX[target];
                        right[1] = phoneY[target];
                        answer += "R";
                    }
                }
            }
        }
        
        return answer;
    }
}