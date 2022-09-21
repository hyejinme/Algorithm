import java.util.Scanner;

public class S2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //테스트 케이스 개수

        for(int i=0; i<T; i++){
            int R = sc.nextInt(); //반복 횟수
            String S = sc.next(); //문자열

            char[] ch = new char[S.length()];
            for(int j=0; j<S.length(); j++){
                ch[j] = S.charAt(j);
                for(int k=0; k<R; k++){
                    System.out.print(ch[j]);
                }
            }
            // 테스트 케이스마다 개행이 있어야 함
            System.out.println();
        }
    }
}
