import java.util.Scanner;

public class S8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 테스트케이스 개수 입력
        String ox = "";

        for(int i=0; i < N; i++){
            ox = sc.next(); // 문자열 입력

            char[] result = new char[ox.length()];
            int score = 0; // 점수
            int count = 0; // 연속 O 횟수

            for (int j=0; j < ox.length(); j++){
                result[j] = ox.charAt(j);
                if(result[j] == 'O'){ // O일 때, count +1
                    count++;

                }else{
                    count = 0; // x면 카운트 초기화
                }
                score += count; // 누적 점수
            }
            System.out.println(score);
        }




    }
}
