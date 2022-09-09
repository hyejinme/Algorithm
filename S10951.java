import java.util.Scanner;

public class S10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //EOF(End of File)란, 더 이상 읽을 수 있는 데이터가 없음을 나타내는 용어
        //테스트 케이스 개수, 종료 조건이 명시되지 않았기 때문에 EOF 값(True, false)를 리턴
        while (sc.hasNextInt()){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}
