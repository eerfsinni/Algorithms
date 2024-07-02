import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, List<String>> user = new HashMap<>();  // 유저 신고 내역
        Map<String, Integer> blackList = new HashMap<>();  // 신고 Count
        
        for (String id : id_list) {
            user.put(id, new ArrayList<String>());
        }
        
        for (int i=0; i<report.length; i++) {
            String[] info = report[i].split(" ");
            
            // 중복 유저 신고 내역 조회
            List<String> reportedList = user.get(info[0]);
            if (!reportedList.contains(info[1])) {
                reportedList.add(info[1]);
                user.put(info[0], reportedList);
                blackList.put(info[1], blackList.getOrDefault(info[1], 0) + 1);
            }
        }
        
        // 최종 신고 명단
        List<String> finalList = new ArrayList<>();
        for (String id : blackList.keySet()) {
            if (blackList.get(id) >= k) {
                finalList.add(id);
            }
        }
        
        // 메일 통보
        for (int i=0; i<answer.length; i++) {
            int count = 0;
            List<String> reportedList = user.get(id_list[i]);
            for (int j=0; j<finalList.size(); j++) {
                if (reportedList.contains(finalList.get(j))) {
                    count++;
                }
            }
            answer[i] = count;
        }
        
        return answer;
    }
}