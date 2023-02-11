import java.util.*;

class Solution {
    public boolean solution(int x) {                        
        String[] arr = String.valueOf(x).split("");
        
        int num = 0;
        
        for(String s : arr) num += Integer.parseInt(s);

        if(x % num == 0) return true;
        
        return false;
    }
}