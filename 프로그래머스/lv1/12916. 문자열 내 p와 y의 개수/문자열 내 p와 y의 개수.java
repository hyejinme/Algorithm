class Solution {
    boolean solution(String s) {
        String str = s.toLowerCase();
        int pCnt = 0;
        int yCnt = 0;
        
        for(char c : str.toCharArray()) {
            if(c == 'p') pCnt++;
            if(c == 'y') yCnt++;
        }
        
        if((pCnt == 0 && yCnt == 0) || (pCnt == yCnt)) return true;

        return false;
    }
}