import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<a.length(); i++) {
            sb.append(changeLetter(a.charAt(i)));
        }
        
        System.out.println(sb.toString());
    }
    
    static String changeLetter(char c) {
        if (c > 'Z') {
            return String.valueOf(c).toUpperCase();
        } else {
            return String.valueOf(c).toLowerCase();
        }
    }
}