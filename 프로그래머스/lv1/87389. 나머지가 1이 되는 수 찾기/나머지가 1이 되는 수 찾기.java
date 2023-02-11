import java.util.*; 

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int x=1; x<n; x++) {
            if(n % x == 1) list.add(x); 
        }
        
        Collections.sort(list);
        
        return list.get(0);
    }
}