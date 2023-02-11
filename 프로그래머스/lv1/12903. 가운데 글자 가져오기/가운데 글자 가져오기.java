class Solution {
    public String solution(String s) {
        String answer = "";
        int mid = (s.length() -1) / 2;
        
        answer += s.charAt(mid);
        
        if(s.length() % 2 == 0) answer += s.charAt(mid + 1);

        return answer;
    }
}