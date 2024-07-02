class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] password = new int[n][n];
        
        for (int i=0; i<arr1.length; i++) {
            String passOne = Integer.toBinaryString(arr1[i]);
            String passTwo = Integer.toBinaryString(arr2[i]);
            
            passOne = ("0".repeat(n-passOne.length()) + passOne);
            passTwo = ("0".repeat(n-passTwo.length()) + passTwo);
            
            for (int j=0; j<passOne.length(); j++) {
                password[i][j] = Integer.parseInt(passOne.charAt(j)+"") + Integer.parseInt(passTwo.charAt(j)+"");
            }
        }
        
        for (int i=0; i<password.length; i++) {
            String line = "";
            for (int j=0; j<password[i].length; j++) {
                if (password[i][j] >= 1) {
                    line += "#";
                } else {
                    line += " ";
                }
            }
            answer[i] = line;
        }
        
        return answer;
    }
}