import java.util.Scanner;

public class S25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); //총 금액
        int N = sc.nextInt(); // 구매한 물건의 종류 수
        int sum = 0; //입력한 총 금액과 비교 할 합계

        for(int i=0; i<N; i++){
            int a = sc.nextInt(); // 각 물건의 가격
            int b = sc.nextInt(); // 각 물건의 개수
            sum += a*b;
        }

        if(X == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
