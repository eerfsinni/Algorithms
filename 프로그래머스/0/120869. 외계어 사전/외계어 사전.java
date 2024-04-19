class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for (int i=0; i<dic.length; i++) {
            int count = 0;
            int sum = 0;
            if (dic[i].length() == spell.length) {
                for (int j=0; j<spell.length; j++) {
                    dic[i] = dic[i].replace(spell[j], String.valueOf(j));
                }
                for (int j=0; j<dic[i].length(); j++) {
                    sum += j;
                    count += Integer.valueOf(dic[i].charAt(j) - '0');
                }
                
                if (sum == count) {
                    return 1;
                }
            }
        }
        
        return 2;
    }
}