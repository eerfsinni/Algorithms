import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> baguni = new Stack<>();
        
        int[][] game = board;
        for (int i=0; i<moves.length; i++) {
            int doll = 0;
            for (int j=0; j<board.length; j++) {
                if (game[j][moves[i]-1] != 0) {
                    doll = game[j][moves[i]-1];
                    game[j][moves[i]-1] = 0;
                    break;
                }
            }
            
            if (doll != 0) {
                if (!baguni.isEmpty()) {
                    if (baguni.peek() == doll) {
                        answer++;
                        baguni.pop();
                    } else {
                        baguni.push(doll);
                    }
                } else {
                    baguni.push(doll);
                }
            }
        }
  
        return answer*2;
    }
}