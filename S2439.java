import java.util.Scanner;

public class S2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //N이 5일 때,
        //첫 번째 줄 공백 4, 별 1 - i=1;
        //두 번째 줄 공백 3, 별 2 - i=2;
        //세 번째 줄 공백 2, 별 3 - i=3;
        //네 번째 줄 공백 1, 별 4 - i=4;
        //다섯 번째 줄 공백 0, 별 5 - i=5;
        //i번째 줄에 공백 N-i, 별 i개
        for(int i=1; i<=N; i++) { // i번째 줄에
            for(int j=1; j<=N-i; j++){ // 공백 N-i개
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){ //별 i개
                System.out.print("*");
            }
            System.out.println(""); //줄 바꿈
        }
    }
}
