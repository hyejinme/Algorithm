class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int num = 0;
        int a = n;
        int b = m;
        
        while(b != 0) {
            num = a % b;
            a = b;
            b = num;
        }
        
        answer[0] = a;
        answer[1] = n * m / a;
        
        return answer;
    }
}