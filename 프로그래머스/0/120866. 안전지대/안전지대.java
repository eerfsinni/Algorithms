class Solution {
    
    public int solution(int[][] board) {

        char d = 'd'; // dangerous
        char b = 'b'; // bomb
        
        char[][] area = new char[board.length][board.length];
        
        int answer = 0;
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (board[i][j] == 1) {
                    area[i][j] = 'b';
                    bombArea(new int[]{i, j}, area, board);
                }
            }
        }
        
        for (int i=0; i<area.length; i++) {
            for (int j=0; j<area.length; j++) {
                if (area[i][j] != 'b' && area[i][j] != 'd') {
                    answer++;
                }
            }
        }
        return answer;
    }
    
    void bombArea(int[] bomb, char[][] area, int[][] board) {
        int curX = bomb[0];
        int curY = bomb[1];

        int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i=0; i<dx.length; i++) {
            if (curX + dx[i] < 0 || curX + dx[i] >= board.length ||
               curY + dy[i] < 0 || curY + dy[i] >= board.length) {
                continue;
            }
            if (area[curX + dx[i]][curY + dy[i]] != 'b') {
                area[curX + dx[i]][curY + dy[i]] = 'd';
            }
        }
    }
    
}