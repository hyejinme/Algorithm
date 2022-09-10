import java.util.Scanner;

public class S1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = N; //변수 복사(비교를 위해)
        int count = 0;

        // 26을 2와 6으로 쪼개기 26/10 26%10
        while (true) {
            N =  ((N%10)*10)+ (((N/10) + (N%10)) % 10);  // 2+6 = 8, 68
            count++;
            if(N == sum){ // 초기값을 복사해둔 변수(sum)과 N값을 비교해서 같으면 멈춤
                break;
            }
        }
        System.out.println(count);





    }
}
